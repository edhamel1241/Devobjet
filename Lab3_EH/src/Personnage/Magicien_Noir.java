package Personnage;

import Sort.Sort;

public class Magicien_Noir extends Magicien{

    Sort sort[] = {Sort.PicDeGlace, Sort.BouleDeFeu};

    public Magicien_Noir(String _nom, int _Ptsdevie, int _Ptsdedef, int _Ptsdemagie) {
        super(_nom, _Ptsdevie, _Ptsdedef, _Ptsdemagie);
    }

    @Override
    public void Attaquer() {

    }
}
