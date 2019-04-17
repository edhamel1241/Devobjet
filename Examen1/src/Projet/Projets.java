package Projet;

public class Projets {

    protected final String nom;
    protected String date_Echeance;
    protected int budget;

    protected String status;

    public Projets(String nom, String date_Echeance, int budget, String status) {
        this.nom = nom;
        this.date_Echeance = date_Echeance;
        this.budget = budget;
        this.status = status;
    }

    public String getNom() {
        return nom;
    }

    public String getDate_Echeance() {
        return date_Echeance;
    }

    public void setDate_Echeance(String date_Echeance) {
        this.date_Echeance = date_Echeance;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void NouveauProjet(){
        System.out.println("Je créé un nouveau projet");
    }
}
