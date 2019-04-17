import javax.management.ListenerNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Livre livre1 = new Livre(412, "Piratage", "Jean Delaprairie", "Jambon", "PS VM", 2015);
        Livre livre2 = new Livre(723, "Plamanoid", "Jean Delatombe", "Poire", "VM PS", 2010);
        Livre livre3 = new Livre(462, "Plasmatic", "Jean Delamaison", "Mangue", "PV SM", 1954);
        Livre livre4 = new Livre(261, "Warrior", "Jean Dujardin", "Pomme", "VP MS", 1874);
        Livre livre5 = new Livre(923, "Malmener", "Jean Delarue", "Tomate", "NS HG", 1543);
        Livre livre6 = new Livre(175, "MGLG", "Jean Delafenetre", "Concombre", "GJ SH", 1999);
        Livre livre7 = new Livre(921, "Napoleon", "Jean Delasavane", "Banane", "JH SJ", 1997);
        Livre livre8 = new Livre(564, "Hunter", "Jean Delaforet", "Raisin", "PH SJ", 1894);
        Livre livre9 = new Livre(158, "Chased", "Jean Delagrotte", "Fraise", "BF MS", 2002);
        Livre livre10 = new Livre(063, "Cornered", "Jean Delossobucco", "Bleuet", "UZ PA", 2019);

        Livre[] arr1 = {livre1,livre2,livre2,livre3,livre4,livre5,livre6,livre7,livre8,livre9,livre10};
        Livre[] arr2 = Selection.Selection(arr1);
        for(Livre i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }

        ArrayList<Livre> liste = new ArrayList<Livre>();
        liste.add(livre1);
        liste.add(livre2);
        liste.add(livre3);
        liste.add(livre4);
        liste.add(livre5);
        liste.add(livre6);
        liste.add(livre7);
        liste.add(livre8);
        liste.add(livre9);
        liste.add(livre10);

        //Comparable

        Collections.sort(liste);

        //Comparator

        //Auteur
        Collections.sort(liste, Livre.A);
        //Année publication
        Collections.sort(liste, Livre.AP);
        //Maison Édition
        Collections.sort(liste, Livre.ME);
        //Titre
        Collections.sort(liste, Livre.T);

        //TreeSet1
        TreeSet<Livre> ts = new TreeSet<Livre>();

        ts.add(livre1);
        ts.add(livre2);
        ts.add(livre3);
        ts.add(livre4);
        ts.add(livre5);
        ts.add(livre6);
        ts.add(livre7);
        ts.add(livre8);
        ts.add(livre9);
        ts.add(livre10);

        System.out.println(ts.toString());

        //TreeSet2
        Set<Livre> treeset2 = new TreeSet<>(new Comparator<Livre>() {
            @Override
            public int compare(Livre o1, Livre o2) {
                int anneeProd1 = o1.getAnneeProd();
                int anneProd2 = o2.getAnneeProd();

                return anneeProd1 - anneProd2;
            }
        });
    }
}
