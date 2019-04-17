package Arraylist;

import com.sun.org.apache.xpath.internal.operations.String;

public class Arraylist<nomJeu> implements Interfacelist{
    public nomJeu[] Array;

    public Arraylist() {
        Array = (nomJeu[]) new String[0];
    }

    public void add(nomJeu t) {

        nomJeu[] temporaire = (nomJeu[]) new String[Array.length + 1];

        //Ici je transfers mon array dans le nouveau
        for (int i = 0; i < Array.length; i++) {
            temporaire[i] = Array[i];
        }

        //J'ajoute le nouveau jeu
        temporaire[Array.length] = t;
        Array = temporaire;
    }

    public void remove(int index) {
        if (index < 0 || index >= Array.length)
            return;

        nomJeu[] temp = (nomJeu[]) new String[Array.length - 1];

        boolean trouver = false;

        //Ici je transfert l'information à mon nouveau jeu
        for (int i = 0; i < Array.length; i++) {

            if (i == index) {
                trouver = true;
                continue;
            }
            temp[i - (trouver ? 1 : 0)] = Array[i];
        }
        Array = temp;
    }

    public nomJeu get(int index) {
        return Array[index];
    }

    public static void main(String[] args) {
        Arraylist AL = new Arraylist();
        AL.add("Fortnite");
        AL.get(1);
        AL.remove(1);
    }

    @Override
    public void show() {

    }

    @Override
    public void removeNom() {

    }

    @Override
    public void removeIndex() {

    }
}
