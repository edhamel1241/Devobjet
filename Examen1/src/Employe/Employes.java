package Employe;

import Projet.Projets;

public class Employes {
    protected String nom;
    protected int num_employes;
    protected int nbr_ans_exp;
    protected int salaire_annuel;
    protected Projets projet_assigne;

    public Employes(String nom, int num_employes, int nbr_ans_exp, int salaire_annuel, Projets projet_assigne) {
        this.nom = nom;
        this.num_employes = num_employes;
        this.nbr_ans_exp = nbr_ans_exp;
        this.salaire_annuel = salaire_annuel;
        this.projet_assigne = projet_assigne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNum_employes() {
        return num_employes;
    }

    public void setNum_employes(int num_employes) {
        this.num_employes = num_employes;
    }

    public int getNbr_ans_exp() {
        return nbr_ans_exp;
    }

    public void setNbr_ans_exp(int nbr_ans_exp) {
        this.nbr_ans_exp = nbr_ans_exp;
    }

    public int getSalaire_annuel() {
        return salaire_annuel;
    }

    public void setSalaire_annuel(int salaire_annuel) {
        this.salaire_annuel = salaire_annuel;
    }

    public Projets getProjet_assigne() {
        return projet_assigne;
    }

    public void setProjet_assigne(Projets projet_assigne) {
        this.projet_assigne = projet_assigne;
    }
}
