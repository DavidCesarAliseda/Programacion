package U5.T1.Act6;


import U5.T1.Act5.Instrumento;
import U5.T1.Act5.Nota;

public class main {
    public static void main(String[] args) {
       Campana c = new Campana();
       Piano p = new Piano();

       c.add_nota(Nota.DO);
       c.add_nota(Nota.RE);
       c.interpretar();

       p.add_nota(Nota.LA);
       p.add_nota(Nota.FA);
       p.interpretar();
    }
}
