package Examen.Ej2;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RecorridoStax {
    private static Object FileNotFoundException;
    private static Object XMLStreamException;

    /*Muestre por pantalla los datos del libro con más páginas.
    Que muestre por pantalla el número de libros de una editorial determinada que se solicitará al usuario.*/
    public static void main(String[] args) {
        libroMasPaginas();
    }

    public static void libroMasPaginas() {
        Scanner sc = new Scanner(System.in);
        //Guardar el de mas paginas
        int maxPag = 0;
        String maxLibro = "";
        String maxAutor = "";
        String maxEditorial = "";
        //Guardar actual
        int numPag = 0;
        String nLibro = "";
        String autor = "";
        String editorial = "";
        String tagActual = "";

        int numLibrosEdit = 0;

        System.out.println("Inserte editorial");
        String editorialUser = sc.nextLine();

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("biblioteca.xml"));

            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {
                    StartElement starTag = xmlEvent.asStartElement();
                    String tagName = starTag.getName().getLocalPart();
                    if (tagName.equals("titulo")) {
                        tagActual = "titulo";
                    }
                    if (tagName.equals("autor")) {
                        tagActual = "autor";
                    }
                    if (tagName.equals("editorial")) {
                        tagActual = "editorial";
                    }
                    if (tagName.equals("paginas")) {
                        tagActual = "paginas";
                    }
                } else if (xmlEvent.isCharacters() && !tagActual.equals("paginas")) {
                    Characters texto = xmlEvent.asCharacters();
                    if (tagActual.equals("titulo")) {
                        nLibro = texto.getData();
                    }
                    if (tagActual.equals("autor")) {
                        autor = texto.getData();
                    }
                    if (tagActual.equals("editorial")) {
                        editorial = texto.getData();
                        if (editorial.equals(editorialUser)) {
                            numLibrosEdit++;
                        }
                    }
                } else if (xmlEvent.isCharacters() && tagActual.equals("paginas")) {
                    Characters numeroPag = xmlEvent.asCharacters();
                    int numeroPagActual = Integer.valueOf(numeroPag.getData());
                    if (numeroPagActual > maxPag) {
                        maxPag = numeroPagActual;
                        maxLibro = nLibro;
                        maxAutor = autor;
                        maxEditorial = editorial;
                    }
                }
            }
        } catch (java.io.FileNotFoundException | javax.xml.stream.XMLStreamException e) {
            e.printStackTrace();
        }
        System.out.println(numLibrosEdit);
        System.out.println("Titulo: " + maxLibro + " Autor: " + maxAutor + " Editorial: " + maxEditorial + " Paginas: " + maxPag);
    }
}
