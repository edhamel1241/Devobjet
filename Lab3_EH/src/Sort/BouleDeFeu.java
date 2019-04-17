package Sort;

import Personnage.Personnage;

public class BouleDeFeu extends Sort{


    public BouleDeFeu() {
        super("BouleDeFeu", 5);
    }

    @Override
    public void LancerSort(Personnage cible, Sort[] sort) {
        cible.set_Ptsdevie(cible.get_Ptsdevie() - 5);
    }

}
