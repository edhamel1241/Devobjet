import Planete.*;
import Tri.Tri;
import Vaisseau.*;
import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.w3c.dom.Document;

import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.*;
import javax.xml.parsers.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerException;

import org.w3c.dom.Document;

public class Simulation {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Vous entrez maintenant dans la simulation d'ecploration et restoration des planètes. Pour se faire, vous devrez décider combien de vaisseau vont se déployer et combien de centres de tris seront présents dans la simulation.");
        System.out.println("Premièrement, combien det vaisseaux voulez-vous déployer?");
        Vaisseau tabVaissaux[] = new Vaisseau[scan.nextInt()];
        for (int i = 0; i < tabVaissaux.length; ++i) {
            int randInt = rand.nextInt(3) + 1;
            if (randInt == 1)
                tabVaissaux[i] = new Vaisseau_leger();
            else if (randInt == 2)
                tabVaissaux[i] = new Vaisseau_normal();
            else
                tabVaissaux[i] = new Vaisseau_lourd();
        }
        int leger = 0;
        int moyen = 0;
        int lourd = 0;
        for (int i = 0; i < tabVaissaux.length; ++i) {
            if (tabVaissaux[i] instanceof Vaisseau_leger)
                ++leger;
            else if (tabVaissaux[i] instanceof Vaisseau_normal)
                ++moyen;
            else if (tabVaissaux[i] instanceof Vaisseau_lourd)
                ++lourd;
        }
        System.out.println("Voici vos vaisseaux pour la simulation:" +
                "\nVaisseau Leger: " + leger +
                "\nVaisseau Normal: " + moyen +
                "\nVaisseau Lourd: " + lourd);;

        System.out.println("Dans la simulation, il y aura présence de 5 planètes (Uranus, Jupiter, Mars, Vénus et Saturne), vos vaisseaux iront explorer aléatoirement une des cinq planètes");
        System.out.println("Dans la simulation il y aura également des centres de tris, vous devez déterminer le nombre de centre de tri. Combien en voulez-vous? ");
        Tri[] centreDetris = new Tri[scan.nextInt()];
        Tri Centretrier = new Tri();

        //Jupiter = 1, Mars = 2, Saturne = 3, Uranus = 4, Vénus = 5

        for (int i = 0; i < tabVaissaux.length; ++i) {
            int randInt = rand.nextInt(5) + 1;
            if (randInt == 1) {
                Planete Jupiter = new Jupiter();
                Jupiter.exploration(tabVaissaux[i], tabVaissaux[i].getDechetsVaisseau());
            } else if (randInt == 2) {
                Planete Mars = new Mars();
                Mars.exploration(tabVaissaux[i], tabVaissaux[i].getDechetsVaisseau());
            } else if (randInt == 3) {
                Planete Saturne = new Saturne();
                Saturne.exploration(tabVaissaux[i], tabVaissaux[i].getDechetsVaisseau());
            } else if (randInt == 4) {
                Planete Uranus = new Uranus();
                Uranus.exploration(tabVaissaux[i], tabVaissaux[i].getDechetsVaisseau());
            } else if (randInt == 5) {
                Planete Venus = new Venus();
                Venus.exploration(tabVaissaux[i], tabVaissaux[i].getDechetsVaisseau());
            }
        }
        for (int i = 0; i < centreDetris.length; ++i){
            try{
                centreDetris[i].Triage(centreDetris,100,tabVaissaux,i);
            } catch(NullPointerException e){
                System.out.println(e);

            }
        }


        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        try{

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
            Document document = documentBuilder.newDocument();

            File file = new File("M:\\DevObjJava\\Projet_Finale\\src\\Simulation_" + dateFormat.format(date) + ".dat");
            FileOutputStream out = new FileOutputStream(file);
        }
        catch (IOException e){
            System.out.println(e);
        }
        catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        }
    }
}


