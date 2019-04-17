import Employe.Administrateurs;
import Employe.Employes;
import Employe.Superviseurs;
import FondsEtSubventions.Depenses;
import FondsEtSubventions.Subventions;
import Projet.Projets;

public class Main {

    public static void main(String[] args) {
        Projets projet = new Projets("Savage",
                                    "20/02/2020",
                                    50000,
                                    "En cours");

        Subventions subventions = new Subventions(50000,
                                                "20/05/2021",
                                                2051);
        Depenses depenses = new Depenses(40000,
                                        "20/02/2048",
                                        "Outils (très couteux) brisés",
                                        projet);

        Depenses[] ListeDepenses = new Depenses[15];
        Subventions[] ListeSubventions = new Subventions[15];
        ListeSubventions[1] = subventions;
        ListeDepenses[1] = depenses;


        Employes[] ListeEmployes = {
                new Employes("Jean-Sebastien",
                        26,
                        2,
                        25000,
                         projet),
                new Administrateurs("Mathieu",
                                    28,
                                    10,
                                    40000, projet,
                                    ListeDepenses, ListeSubventions),
                new Superviseurs("Simon",
                                23,
                                7,
                                32000,  projet, ),
                                    new Employes("Patrick", 24, 1, 15000, projet),
                                    new Employes("Mathilde", 27, 4, 10000, projet),
                                    new Employes("Mathilde", 27, 4, 10000, projet)};


                System.out.println("==========================");
                System.out.println(ListeEmployes.);


    }
}

