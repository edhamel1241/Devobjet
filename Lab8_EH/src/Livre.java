import java.util.Comparator;
import java.util.TreeSet;

public class Livre extends TreeSet<Livre> implements Comparable<Livre> {
    protected int ISBN;
    protected String Titre;
    protected String Auteur;
    protected String SousTitre;
    protected String MaisonEdition;
    protected int AnneeProd;

    public Livre(int ISBN, String titre, String auteur, String sousTitre, String maisonEdition, int anneeProd) {
        this.ISBN = ISBN;
        Titre = titre;
        Auteur = auteur;
        SousTitre = sousTitre;
        MaisonEdition = maisonEdition;
        AnneeProd = anneeProd;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String auteur) {
        Auteur = auteur;
    }

    public String getSousTitre() {
        return SousTitre;
    }

    public void setSousTitre(String sousTitre) {
        SousTitre = sousTitre;
    }

    public String getMaisonEdition() {
        return MaisonEdition;
    }

    public void setMaisonEdition(String maisonEdition) {
        MaisonEdition = maisonEdition;
    }

    public int getAnneeProd() {
        return AnneeProd;
    }

    public void setAnneeProd(int anneeProd) {
        AnneeProd = anneeProd;
    }

    @Override
    public int compareTo(Livre T) {
        int compearage = ((Livre)T).AnneeProd;
        return this.AnneeProd - compearage;
    }

    public static Comparator<Livre> ME = new Comparator<Livre>() {
        @Override
        public int compare(Livre s1, Livre s2) {
            String MaisonE1 = s1.getMaisonEdition().toUpperCase();
            String MaisonE2 = s2.getMaisonEdition().toUpperCase();

            return MaisonE1.compareTo(MaisonE2);
        }};

    public static Comparator<Livre> A = new Comparator<Livre>() {

    @Override
    public int compare(Livre s1, Livre s2) {

        String Auteur1 = s1.getAuteur();
        String Auteur2 = s2.getAuteur();

        return Auteur1.compareTo(Auteur2);
    }
};

    public static Comparator<Livre> T = new Comparator<Livre>() {

        @Override
        public int compare(Livre s1, Livre s2) {

            String Titre1 = s1.getTitre();
            String Titre2 = s2.getTitre();

            return Titre1.compareTo(Titre2);
        }
    };

    public static Comparator<Livre> AP = new Comparator<Livre>() {

        @Override
        public int compare(Livre s1, Livre s2) {

            int AnneePub1 = s1.getAnneeProd();
            int AnneePub2 = s2.getAnneeProd();

            return AnneePub1 - AnneePub2;
        }
    };
    @Override
    public String toString(){
        return "[ Année de production: " + AnneeProd +
                ", Auteur: " + Auteur + ", Titre: " + Titre +
                ", Maison d'édition: " + MaisonEdition + "]";
    }
}

