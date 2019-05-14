package Dechet;

public abstract class Dechet {
    private String nom;
    private double masseVolumique;
    private int pourcentageRecyclable;

    public Dechet() {
        this.nom = nom;
        this.masseVolumique = masseVolumique;
        this.pourcentageRecyclable = pourcentageRecyclable;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getMasseVolumique() {
        return masseVolumique;
    }

    public void setMasseVolumique(double masseVolumique) {
        this.masseVolumique = masseVolumique;
    }

    public int getPourcentageRecyclable() {
        return pourcentageRecyclable;
    }

    public void setPourcentageRecyclable(int pourcentageRecyclable) {
        this.pourcentageRecyclable = pourcentageRecyclable;
    }
}
