package Vaisseau;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlVaisseau {
    public static final String xmlFilePath = "M:\\DevObjJava\\Projet_Finale\\src\\Vaisseau\\Vaisseau.xml";

    public static void main(String[] args) {
        try {

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            Element root = document.createElement("Vaisseau");
            document.appendChild(root);

            //VAISSEAU LEGER
            Element Vaisseau_leger = document.createElement("Vaisseau_leger");

            root.appendChild(Vaisseau_leger);

            Attr attr = document.createAttribute("id");
            attr.setValue("VAISLEGER");
            Vaisseau_leger.setAttributeNode(attr);

            Element nomLeger = document.createElement("nom");
            nomLeger.appendChild(document.createTextNode("Vaisseau_leger"));
            Vaisseau_leger.appendChild(nomLeger);

            Element CapaciteLeger = document.createElement("Capacite");
            CapaciteLeger.appendChild(document.createTextNode("10"));
            Vaisseau_leger.appendChild(CapaciteLeger);

            Element TypeLeger = document.createElement("Type");
            TypeLeger.appendChild(document.createTextNode("Leger"));
            Vaisseau_leger.appendChild(TypeLeger);

            //VAISSEAU MOYEN
            Element Vaisseau_normal = document.createElement("Vaisseau_normal");

            root.appendChild(Vaisseau_normal);

            Attr attr1 = document.createAttribute("id");
            attr1.setValue("VAISNORMAL");
            Vaisseau_normal.setAttributeNode(attr1);

            Element nomMoyen = document.createElement("nom");
            nomMoyen.appendChild(document.createTextNode("Vaisseau_moyen"));
            Vaisseau_normal.appendChild(nomMoyen);

            Element CapaciteMoyen = document.createElement("Capacite");
            CapaciteMoyen.appendChild(document.createTextNode("20"));
            Vaisseau_normal.appendChild(CapaciteMoyen);

            Element TypeMoyen = document.createElement("Type");
            TypeMoyen.appendChild(document.createTextNode("Moyen"));
            Vaisseau_normal.appendChild(TypeMoyen);

            //VAISSEAU LOURD
            Element Vaisseau_lourd = document.createElement("Vaisseau_lourd");

            root.appendChild(Vaisseau_lourd);

            Attr attr2 = document.createAttribute("id");
            attr2.setValue("VAISLOURD");
            Vaisseau_lourd.setAttributeNode(attr2);

            Element nomLourd = document.createElement("nom");
            nomLourd.appendChild(document.createTextNode("Vaisseau_lourd"));
            Vaisseau_lourd.appendChild(nomLourd);

            Element CapaciteLourd = document.createElement("Capacite");
            CapaciteLourd.appendChild(document.createTextNode("30"));
            Vaisseau_lourd.appendChild(CapaciteLourd);

            Element TypeLourd = document.createElement("Type");
            TypeLourd.appendChild(document.createTextNode("Lourd"));
            Vaisseau_lourd.appendChild(TypeLourd);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));

            transformer.transform(domSource, streamResult);

            System.out.println("Le fichier XML des déchets est créé.");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}