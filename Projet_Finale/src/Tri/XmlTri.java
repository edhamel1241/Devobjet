package Tri;

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

public class XmlTri {
    public static final String xmlFilePath = "M:\\DevObjJava\\Projet_Finale\\src\\Tri\\Tri.xml";

    public static void main(String[] args) {
        try {

            DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();

            Document document = documentBuilder.newDocument();

            Element root = document.createElement("Tri");
            document.appendChild(root);

            Element Tri = document.createElement("Tri");

            root.appendChild(Tri);

            Attr attr = document.createAttribute("id");
            attr.setValue("CENTRIS");
            Tri.setAttributeNode(attr);

            Element nbreGadolinium = document.createElement("nbreGadolinium");
            nbreGadolinium.appendChild(document.createTextNode("100"));
            Tri.appendChild(nbreGadolinium);

            Element nbreNeptunium = document.createElement("nbreNeptunium");
            nbreNeptunium.appendChild(document.createTextNode("100"));
            Tri.appendChild(nbreNeptunium);

            Element nbrePlutonium = document.createElement("nbrePlutonium");
            nbrePlutonium.appendChild(document.createTextNode("100"));
            Tri.appendChild(nbrePlutonium);

            Element nbreTerbium = document.createElement("nbreTerbium");
            nbreTerbium.appendChild(document.createTextNode("100"));
            Tri.appendChild(nbreTerbium);

            Element nbreThulium = document.createElement("nbreThulium");
            nbreTerbium.appendChild(document.createTextNode("100"));
            Tri.appendChild(nbreThulium);

            Element nbreTotal = document.createElement("nbreTotal");
            nbreTerbium.appendChild(document.createTextNode("500"));
            Tri.appendChild(nbreTotal);

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
