package Employe;

import Projet.Projets;

public class Superviseurs extends Employes{

    public Employes ListeChercheur[] = new Employes[15];

    public Superviseurs(String nom, int num_employes, int nbr_ans_exp, int salaire_annuel, Projets projet_assigne, Employes ListeChercheur[]   ) {
        super(nom, num_employes, nbr_ans_exp, salaire_annuel, projet_assigne);
        this.ListeChercheur = ListeChercheur;
    }

    public Employes[] getListeChercheur() {
        return ListeChercheur;
    }

}
