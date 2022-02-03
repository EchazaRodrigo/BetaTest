package Entidades;

import Clases.AlquileresBarcos;
import Clases.YatedeLujo;
import java.util.Scanner;


public class ServicioYate {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    public void crearYate(ServicioBarco SB,YatedeLujo yt){
        System.out.println("ingrese la potencia");
        yt.setPotencia(Leer.nextInt());
        System.out.println("ingrese la cantidad de camarotes");
        yt.setCamarotes(Leer.nextInt());
        SB.crearBarco(yt);        
        
    }
}
