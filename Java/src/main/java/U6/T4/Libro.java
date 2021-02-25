package U6.T4;

import java.util.Objects;

public class Libro implements Comparable{
    private String autor;
    private String titulo;
    //Constructor
    public Libro(String autor, String titulo) throws ExcepcionAutor {
        setAutor(autor);
        setTitulo(titulo);
    }

    /*Get and set*/
    //Autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws ExcepcionAutor {
        char[] cadena_div = autor.toCharArray();
        for (int i = 0; i < cadena_div.length; i++) {
            if (Character.isDigit(cadena_div[i])) {
                throw new ExcepcionAutor("El nombre del autor es un numero.");
            } else {
                this.autor = autor;
            }
        }
    }
    //Titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Metodos

    @Override
    public String toString() {
        return titulo+": "+autor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro)) return false;
        Libro libro = (Libro) o;
        return Objects.equals(autor, libro.autor) && Objects.equals(titulo, libro.titulo);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        Libro otro = (Libro) o;
        return this.titulo.compareTo(((Libro) o).titulo);
    }
}
