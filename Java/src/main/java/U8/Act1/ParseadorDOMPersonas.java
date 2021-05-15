package U8.Act1;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParseadorDOMPersonas {
    public static void parse(String nomFile){
        try{
            //Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Ficheros/U8/personasXML.xml"));

            //Cojo directamente las etiquetas persona
            NodeList nl = doc.getElementsByTagName("persona");

            for (int i = 0; i < nl.getLength(); i++){
                
            }



        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
}
