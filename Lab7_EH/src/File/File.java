package File;

public class File {

        private int compteur;
        private JeuFile premier;
        private JeuFile dernier;
        private JeuFile temporaire;
        public File(){}
        public int nbreJeu(){return compteur;}

        public void Add(String jeu){
            if (premier == null){
                premier = new JeuFile();
                premier.Jeu = jeu;
                dernier = premier;
                compteur++;
            }
            else {
                temporaire = new JeuFile();
                temporaire.Jeu = jeu;
                dernier.next = temporaire;
                dernier = temporaire;
                compteur++;
            }
        }

        public String Remove(){
            if (premier == null) {
                return "Aucun jeu dans la file.";
            }
            else if(nbreJeu()==1) {
                String jeu = premier.Jeu;
                premier = null;
                dernier = premier;
                compteur--;
                return "Le jeu " + jeu + "a été retiré du devant de la file.";
            }
            else {
                String jeu = premier.Jeu;
                premier = premier.next;
                compteur--;
                return "Le jeu " + jeu + "a été retiré du devant de la file.";
            }
        }

        public void View(){
            temporaire = premier;
            System.out.println("La file contient les éléments suivants (du premier au dernier), on peut aussi voir la taille: ");

            if (nbreJeu() > 0) {

                for(int i = 0; i < nbreJeu(); i++) {
                    System.out.print(temporaire.Jeu + ", ");
                    temporaire = temporaire.next;
                }
            }
            System.out.println("");
        }

        public void Peek(){
            System.out.println(premier);
        }

        public void Clear(){
            if (nbreJeu() > 0) {

                for (int i = 0; i < nbreJeu(); i++) {
                    temporaire.Jeu = null;
                    temporaire = temporaire.next;
                }
            }
        }

        public void Size(){
            System.out.println(compteur);
        }

    public static void main(String[] args) {
        File F = new File();
        F.Add("Fortnite");
        F.Add("Minecraft");
        F.Remove();
        F.Size();
        F.Size();
    }
}
