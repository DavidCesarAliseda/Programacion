package U5.T1.Act5;

public abstract class Instrumento {

    protected Nota notas[];
    protected int indiceNotas; //numero de notas guardadas en la tabla
    static protected int Tam_Max = 100;


    public Instrumento() {
        notas = new Nota[Tam_Max];
        this.indiceNotas = 0;
    }

    //Metodos
    //Añadir nota desde enum
    public void add_nota(Nota n){
        if (indiceNotas<notas.length){
            notas[indiceNotas] = n;
            indiceNotas++;
        }
    }

    public abstract void interpretar();
}
