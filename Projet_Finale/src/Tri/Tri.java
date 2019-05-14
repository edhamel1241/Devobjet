package Tri;

import Dechet.*;
import Vaisseau.Vaisseau;

import java.io.File;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Stack;

public class Tri {
    private Stack<Gadolinium> nbreGadolinium;
    private Stack<Neptunium> nbreNeptunium;
    private Stack<Plutonium> nbrePlutonium;
    private Stack<Terbium> nbreTerbium;
    private Stack<Thulium> nbreThulium;
    private Stack<Dechet> nbreTotal;
    protected File vaisseaux;

    public Tri() {
        this.nbreGadolinium = nbreGadolinium;
        this.nbreNeptunium = nbreNeptunium;
        this.nbrePlutonium = nbrePlutonium;
        this.nbreTerbium = nbreTerbium;
        this.nbreThulium = nbreThulium;
        this.vaisseaux = vaisseaux;
        this.nbreTotal = nbreTotal;
    }

    public Stack<Gadolinium> getNbreGadolinium() {
        return nbreGadolinium;
    }

    public void setNbreGadolinium(Stack<Gadolinium> nbreGadolinium) {
        this.nbreGadolinium = nbreGadolinium;
    }

    public Stack<Neptunium> getNbreNeptunium() {
        return nbreNeptunium;
    }

    public void setNbreNeptunium(Stack<Neptunium> nbreNeptunium) {
        this.nbreNeptunium = nbreNeptunium;
    }

    public Stack<Plutonium> getNbrePlutonium() {
        return nbrePlutonium;
    }

    public void setNbrePlutonium(Stack<Plutonium> nbrePlutonium) {
        this.nbrePlutonium = nbrePlutonium;
    }

    public Stack<Terbium> getNbreTerbium() {
        return nbreTerbium;
    }

    public void setNbreTerbium(Stack<Terbium> nbreTerbium) {
        this.nbreTerbium = nbreTerbium;
    }

    public Stack<Thulium> getNbreThulium() {
        return nbreThulium;
    }

    public void setNbreThulium(Stack<Thulium> nbreThulium) {
        this.nbreThulium = nbreThulium;
    }

    public File getVaisseaux() {
        return vaisseaux;
    }

    public void setVaisseaux(File vaisseaux) {
        this.vaisseaux = vaisseaux;
    }

    public Stack<Dechet> getNbreTotal() { return nbreTotal; }

    public void setNbreTotal(Stack<Dechet> nbreTotal) { this.nbreTotal = nbreTotal; }

    public void Triage(Tri[] centreDetris, int capaciteMaxDechet, Vaisseau[] tabVaisseaux, int i) {

        boolean Rempli = false;
        int gad = 0;
        int nep = 0;
        int plut = 0;
        int terb = 0;
        int thulium = 0;
        for (int k = 0; i < tabVaisseaux.length; ++i) {
            while (!Rempli) {
                for (int y = 0; y < tabVaisseaux[i].getDechetsVaisseau().length; y++) {
                    if (tabVaisseaux[i].getDechetsVaisseau() != null) {
                        if (tabVaisseaux[i].getDechetsVaisseau()[y] instanceof Gadolinium) {
                            centreDetris[i].nbreGadolinium.add(new Gadolinium());
                            centreDetris[i].nbreTotal.add(new Gadolinium());
                            ++gad;
                        } else if (tabVaisseaux[i].getDechetsVaisseau()[y] instanceof Neptunium) {
                            centreDetris[i].nbreNeptunium.add(new Neptunium());
                            centreDetris[i].nbreTotal.add(new Neptunium());
                            ++nep;
                        } else if (tabVaisseaux[i].getDechetsVaisseau()[y] instanceof Plutonium) {
                            centreDetris[i].nbrePlutonium.add(new Plutonium());
                            centreDetris[i].nbreTotal.add(new Plutonium());
                            ++plut;
                        } else if (tabVaisseaux[i].getDechetsVaisseau()[y] instanceof Terbium) {
                            centreDetris[i].nbreTerbium.add(new Terbium());
                            centreDetris[i].nbreTotal.add(new Terbium());
                            ++terb;
                        } else if (tabVaisseaux[i].getDechetsVaisseau()[y] instanceof Thulium) {
                            centreDetris[i].nbreThulium.add(new Thulium());
                            centreDetris[i].nbreTotal.add(new Thulium());
                            ++thulium;
                        } else if (centreDetris[i].nbreTotal.size() == capaciteMaxDechet * 5) {
                            Rempli = true;
                        }
                    }
                }
            }
        }
        for (int j = 0; j < (new Gadolinium().getPourcentageRecyclable() * gad) / 100; ++j) {
            centreDetris[i].nbreGadolinium.pop();

        }
        for (int j = 0; j < (new Neptunium().getPourcentageRecyclable() * nep) / 100; ++j) {
            centreDetris[i].nbreNeptunium.pop();
        }
        for (int j = 0; j < (new Plutonium().getPourcentageRecyclable() * plut) / 100; ++j) {
            centreDetris[i].nbrePlutonium.pop();
        }
        for (int j = 0; j < (new Terbium().getPourcentageRecyclable() * terb) / 100; ++j) {
            centreDetris[i].nbreTerbium.pop();
        }
        for (int j = 0; j < (new Thulium().getPourcentageRecyclable() * thulium) / 100; ++j) {
            centreDetris[i].nbreThulium.pop();
        }
    }
}


