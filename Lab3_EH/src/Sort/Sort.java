package Sort;

import Personnage.Personnage;

public abstract class Sort {

    protected final String nom;
    protected int Cout;

    public Sort(String nom, int cout) {
        this.nom = nom;
        Cout = cout;
    }

    public String getNom() {
        return nom;
    }

    public int getCout() {
        return Cout;
    }

    public void setCout(int cout) {
        Cout = cout;
    }

    public abstract void LancerSort(Personnage cible, Sort sort[]);
}
