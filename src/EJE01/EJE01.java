package mains;

import Clases.AlquileresBarcos;
import Entidades.ServicioAlquileres;

public class EJE01 {

    public static void main(String[] args) {
      
ServicioAlquileres SA = new ServicioAlquileres();
AlquileresBarcos ab = new AlquileresBarcos();
SA.nuevoAlquiler(ab);
    }

}
