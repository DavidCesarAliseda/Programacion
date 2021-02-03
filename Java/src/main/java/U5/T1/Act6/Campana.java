package U5.T1.Act6;

import U5.T1.Act5.Instrumento;

public class Campana extends Instrumento {
    public Campana() {
        super();
    }

    @Override
    public void interpretar() {
        for (int i = 0; i < indiceNotas; i++) {
            switch (notas[i]){
                case DO:
                    System.out.println("doon");
                    break;
                case RE:
                    System.out.println("rennn");
                    break;
                case MI:
                    System.out.println("miiiiii");
                    break;
                case FA:
                    System.out.println("faaaaa");
                    break;
                case SOL:
                    System.out.println("soooool");
                    break;
                case LA:
                    System.out.println("laaaaa");
                    break;
                case SI:
                    System.out.println("siiiii");
                    break;
            }
        }
        System.out.println();
    }
}

