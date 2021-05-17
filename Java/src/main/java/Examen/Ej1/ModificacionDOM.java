package Examen.Ej1;

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

public class ModificacionDOM {
    /*Añada un nuevo libro a la biblioteca solicitando los datos al usuario.
Inserte un nuevo nodo dentro de editorial que indique el país de origen de la editorial.
Escriba todo esto en un fichero llamado ejercicio2.xml*/
    public static void main(String[] args) throws ParserConfigurationException {
        insertarLibro();
        insertarPais();
    }
    public static void insertarLibro() throws ParserConfigurationException {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Introduce el titulo del libro");
            String titulo = sc.nextLine();
            System.out.println("Introduce el autor del libro");
            String autor = sc.nextLine();
            System.out.println("Introduce la editorial del libro");
            String editorial = sc.nextLine();
            System.out.println("Introduce el numero de paginas del libro");
            String numPaginas = sc.nextLine();

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("biblioteca.xml"));

            Node root = doc.getDocumentElement();

            Element libro = doc.createElement("libro");

            Element titxml = doc.createElement("titulo");
            titxml.setTextContent(titulo);

            Element autorxml = doc.createElement("autor");
            autorxml.setTextContent(autor);

            Element editorialxml = doc.createElement("editorial");
            editorialxml.setTextContent(editorial);

            Element numpagxml = doc.createElement("paginas");
            numpagxml.setTextContent(numPaginas);

            libro.appendChild(titxml);
            libro.appendChild(autorxml);
            libro.appendChild(editorialxml);
            libro.appendChild(numpagxml);

            root.appendChild(libro);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);


            File nuevaCarta = new File("ejercicio2.xml");
            StreamResult destino = new StreamResult(nuevaCarta);


            transformer.transform(origenDOM, destino);

        } catch (SAXException | IOException | TransformerException e) {
            e.printStackTrace();
        }
    }

    private static void insertarPais(){
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("biblioteca.xml"));

            Node root = doc.getDocumentElement();
            NodeList nl = doc.getElementsByTagName("editorial");

            for (int i = 0; i < nl.getLength(); i++) {
                Element e = (Element) nl.item(i);
                Element pais = doc.createElement("pais");
                pais.setTextContent("Portugal");
                e.appendChild(pais);
            }

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);


            File nuevaCarta = new File("ejercicio2.xml");
            StreamResult destino = new StreamResult(nuevaCarta);


            transformer.transform(origenDOM, destino);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
