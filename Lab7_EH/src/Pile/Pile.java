package Pile;

public class Pile {
    int max;
    String[] nomJeu;

    public Pile(int capacite) {
        nomJeu = new String[capacite];
        max = -1;
    }
    public String Peek() {
        return nomJeu[max];
    }

    public boolean Empty() {
        if (max == -1) {
            return true;
        }
        return false;
    }

    public boolean Full() {
        if (max == nomJeu.length) {
            return true;
        }
        return false;
    }

    public void Push(String element) {
        if (Full())
            System.out.println("La pile est pleine.");
        nomJeu[max + 1] = element;
        max++;
    }

    public String Pop() {
        if (Empty())
            System.out.println("La pile est vide.");
        max--;
        return nomJeu[max + 1];
    }
    public void clear() {
        for (int i = 0; i <= max; i++) {
            nomJeu[i] = null;
        }

        max = Integer.parseInt(null);
    }

    public int size() {
        return max;     } }