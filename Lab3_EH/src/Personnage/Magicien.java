package Personnage;

import Sort.Sort;

public abstract class Magicien extends Personnage{

    protected int _Ptsdemagie;

    public Magicien(String _nom, int _Ptsdevie, int _Ptsdedef, int _Ptsdemagie) {
        super(_nom, _Ptsdevie, _Ptsdedef);
        this._Ptsdemagie = _Ptsdemagie;
    }

    public int get_Ptsdemagie() {
        return _Ptsdemagie;
    }

    public void set_Ptsdemagie(int _Ptsdemagie) {
        this._Ptsdemagie = _Ptsdemagie;
    }

    public void LancerSort(Personnage cible, Sort sort[]){

    }
}
