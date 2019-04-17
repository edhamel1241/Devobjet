package FondsEtSubventions;

public class FondsEtSubventions {

    protected int montant;
    protected String date_echeance;

    public FondsEtSubventions(int montant, String date_echeance) {
        this.montant = montant;
        this.date_echeance = date_echeance;
    }

    public int getMontant() {
        return montant;
    }

    public String getDate_echeance() {
        return date_echeance;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }

    public void setDate_echeance(String date_echeance) {
        this.date_echeance = date_echeance;
    }
}
