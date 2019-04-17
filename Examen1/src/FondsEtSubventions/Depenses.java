package FondsEtSubventions;

import Projet.Projets;

public class Depenses extends FondsEtSubventions{
    protected String description;
    protected Projets projet;

    public Depenses(int montant, String date_echeance, String description, Projets projet) {
        super(montant, date_echeance);
        this.description = description;
        this.projet = projet;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Projets getProjet() {
        return projet;
    }

    public void setProjet(Projets projet) {
        this.projet = projet;
    }
}
