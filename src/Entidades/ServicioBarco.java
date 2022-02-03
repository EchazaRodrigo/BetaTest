package Entidades;

import Clases.Barco;
import java.util.Date;
import java.util.Scanner;


public class ServicioBarco {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    Date fc = new Date();
    
    public void crearBarco(Barco br){
        
        System.out.println("Ingrese la matricula");
        br.setMatricula(Leer.next());
        System.out.println("Ingrese la eslora en mts");
        br.setEslora(Leer.nextInt());
        System.out.println("ingrese el año de fabricacion");
        fc.setYear(Leer.nextInt());
        br.setAnioFab(fc);
              
    }
}
