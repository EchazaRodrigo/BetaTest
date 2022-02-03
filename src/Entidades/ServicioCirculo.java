package Entidades;

import Clases.CalculosCirculo;
import Clases.Circulo;
import java.util.Scanner;



public class ServicioCirculo implements CalculosCirculo<Circulo> {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    
    public Circulo crearCirculo(){
        Circulo cir = new Circulo();
        System.out.println("ingrese el radio del circulo");
        cir.setRadio(Leer.nextDouble());
        
        return cir;
    }

    @Override
    public Double AreaCirculo(Circulo circ) {
        double area = CalculosCirculo.PI * Math.pow(circ.getRadio(), 2);
       // deberia tirar 19,63
        return area;
    }

    @Override
    public Double PerimetroCirculo(Circulo circ) {
        double peri = CalculosCirculo.PI * (circ.getRadio() + circ.getRadio()); 
        // deberia ser 15.71 y sale 31.41
        return peri;
    }


}
