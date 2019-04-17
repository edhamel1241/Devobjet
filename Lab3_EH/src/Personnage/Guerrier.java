package Personnage;

public abstract class Guerrier extends Personnage {

    protected int _Ptsdeforce;

    public Guerrier(String _nom, int _Ptsdevie, int _Ptsdedef, int _Ptsdeforce) {
        super(_nom, _Ptsdevie, _Ptsdedef);
        this._Ptsdeforce = _Ptsdeforce;
    }

    public int get_Ptsdeforce() {
        return _Ptsdeforce;
    }

    public void Attaquer(Personnage cible, Guerrier attaquant){
        cible.set_Ptsdevie(cible.get_Ptsdevie() - (attaquant.get_Ptsdeforce() * 2));
    }
}
