package Dechet;

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

public class XmlDechet {

    public static final String xmlFilePath = "M:\\DevObjJava\\Projet_Finale\\src\\Dechet\\Dechets.xml";

    public static void main(String[] args) {
        try {

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            //GADOLINIUM
            Element root = document.createElement("Dechet");
            document.appendChild(root);

            Element Gadolinium = document.createElement("Gadolinium");

            root.appendChild(Gadolinium);

            Attr attr = document.createAttribute("id");
            attr.setValue("GADO");
            Gadolinium.setAttributeNode(attr);

            Element nomGado = document.createElement("nom");
            nomGado.appendChild(document.createTextNode("Gadolinium"));
            Gadolinium.appendChild(nomGado);

            Element MVGado = document.createElement("MasseVolumique");
            MVGado.appendChild(document.createTextNode("7.901"));
            Gadolinium.appendChild(MVGado);

            Element PRGado = document.createElement("PourcentageRecyclage");
            PRGado.appendChild(document.createTextNode("42"));
            Gadolinium.appendChild(PRGado);

            //NEPTUNIUM
            Element Neptunium = document.createElement("Neptunium");

            root.appendChild(Neptunium);

            Attr attr1 = document.createAttribute("id");
            attr1.setValue("NEPTU");
            Neptunium.setAttributeNode(attr1);

            Element nomNeptu = document.createElement("nom");
            nomNeptu.appendChild(document.createTextNode("Neptunium"));
            Neptunium.appendChild(nomNeptu);

            Element MVNeptu = document.createElement("MasseVolumique");
            MVNeptu.appendChild(document.createTextNode("20.25"));
            Neptunium.appendChild(MVNeptu);

            Element PRNeptu = document.createElement("PourcentageRecyclage");
            PRNeptu.appendChild(document.createTextNode("39"));
            Neptunium.appendChild(PRNeptu);

            //PLUTONIUM
            Element Plutonium = document.createElement("Plutonium");

            root.appendChild(Plutonium);

            Attr attr2 = document.createAttribute("id");
            attr2.setValue("PLUTO");
            Plutonium.setAttributeNode(attr2);

            Element nomPluto = document.createElement("nom");
            nomPluto.appendChild(document.createTextNode("Plutonium"));
            Plutonium.appendChild(nomPluto);

            Element MVPluto = document.createElement("MasseVolumique");
            MVPluto.appendChild(document.createTextNode("19.84"));
            Plutonium.appendChild(MVPluto);

            Element PRPluto = document.createElement("PourcentageRecyclage");
            PRPluto.appendChild(document.createTextNode("27"));
            Plutonium.appendChild(PRPluto);

            //TERBIUM
            Element Terbium = document.createElement("Terbium");

            root.appendChild(Terbium);

            Attr attr3 = document.createAttribute("id");
            attr3.setValue("TERB");
            Terbium.setAttributeNode(attr3);

            Element nomTerb = document.createElement("nom");
            nomTerb.appendChild(document.createTextNode("Terbium"));
            Terbium.appendChild(nomTerb);

            Element MVTerb = document.createElement("MasseVolumique");
            MVTerb.appendChild(document.createTextNode("8.230"));
            Terbium.appendChild(MVTerb);

            Element PRTerb = document.createElement("PourcentageRecyclage");
            PRTerb.appendChild(document.createTextNode("49"));
            Terbium.appendChild(PRTerb);

            //THULIUM
            Element Thulium = document.createElement("Thulium");

            root.appendChild(Thulium);

            Attr attr4 = document.createAttribute("id");
            attr4.setValue("THULI");
            Thulium.setAttributeNode(attr4);

            Element nomThuli = document.createElement("nom");
            nomThuli.appendChild(document.createTextNode("Thulium"));
            Thulium.appendChild(nomThuli);

            Element MVThuli = document.createElement("MasseVolumique");
            MVThuli.appendChild(document.createTextNode("9.321"));
            Thulium.appendChild(MVThuli);

            Element PRThuli = document.createElement("PourcentageRecyclage");
            PRThuli.appendChild(document.createTextNode("74"));
            Thulium.appendChild(PRThuli);

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
