package Sort;

import Personnage.Personnage;

public class PicDeGlace extends Sort {

    public PicDeGlace() {
        super("PicDeGlace", 5);
    }

    @Override
    public void LancerSort(Personnage cible, Sort[] sort) {
        cible.set_Ptsdevie(cible.get_Ptsdevie() - 7);
    }
}
