package Entidades;

import Clases.AlquileresBarcos;
import Clases.Barco;
import Clases.BarcosAMotor;
import Clases.Veleros;
import Clases.YatedeLujo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ServicioAlquileres {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    Date date = new Date();
    ServicioYate st = new ServicioYate();
    ServicioVelero sv = new ServicioVelero();
    ServicioAMotor sm = new ServicioAMotor();
    ServicioBarco SB = new ServicioBarco();
  

    public void nuevoAlquiler(AlquileresBarcos ab) {
      
        System.out.println("Ingre el nombre");
        ab.setNombre(Leer.next());
        System.out.println("Ingrese el DNI");
        ab.setDNI(Leer.nextDouble());
        System.out.println("Ingrese fecha de Inicio");
        System.out.println("Año:");
        date.setYear(Leer.nextInt());
        System.out.println("Mes:");
        date.setMonth(Leer.nextInt());
        ab.setFechaIni(date);
        System.out.println("ingrese fecha de devolucion");
        System.out.println("Año:");
        date.setYear(Leer.nextInt());
        System.out.println("Mes:");
        date.setMonth(Leer.nextInt());
        ab.setFechaDev(date);
        System.out.println("Indique la posicion de amarra");
        ab.setPosicion(Leer.nextInt());
        this.Menu(ab.getBarco());
       
    }

    public void Menu(ArrayList AB) {
        System.out.println("indique tipo de barco\n"
                + "1: Velero\n"
                + "2 A motor\n"
                + "3: Yate");
        int aux = Leer.nextInt();
        switch (aux){
            case 1:
                Veleros vl = new Veleros();
            sv.crearVelero(SB, vl);
            AB.add(vl);
            break;
            case 2:
                BarcosAMotor bm = new BarcosAMotor();
                sm.crearAMotor(SB, bm);
                AB.add(bm);
                break;
            case 3:
                YatedeLujo yt = new YatedeLujo();
                st.crearYate(SB, yt);
                AB.add(yt);
                
        }
        
        }

    }
