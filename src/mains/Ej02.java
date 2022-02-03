package mains;

import Clases.Electrodomestico;
import Clases.Lavadora;
import Clases.Televisor;
import java.util.ArrayList;
import java.util.List;

public class Ej02 {

    public static void main(String[] args) {

        Lavadora LV = new Lavadora();
        Televisor TV = new Televisor();

        //// EJERCICIO DOSSSSSSSSSS ////////////////
        LV.crearLavadora();
        System.out.println(LV.toString());
        LV.precioFinal();
        System.out.println("con precio final es: ");
        System.out.println(LV.toString());
        TV.crearTelevisor();
        System.out.println(TV.toString());

        TV.precioFinal();
        System.out.println(TV.toString());

///////////////////// EJERCICIO TRESSSSSSSSSSSSS ///////////////
        List<Electrodomestico> Electros = new ArrayList();

        Lavadora lv1 = new Lavadora(1000, 1000., "azul", "b", 50.);

        Lavadora lv2 = new Lavadora(500, 1000., "blanco", "c", 80.);
        Televisor tv1 = new Televisor(40., true, 1000., "gris", "c", 100.);
        Televisor tv2 = new Televisor(20., true, 1000., "blanco", "f", 40.);
        Electros.add(lv1);
        lv1.precioFinal();
        Electros.add(lv2);
        lv2.precioFinal();
        Electros.add(tv1);
        tv1.precioFinal();
        Electros.add(tv2);
        tv2.precioFinal();

        double preci = 0;
        for (Electrodomestico Electro : Electros) {
            preci = preci + Electro.getPrecio();
        }
        System.out.println(preci);

    }

}
