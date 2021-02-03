package U5.T1.Act6;

import U5.T1.Act5.Instrumento;

public class Piano extends Instrumento {

    public Piano() {
        super();
    }

    @Override
    public void interpretar() {
        for (int i = 0; i < indiceNotas; i++) {
            switch (notas[i]){
                case DO:
                    System.out.println("do");
                    break;
                case RE:
                    System.out.println("re");
                    break;
                case MI:
                    System.out.println("mi");
                    break;
                case FA:
                    System.out.println("fa");
                    break;
                case SOL:
                    System.out.println("sol");
                    break;
                case LA:
                    System.out.println("la");
                    break;
                case SI:
                    System.out.println("si");
                    break;
            }
        }
        System.out.println();
    }
}
