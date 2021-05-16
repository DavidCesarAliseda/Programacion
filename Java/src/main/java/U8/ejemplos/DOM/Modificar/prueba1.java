package U8.Ejemplos.DOM.Modificar;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class prueba1 {
    public static void main(String[] args) {
        try {

            //Obtenemos la referencia al objeto Document
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            //Parseamos el documento XML para tenerlo en memoria cargado
            Document doc = db.parse(new File("Ficheros/personasXML.xml"));

            //Obtenemos el nodo raíz
            Node root = doc.getDocumentElement();

            //Voy a insertar un nodo comentario antes de la primera persona
            Comment comentario = doc.createComment("Empieza la lista de personas");//Crear comentario

            NodeList nl = root.getChildNodes();
            int i;
            for (i = 0; i < nl.getLength(); i++) {
                Node nodo = nl.item(i);
                if (nodo.getNodeType() == Node.COMMENT_NODE){
                    break;
                }
            }

            root.insertBefore(comentario,nl.item(i));

            // PROCEDEMOS A VOLCAR TODAS LAS MODIFICACIONES, TODO ÉL ARBOL AL FICHERO

            //Obtenemos el objeto transformer
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            //Configuración del transformer
            //Podéis ver toda la lista de propiedes aquí
            // https://docs.oracle.com/javase/7/docs/api/javax/xml/transform/OutputKeys.html
            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            //Creación del origen DOMSource
            DOMSource origenDOM = new DOMSource(root);

            //Creación del fichero que va a ser mi destino
            File nuevoPersonas = new File("Ficheros/pruebaPersonasXML.xml");
            StreamResult destino = new StreamResult(nuevoPersonas);

            //Hacemos la transformación que en nuestro caso es la escritura
            transformer.transform(origenDOM,destino);


        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            e.printStackTrace();
        }
    }
}
