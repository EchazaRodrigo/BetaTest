package Entidades;

import Clases.BarcosAMotor;
import java.util.Scanner;


public class ServicioAMotor {
    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    
        public void crearAMotor(ServicioBarco SB,BarcosAMotor bm){
        System.out.println("ingresela potencia");
        bm.setPotencia(Leer.nextInt());
        SB.crearBarco(bm);        
        
    }
}
