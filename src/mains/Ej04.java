package mains;

import Clases.Circulo;
import Clases.Rectangulo;
import Entidades.ServicioCirculo;
import Entidades.ServicioRectangulo;

public class Ej04 {

    // Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2   
    public static void main(String[] args) {

        ServicioCirculo SC = new ServicioCirculo();
        ServicioRectangulo SR = new ServicioRectangulo();
        
        Circulo cir = SC.crearCirculo();
        System.out.println("el area de: " + cir.toString()+ " es: " +SC.AreaCirculo(cir) );
        System.out.println("el perimetro de: " + cir.toString()+ " es: " +SC.PerimetroCirculo(cir) );
        
        Rectangulo rc = SR.crearRectangulo();
        System.out.println("el area de: " + rc.toString()+ " es: " + SR.AreaRectangulo(rc));
        System.out.println("el perimetro de: " +rc.toString()+ "es: " + SR.PerimetroRectangulo(rc));
        
    }

}
