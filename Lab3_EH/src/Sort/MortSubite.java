package Sort;

import Personnage.Personnage;

import java.util.Random;

public class MortSubite extends Sort{
    private double chanceDeMourir;

    public MortSubite() {
        super("MortSubite", 10);
        this.chanceDeMourir = Math.random();
    }

    @Override
    public void LancerSort(Personnage cible, Sort[] sort) {
        if (chanceDeMourir <= 0.1){
            cible.set_Ptsdevie(0);
            cible.Aptecombat = false;
        }

    }
}
