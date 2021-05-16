package U8.Ejemplos.Entregable;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;

public class STAX {
    public static void main(String[] args) {

        int totalCalorias=0;
        int numPlatos=0;
        String tagActual="";

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("Ficheros/U8/menu.xml"));

            while (xmlReader.hasNext()){
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()){
                    StartElement startTag = xmlEvent.asStartElement();
                    String tagName = startTag.getName().getLocalPart();

                    if (tagName.equals("food")){
                        numPlatos++;
                    }
                    if (tagName.equals("calories")){
                        tagActual="calories";
                    }

                }else if(xmlEvent.isCharacters() && tagActual.equals("calories")){
                    tagActual="";
                    Characters texto = xmlEvent.asCharacters();
                    totalCalorias+=Integer.valueOf(texto.getData());
                }
            }
            System.out.println(numPlatos);
            System.out.println(totalCalorias);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
