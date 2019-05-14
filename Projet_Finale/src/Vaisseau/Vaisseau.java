package Vaisseau;

import Dechet.*;

public abstract class Vaisseau {
    private String nom;
    private String type;
    private int capacite;
    protected Dechet[] dechetsVaisseau = new Dechet[capacite];

    public Dechet[] getDechetsVaisseau() {
        return dechetsVaisseau;
    }

    public void setDechetsVaisseau(Dechet[] dechetsVaisseau) {
        this.dechetsVaisseau = dechetsVaisseau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public Vaisseau() {

        this.nom = nom;
        this.type = type;
        this.capacite = capacite;
        this.dechetsVaisseau = dechetsVaisseau;
    }
}
