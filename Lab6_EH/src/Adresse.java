public class Adresse {
    private String numeroPorte;
    private String rue;
    private String appartement;
    private String ville;
    private String codePostal;
    private String province;
    private String pays;

    public Adresse(){
        numeroPorte = "";
        rue = "";
        appartement = "";
        ville = "";
        codePostal = "";
        province = "";
        pays = "";
    }
    public String getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(String numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getAppartement() {
        return appartement;
    }

    public void setAppartement(String appartement) {
        this.appartement = appartement;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        province = province;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}

