package U6.T4;

public class RegistroLibros {
    private int indice_libros;
    private Libro[] libros;

    public RegistroLibros(int num_max) {
        setIndice_libros(0);
        setLibros();
    }

    public int getIndice_libros() {
        return indice_libros;
    }

    public void setIndice_libros(int indice_libros) {
        this.indice_libros = indice_libros;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public void setLibros() {
        this.libros = new Libro[0];
    }
}
