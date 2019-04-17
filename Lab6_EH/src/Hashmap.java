import java.util.*;
//Mon programme initiale n'était pas fonctionnel, j'en ai donc créé un nouveau sans le refaire en entier, mais en gardant
//l'idée du lab de voir notre compréhension par rapport à la nouvelle théorie.

public class Hashmap {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        boolean fin = false;
        int nmeroContact = 1;

        while(fin == false){

            Contact listeContact[] = new Contact[20];


            System.out.println("Voudriez-vous ajouter un contact? 1-Oui 2-Non");
            int choix = clavier.nextInt();


            if (choix == 1){
                System.out.println("Prénom : ");
                String prenom = clavier.next();

                hmap.put(nmeroContact, prenom);


                //On peut ensuite demander les autres informations (nom, numéro de téléphone, adresse, code postal, etc...)

            }

            System.out.println("Voudriez-vous voir la liste de contact? 1-Oui 2-Non");
            int choix2 = clavier.nextInt();


            if (choix2 == 1){

                Set set = hmap.entrySet();
                Iterator iterator = set.iterator();

                while (iterator.hasNext()){
                    Map.Entry mentry = (Map.Entry)iterator.next();
                    System.out.print("\n" + mentry.getKey() + ": " + mentry.getValue());
                }

            }

            //etc....

            System.out.println("\nSouhaiteriez-vous supprimer un contact? 1-Oui 2-Non");
            int choix3 = clavier.nextInt();

            if (choix3 == 1){
                System.out.println("\nQuel contact souhaitez-vous supprimer(Chiffre)?");
                int choix4 = clavier.nextInt();
                hmap.remove(choix4);
            }

            //Si on réaffiche la liste des contacts, le contact n'est plus là

            Set set2 = hmap.entrySet();
            Iterator iterator = set2.iterator();
            while (iterator.hasNext()){
                Map.Entry mentry = (Map.Entry)iterator.next();
                System.out.print("\n" + mentry.getKey() + ": " + mentry.getValue());
            }

            //Maintenant, la arraylist, ce serais plus élaboré avec le vrai pogramme, mais le mien n'est pas fonctionnel

            ArrayList<String> nTelephone = new ArrayList<String>();

            System.out.println("\nÀ quel contact souhaitez-vous ajouter un numéro?");
            int choix6 = clavier.nextInt();

            System.out.println("Quel est son numéro de téléphone?");
            String numero = clavier.next();
            //J'ai positionné le numéro avec sa position dans la liste de contact
            nTelephone.add("1");
            nTelephone.add((choix6-1), numero);

            //La liste de priorité...
            //Je la fais avec les contacts

            System.out.println("Voudriez-vous voir les contacts en ordre alphabétique? 1-Oui 2-Non");
            int choix7 = clavier.nextInt();

            if (choix7 == 1){

                PriorityQueue<String> nomAlphabetique = new PriorityQueue<>();

                nomAlphabetique.add(hmap.get(nmeroContact));

                Iterator iterator2 = nomAlphabetique.iterator();
                while (iterator2.hasNext()){
                    System.out.println("\n" + iterator2.next());
                }

            }

            nmeroContact +=1;
        }

    }
}
