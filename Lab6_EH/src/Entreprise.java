public class Entreprise {
    private String nomEntreprise;
    private  Adresse adresseEntreprise;

    public Entreprise() {
        nomEntreprise = "";
        adresseEntreprise = new Adresse();
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public Adresse getAdresseEntreprise() {
        return adresseEntreprise;
    }

    public void setAdresseEntreprise(Adresse adresseEntreprise) {
        this.adresseEntreprise = adresseEntreprise;
    }
}
