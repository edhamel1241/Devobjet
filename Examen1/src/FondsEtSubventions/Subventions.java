package FondsEtSubventions;

public class Subventions extends FondsEtSubventions{
    private int code;
    private String nom_echeance;

    public Subventions(int montant, String date_echeance, int code) {
        super(montant, date_echeance);
        this.code = code;
        this.date_echeance = date_echeance;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom_echeance() {
        return nom_echeance;
    }

    public void setNom_echeance(String nom_echeance) {
        this.nom_echeance = nom_echeance;
    }
}
