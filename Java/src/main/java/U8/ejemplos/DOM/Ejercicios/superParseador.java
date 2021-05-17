package U8.Ejemplos.DOM.Ejercicios;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class superParseador {
    public static void main(String[] args) {
        try{
            //Cargo el Fichero XML en Memoria
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("Ficheros/personasXML.xml"));

            //Cojo el elemento (etiqueta) raíz
            Element root = doc.getDocumentElement();//.getByTagName("persona")

            //Obtengo todos los nodos hijos del elemento raíz
            NodeList nl = root.getChildNodes();

            System.out.println("<"+root.getTagName()+">");//Personas

            //Recorrer nodos
            for (int i = 0; i < nl.getLength(); i++) {

                //Nodo persona
                if (nl.item(i).getNodeType()== Node.ELEMENT_NODE){
                    Element e = (Element) nl.item(i);//persona
                    System.out.print("\t<"+e.getTagName());
                    //Atributos de nodo persona
                    if (e.hasAttributes()){
                        //Obtengo los atributos y los muestro
                        NamedNodeMap nodeMap = e.getAttributes();
                        //Sacar atributos
                        for (int j = 0; j < nodeMap.getLength(); j++) {
                            Node node = nodeMap.item(j);
                            Attr atributo = e.getAttributeNode(node.getNodeName());
                            System.out.print(" "+atributo.getNodeName()+"="+atributo.getValue());
                        }
                    }

                    System.out.println(">");

                    //Hijos persona
                    NodeList nl2 = nl.item(i).getChildNodes();//Lista hijos persona
                    for (int j = 0; j < nl2.getLength(); j++) {//Recorrer lista
                        if (nl2.item(j).getNodeType()==Node.ELEMENT_NODE){
                            Element e2 = (Element) nl2.item(j);
                            System.out.println("\t\t<"+e2.getTagName()+">"+e2.getTextContent()+"</"+e2.getTagName()+">");
                        }
                    }

                    System.out.println("\t</"+e.getTagName()+">");
                }else if(nl.item(i).getNodeType() == Node.TEXT_NODE){
                }
            }
            System.out.println("<"+root.getTagName()+"/>");
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
}
