package U5.Examen2020_2.Examen2020;

import U5.Examen2020_2.Examen2020.Materiales.Cristal;
import U5.Examen2020_2.Examen2020.Materiales.Metal;
import U5.Examen2020_2.Examen2020.Materiales.Roca;
import U5.Examen2020_2.Examen2020.Materiales.Tipo_Cristal;

public class main {
    public static void main(String[] args) {
        /*ejemplo que contenga al menos 5 materiales*/

        Cristal c1 = new Cristal("Cristal1", 0, 850, 657, false, Tipo_Cristal.TRANSPARENTE);
        Cristal c2 = new Cristal("Cristal2", 90, 950, 351, false, Tipo_Cristal.TRANSPARENTE);
        Roca r1 = new Roca("Roca1", 0, 465, 654, true);
        Metal m1 = new Metal("Metal1", 99, 654, 213, false, true);
        Metal m2 = new Metal("Metal2", 785, 64, 13, false, false);
        Minecraft minecraft = new Minecraft();



        minecraft.addMaterial(c1);
        minecraft.addMaterial(c2);
        minecraft.addMaterial(r1);
        minecraft.addMaterial(m1);
        minecraft.addMaterial(m2);
        System.out.println(minecraft.ultimoMaterialQueQueda());

        System.out.println(minecraft.mostrarEstado());
        System.out.println(minecraft.ultimoMaterialQueQueda());

        minecraft.borrarMaterialSinMasa();

        System.out.println(minecraft.mostrarEstado());

        System.out.println(minecraft.ultimoMaterialQueQueda());


    }
}
