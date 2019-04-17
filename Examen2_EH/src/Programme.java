import javax.sound.sampled.Line;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Programme {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("==- Bienvenue dans le UserCleaner -==");
        System.out.println("Veuillez entrer le path de votre fichier : ");
        String path = clavier.next();

        String ligne = "";
        FileReader fr = null;
        BufferedReader bufferedReader = null;

        Information[] info = new Information[20000000];
        List<Information> triparNom = new ArrayList<Information>();

        try{
            File passwd = new File(path);
            fr = new FileReader(passwd);
            bufferedReader = new BufferedReader(fr);
        } catch (FileNotFoundException ex){
            System.out.println(ex + "\n-Votre path n'existe pas-");
        }

        int compteur = 0;

        try{
            while ((ligne = bufferedReader.readLine()) != null){
                String[] chaqueinfo = ligne.split(" ");
                String[] infoSeparer = chaqueinfo[0].split(":");

                triparNom.add(new Information(
                        infoSeparer[0],
                        infoSeparer[1],
                        infoSeparer[2],
                        infoSeparer[3],
                        infoSeparer[4],
                        infoSeparer[5],
                        infoSeparer[6]));


                info[compteur].setUsername(infoSeparer[0]);
                info[compteur].setPassword(infoSeparer[1]);
                info[compteur].setUserID(infoSeparer[2]);
                info[compteur].setGroupID(infoSeparer[3]);
                info[compteur].setUserInfos(infoSeparer[4]);
                info[compteur].setHomeDirectory(infoSeparer[5]);
                info[compteur].setCommand(infoSeparer[6]);

                compteur++;
            }
        }catch (IOException ex){
            System.out.println(ex + "\n-Fichier original n'a pas le format adéquat-");
        }

        Collections.sort(triparNom);
        for (Information trier:triparNom)
        System.out.println(trier);
        System.out.println("Voulez-vous mettre ces informations dans un fichier texte? 1-Oui 2-Non");
        int choix = clavier.nextInt();

        try{
            if (choix == 1){
                Path fichierTXT = Paths.get("PasswdTrier.txt");
                Files.write(fichierTXT, triparNom)


            }
        }catch (FileAlreadyExistsException ex){
            System.out.println(ex + "-Le fichier existe déjà-");
        }

        if (choix == 2){
            clavier.close();
        }




    }
}

