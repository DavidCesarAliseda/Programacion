package U8.Ejemplos.Entregable;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DOM {
    /*Partiendo el ejercicio1.xml crear una clase ModificacionDOM que:

    Añada una nueva comida al menú solicitando los datos al usuario.
    Inserte al final de cada nodo food (incluido el nuevo) la siguiente etiqueta <healthy>true</healthy>
    Escriba todo esto en un fichero llamado ejercicio2.xml*/

    public static void main(String[] args) {

        insertarPlato();
        insertarEtiqueta();
    }

    public static void insertarPlato() {
        Scanner sc = new Scanner(System.in);
        try {
            //Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Ficheros/U8/menu.xml"));
            Node root = doc.getDocumentElement();

            Element food = doc.createElement("food");

            Element name = doc.createElement("name");
            name.setTextContent("Queso");

            Element price = doc.createElement("price");
            price.setTextContent("4.5");

            Element description = doc.createElement("description");
            description.setTextContent("si");

            Element calories = doc.createElement("calories");
            calories.setTextContent("500");

            food.appendChild(name);
            food.appendChild(price);
            food.appendChild(description);
            food.appendChild(calories);

            root.appendChild(food);


            // PROCEDEMOS A VOLCAR TODAS LAS MODIFICACIONES, TODO ÉL ARBOL AL FICHERO

            //Obtenemos el objeto transformer
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            //Configuración del transformer
            //Podéis ver toda la lista de propiedes aquí
            // https://docs.oracle.com/javase/7/docs/api/javax/xml/transform/OutputKeys.html
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            //Creación del origen DOMSource
            DOMSource origenDOM = new DOMSource(root);

            //Creación del fichero que va a ser mi destino
            File nuevaCarta = new File("Ficheros/U8/cartaMod.xml");
            StreamResult destino = new StreamResult(nuevaCarta);

            //Hacemos la transformación que en nuestro caso es la escritura
            transformer.transform(origenDOM, destino);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }
    }

    public static void insertarEtiqueta(){
        try{
            //Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Ficheros/U8/cartaMod.xml"));

            Node root = doc.getDocumentElement();

            NodeList nl = root.getChildNodes();


            for (int i = 0; i < nl.getLength() ; i++) {
                if (nl.item(i).getNodeName().equals("food")){
                    Element healthy = doc.createElement("healthy");
                    healthy.setTextContent("True");
                    nl.item(i).appendChild(healthy);
                }
            }

            // PROCEDEMOS A VOLCAR TODAS LAS MODIFICACIONES, TODO ÉL ARBOL AL FICHERO

            //Obtenemos el objeto transformer
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            //Configuración del transformer
            //Podéis ver toda la lista de propiedes aquí
            // https://docs.oracle.com/javase/7/docs/api/javax/xml/transform/OutputKeys.html
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            //Creación del origen DOMSource
            DOMSource origenDOM = new DOMSource(root);

            //Creación del fichero que va a ser mi destino
            File nuevaCarta = new File("Ficheros/U8/cartaMod2.xml");
            StreamResult destino = new StreamResult(nuevaCarta);

            //Hacemos la transformación que en nuestro caso es la escritura
            transformer.transform(origenDOM, destino);


        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
