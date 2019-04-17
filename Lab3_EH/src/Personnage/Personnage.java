package Personnage;

public abstract class Personnage {

    protected final String _nom;
    protected int _Ptsdevie;
    protected final int _Ptsdedef;
    public boolean Aptecombat;

    public Personnage(String _nom, int _Ptsdevie, int _Ptsdedef) {
        this._nom = _nom;
        this._Ptsdevie = _Ptsdevie;
        this._Ptsdedef = _Ptsdedef;

    }

    public String get_nom() {
        return _nom;
    }

    public int get_Ptsdevie() {
        return _Ptsdevie;
    }
    public void set_Ptsdevie(int _Ptsdevie) {
        this._Ptsdevie = _Ptsdevie;
    }

    public int get_Ptsdedef() {
        return _Ptsdedef;
    }

    public abstract void Attaquer();


}
