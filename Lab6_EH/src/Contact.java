public class Contact {
    private String prenom;
    private String nom;
    private Adresse adresseContact;
    private Occupation occupationContact;
    private Telephone[] telephone = new Telephone[10];
    private Entreprise entreprise;

    public Contact(){
        prenom = "";
        nom = "";
        adresseContact = new Adresse();
        occupationContact = new Occupation();
        for (int i = 0; i < telephone.length; i++){
            telephone[i] = new Telephone();
        }
        entreprise = new Entreprise();

    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresseContact() {
        return adresseContact;
    }

    public void setAdresseContact(Adresse adresseContact) {
        this.adresseContact = new Adresse();
    }

    public Occupation getOccupationContact() {
        return occupationContact;
    }

    public void setOccupationContact(Occupation occupationContact) {
        this.occupationContact = occupationContact;
    }

    public Telephone getTelephone(int numCase) {
        return telephone[numCase];
    }

    public void setTelephone(Telephone tabTelephone, int numCase) {
        this.telephone[numCase] = tabTelephone;
    }
}
