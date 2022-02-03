package Entidades;


import Clases.Veleros;
import java.util.Scanner;


public class ServicioVelero extends ServicioBarco{
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearVelero(ServicioBarco SB,Veleros vl){
        System.out.println("ingrese la cantidad de mastiles");
        vl.setMastiles(Leer.nextInt());
        SB.crearBarco(vl);        
        
    }
}
