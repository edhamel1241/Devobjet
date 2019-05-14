package Planete;

import Dechet.*;
import Vaisseau.Vaisseau;

import java.util.Random;

public abstract class Planete {
    private String nom;
    private int pourcentagePlutonium;
    private int pourcentageGadolinium;
    private int pourcentageThulium;
    private int pourcentageTerbium;
    private int pourcentageNeptunium;

    public Planete() {
        this.pourcentagePlutonium = pourcentagePlutonium;
        this.pourcentageGadolinium = pourcentageGadolinium;
        this.pourcentageThulium = pourcentageThulium;
        this.pourcentageTerbium = pourcentageTerbium;
        this.pourcentageNeptunium = pourcentageNeptunium;
        this.nom = nom;
    }

    public int getPourcentagePlutonium() {
        return pourcentagePlutonium;
    }

    public void setPourcentagePlutonium(int pourcentagePlutonium) {
        this.pourcentagePlutonium = pourcentagePlutonium;
    }

    public int getPourcentageGadolinium() {
        return pourcentageGadolinium;
    }

    public void setPourcentageGadolinium(int pourcentageGadolinium) {
        this.pourcentageGadolinium = pourcentageGadolinium;
    }

    public int getPourcentageThulium() {
        return pourcentageThulium;
    }

    public void setPourcentageThulium(int pourcentageThulium) {
        this.pourcentageThulium = pourcentageThulium;
    }

    public int getPourcentageTerbium() {
        return pourcentageTerbium;
    }

    public void setPourcentageTerbium(int pourcentageTerbium) {
        this.pourcentageTerbium = pourcentageTerbium;
    }

    public int getPourcentageNeptunium() {
        return pourcentageNeptunium;
    }

    public void setPourcentageNeptunium(int pourcentageNeptunium) {
        this.pourcentageNeptunium = pourcentageNeptunium;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void exploration(Vaisseau vaisseau,Dechet[] dechetsVaisseau) {
        dechetsVaisseau = new Dechet[vaisseau.getCapacite()];
        Random rand = new Random();

        for (int i = 0; i < vaisseau.getCapacite(); ++i){
            int chiffre = rand.nextInt(100)+1;
            if (chiffre <= getPourcentageNeptunium()){
                dechetsVaisseau[i] = new Neptunium();
            }
            else if (chiffre <= getPourcentagePlutonium() ){
                dechetsVaisseau[i] = new Plutonium();
            }
            else if (chiffre <= getPourcentageTerbium()){
                dechetsVaisseau[i] = new Terbium();
            }
            else if (chiffre <= getPourcentageThulium()){
                dechetsVaisseau[i] = new Thulium();
            }
            else if (chiffre <= getPourcentageGadolinium()){
                dechetsVaisseau[i] = new Gadolinium();
            }
        }
    }
}
