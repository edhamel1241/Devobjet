package Employe;
import FondsEtSubventions.FondsEtSubventions;
import FondsEtSubventions.Subventions;
import FondsEtSubventions.Depenses;
import Projet.Projets;

public class Administrateurs extends Employes{

    private Depenses ListeDepenses[] = new Depenses[15];
    private Subventions ListeSuventions[] = new Subventions[15];

    public Administrateurs(String nom, int num_employes, int nbr_ans_exp, int salaire_annuel, Projets projet_assigne, Depenses ListeDepenses[], Subventions ListeSubventions[]) {
        super(nom, num_employes, nbr_ans_exp, salaire_annuel, projet_assigne);
        this.ListeDepenses = ListeDepenses;
        this.ListeSuventions = ListeSubventions;
    }

    public Depenses[] getListeDepenses() {
        return ListeDepenses;
    }

    public void setListeDepenses(Depenses[] listeDepenses) {
        ListeDepenses = listeDepenses;
    }

    public Subventions[] getListeSuventions() {
        return ListeSuventions;
    }

    public void setListeSuventions(Subventions[] listeSuventions) {
        ListeSuventions = listeSuventions;
    }

    public void Compilerbilan(){

    }
}
