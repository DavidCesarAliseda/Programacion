package U4.T1.Act9;

import U4.T1.Act9.Maquinaria.Locomotora;
import U4.T1.Act9.Maquinaria.Tren;
import U4.T1.Act9.Maquinaria.tipo_mercancia;
import U4.T1.Act9.Personal.Maquinista;
import U4.T1.Act9.Personal.Mecanico;
import U4.T1.Act9.Personal.tipo_especialidad;

public class main {
    /*Implementar las clases con sus atributos y constructores para gestionar una empresa ferroviaria, en la que se distingues dos grandes grupos: personal y maquinaria. En el primero se ubican todos los empleados de la empresa, que se clasifican en 3 grupos: maquinistas, mecánicos y jefes de estación. De cada uno de ellos hay que guardar:

Maquinistas: nombre completo, dni, sueldo mensual, rango

Mecánicos: nombre completo, tlfno y especialidad (frenos, hidráulica,...)

Jefes estación: nombre completo, dni.

En cuestión de maquinaria podemos encontrar trenes, locomotoras, y vagones. De cada uno hay que considerar:

Vagones: tienen una capacidad máxima de carga (en kilos), una capacidad actual (carga en un momento dado), y el tipo de mercancía con el que están cargados.

Locomotoras:disponen de una matrícula, potencia de su motor y un año de fabricación. Cada locomotora tiene asignado un mecánico que se encarga de su mantenimiento.

Trenes:están formados por una locomotora y un máximo de 5 vagones. Cada tren tiene asignado un maquinista que es responsable de él.

Todas las clases correspondientes al personal serán de uso público. Entre las clases relativas a la maquinaria solo será posible construir, desde clases externas, objetos tipo Tren y de tipo Locomotora. La clase Vagon será solo visible por sus clases vecinas.*/
    public static void main(String[] args) {
        Maquinista maq1 = new Maquinista("Federico", "987654321C", 1234.56, 3);
        Mecanico mec1 = new Mecanico("Alfonso", 987654321, tipo_especialidad.HIDRAULICA);
        Locomotora l1 = new Locomotora("98745wer", 300, 2016, mec1);

        //maq1.infoMaquinista();
        //mec1.infoMecanico();
        //l1.infoLocomotora();

        Tren t1 = new Tren(l1, maq1);

        //t1.infoTren();

        t1.anadir_vagon(100, 75, tipo_mercancia.AGUA);
        t1.anadir_vagon(60, 20, tipo_mercancia.GASOLINA);
        t1.anadir_vagon(100, 75, tipo_mercancia.AGUA);
        t1.anadir_vagon(60, 20, tipo_mercancia.GASOLINA);
        t1.anadir_vagon(100, 75, tipo_mercancia.AGUA);
        t1.anadir_vagon(60, 20, tipo_mercancia.GASOLINA);

        t1.infoTren();



    }
}
