package Planete;

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

public class XmlPlanete {

    public static final String xmlFilePath = "M:\\DevObjJava\\Projet_Finale\\src\\Planete\\XmlPlanete.xml";

    public static void main(String[] args) {
        try {

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            Element root = document.createElement("Planete");
            document.appendChild(root);

            //JUPITER
            Element Jupiter = document.createElement("Jupiter");

            root.appendChild(Jupiter);

            Attr attr = document.createAttribute("id");
            attr.setValue("JUPI");
            Jupiter.setAttributeNode(attr);

            Element nomJupi = document.createElement("nom");
            nomJupi.appendChild(document.createTextNode("Jupiter"));
            Jupiter.appendChild(nomJupi);

            Element pourcentNeptuJ = document.createElement("PourcentageNeptunium");
            pourcentNeptuJ.appendChild(document.createTextNode("9"));
            Jupiter.appendChild(pourcentNeptuJ);

            Element pourcentPlutoJ = document.createElement("PourcentagePlutonium");
            pourcentPlutoJ.appendChild(document.createTextNode("24"));
            Jupiter.appendChild(pourcentPlutoJ);

            Element pourcentTerbJ = document.createElement("PourcentageTerbium");
            pourcentTerbJ.appendChild(document.createTextNode("52"));
            Jupiter.appendChild(pourcentTerbJ);

            Element pourcentThuJ = document.createElement("PourcentageThulium");
            pourcentThuJ.appendChild(document.createTextNode("79"));
            Jupiter.appendChild(pourcentThuJ);

            Element pourcentGadoJ = document.createElement("PourcentageGadolinium");
            pourcentGadoJ.appendChild(document.createTextNode("100"));
            Jupiter.appendChild(pourcentGadoJ);

            //MARS
            Element Mars = document.createElement("Mars");

            root.appendChild(Mars);

            Attr attr1 = document.createAttribute("id");
            attr.setValue("MARS");
            Mars.setAttributeNode(attr1);

            Element nomMars = document.createElement("nom");
            nomMars.appendChild(document.createTextNode("Mars"));
            Mars.appendChild(nomMars);

            Element pourcentNeptuM = document.createElement("PourcentageNeptunium");
            pourcentNeptuM.appendChild(document.createTextNode("3"));
            Mars.appendChild(pourcentNeptuM);

            Element pourcentPlutoM = document.createElement("PourcentagePlutonium");
            pourcentPlutoM.appendChild(document.createTextNode("10"));
            Mars.appendChild(pourcentPlutoM);

            Element pourcentTerbM = document.createElement("PourcentageTerbium");
            pourcentTerbM.appendChild(document.createTextNode("85"));
            Mars.appendChild(pourcentTerbM);

            Element pourcentThuM = document.createElement("PourcentageThulium");
            pourcentThuM.appendChild(document.createTextNode("88"));
            Mars.appendChild(pourcentThuM);

            Element pourcentGadoM = document.createElement("PourcentageGadolinium");
            pourcentGadoM.appendChild(document.createTextNode("100"));
            Mars.appendChild(pourcentGadoM);

            //SATURNE
            Element Saturne = document.createElement("Saturne");

            root.appendChild(Saturne);

            Attr attr2 = document.createAttribute("id");
            attr.setValue("SATU");
            Saturne.setAttributeNode(attr2);

            Element nomSatu = document.createElement("nom");
            nomSatu.appendChild(document.createTextNode("Saturne"));
            Saturne.appendChild(nomSatu);

            Element pourcentNeptuS = document.createElement("PourcentageNeptunium");
            pourcentNeptuS.appendChild(document.createTextNode("48"));
            Saturne.appendChild(pourcentNeptuS);

            Element pourcentPlutoS = document.createElement("PourcentagePlutonium");
            pourcentPlutoS.appendChild(document.createTextNode("51"));
            Saturne.appendChild(pourcentPlutoS);

            Element pourcentTerbS = document.createElement("PourcentageTerbium");
            pourcentTerbS.appendChild(document.createTextNode("70"));
            Saturne.appendChild(pourcentTerbS);

            Element pourcentThuS = document.createElement("PourcentageThulium");
            pourcentThuS.appendChild(document.createTextNode("85"));
            Saturne.appendChild(pourcentThuS);

            Element pourcentGadoS = document.createElement("PourcentageGadolinium");
            pourcentGadoS.appendChild(document.createTextNode("100"));
            Saturne.appendChild(pourcentGadoS);

            //URANUS
            Element Uranus = document.createElement("Uranus");

            root.appendChild(Jupiter);

            Attr attr3 = document.createAttribute("id");
            attr3.setValue("URAN");
            Uranus.setAttributeNode(attr3);

            Element nomUran = document.createElement("nom");
            nomUran.appendChild(document.createTextNode("Uranus"));
            Uranus.appendChild(nomUran);

            Element pourcentNeptuU = document.createElement("PourcentageNeptunium");
            pourcentNeptuU.appendChild(document.createTextNode("62"));
            Uranus.appendChild(pourcentNeptuU);

            Element pourcentPlutoU = document.createElement("PourcentagePlutonium");
            pourcentPlutoJ.appendChild(document.createTextNode("70"));
            Uranus.appendChild(pourcentPlutoU);

            Element pourcentTerbU = document.createElement("PourcentageTerbium");
            pourcentTerbU.appendChild(document.createTextNode("71"));
            Uranus.appendChild(pourcentTerbU);

            Element pourcentThuU = document.createElement("PourcentageThulium");
            pourcentThuU.appendChild(document.createTextNode("85"));
            Uranus.appendChild(pourcentThuU);

            Element pourcentGadoU = document.createElement("PourcentageGadolinium");
            pourcentGadoU.appendChild(document.createTextNode("100"));
            Uranus.appendChild(pourcentGadoU);

            //VENUS
            Element Venus = document.createElement("Venus");

            root.appendChild(Venus);

            Attr attr4 = document.createAttribute("id");
            attr.setValue("VENU");
            Venus.setAttributeNode(attr4);

            Element nomVenu = document.createElement("nom");
            nomVenu.appendChild(document.createTextNode("Venus"));
            Venus.appendChild(nomVenu);

            Element pourcentNeptuV = document.createElement("PourcentageNeptunium");
            pourcentNeptuV.appendChild(document.createTextNode("53"));
            Venus.appendChild(pourcentNeptuV);

            Element pourcentPlutoV = document.createElement("PourcentagePlutonium");
            pourcentPlutoV.appendChild(document.createTextNode("69"));
            Venus.appendChild(pourcentPlutoV);

            Element pourcentTerbV = document.createElement("PourcentageTerbium");
            pourcentTerbV.appendChild(document.createTextNode("90"));
            Venus.appendChild(pourcentTerbV);

            Element pourcentThuV = document.createElement("PourcentageThulium");
            pourcentThuV.appendChild(document.createTextNode("96"));
            Venus.appendChild(pourcentThuV);

            Element pourcentGadoV = document.createElement("PourcentageGadolinium");
            pourcentGadoV.appendChild(document.createTextNode("100"));
            Venus.appendChild(pourcentGadoV);

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
