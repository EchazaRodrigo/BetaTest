package Entidades;

import Clases.CalculosRectangulo;
import Clases.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo implements CalculosRectangulo<Rectangulo> {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo crearRectangulo() {
        Rectangulo rc = new Rectangulo();
        System.out.println("ingrese la base");
        rc.setBase(Leer.nextInt());
        System.out.println("Ingrese la altura");
        rc.setAltura(Leer.nextInt());
         return rc;
        
    }

    @Override
    public int AreaRectangulo(Rectangulo rec) {
    int area = rec.getBase() * rec.getAltura();
    return area;
    }

    @Override
    public int PerimetroRectangulo(Rectangulo rec) {
       int peri = (rec.getBase() + rec.getAltura()) * 2;
       return peri;
    }

}
