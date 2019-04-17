package LinkedList;

public class Linkedlist implements Interfacelist{
    public Jeu devant;
    public int nbreJeu;

    public Linkedlist() {
        devant = new Jeu("");
        nbreJeu = 0;
    }

    public void show(){
        Jeu enAnalyse = devant;
        while(enAnalyse.next != null){
            System.out.print(enAnalyse + " - ");
            enAnalyse = enAnalyse.next;
        }
        System.out.println(enAnalyse);
    }



    public boolean add(String x){
        Jeu fin = new Jeu(x);
        Jeu enAnalyse = devant;

        while(enAnalyse.next != null){
            enAnalyse = enAnalyse.next;
        }

        enAnalyse.next = fin;
        nbreJeu++;

        System.out.println(x + " a été ajouté.");
        return true;
    }

    public boolean add(String x,int index){
        Jeu fin = new Jeu(x);
        Jeu enAnalyse = devant;
        int nextJeu;

        if(index > nbreJeu || index < 1){
            System.out.println("La LinkedList n'a pas assez d'espace");
            return false;
        }

        else{
            nextJeu = 0;
            while(nextJeu < index-1){
                enAnalyse = enAnalyse.next;
                nextJeu++;
            }
            enAnalyse.next = enAnalyse.next;
            enAnalyse.next = fin;
            nbreJeu++;
            System.out.println(x + " est ajouté à l'index " + index);
            return true;
        }
    }

    public boolean removeNom(String x){
        Jeu enAnalyse = devant;
        while(enAnalyse.next!=null){
            if(enAnalyse.next.jeu == x){
                enAnalyse.next = enAnalyse.next.next;
                nbreJeu--;
                System.out.println(x + " est maintenant supprimé de la liste.");
                return true;
            }
            enAnalyse = enAnalyse.next;
        }
        System.out.println("Aucune information trouvé avec cette information");
        return false;
    }

    public boolean removeIndex(int index){
        Jeu enAnalyse = devant;
        int nextJeu;
        if(index > nbreJeu || index < 1){
            System.out.println("Aucune information trouvé à l'index.");
            return false;
        }
        else{
            nextJeu = 0;
            while(nextJeu < index-1){
                enAnalyse = enAnalyse.next;
                nextJeu++;
            }
            enAnalyse.next = enAnalyse.next.next;
            System.out.println("Le jeu à l'index " + index + " a été supprimé.");
            nbreJeu--;
            return true;
        }
    }

    @Override
    public void remove(String x) {

    }

    @Override
    public void get() {

    }

    public static void main(String[] args) {
        Linkedlist LL = new Linkedlist();
        LL.add("Fortnite");
        LL.removeNom("Fortnite");
        LL.add("NBA2k19");
        LL.removeIndex(1);
    }
}

