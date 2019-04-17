package Sort;

import Personnage.Personnage;

public class Empoisonnement extends Sort{

    protected int degat;

    public Empoisonnement() {
        super("Empoisonnement", 2);
        this.degat = 2;
    }

    @Override
    public void LancerSort(Personnage cible, Sort[] sort) {
        cible.set_Ptsdevie(cible.get_Ptsdevie() - degat);
        degat += 2;
    }
}
