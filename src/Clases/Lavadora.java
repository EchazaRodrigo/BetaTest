package Clases;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    private Integer carga;

    public Lavadora() {
        super();
    }

    public Lavadora(Integer carga, Double Precio, String Color, String ConsumoE, Double Peso) {
        super(Precio, Color, ConsumoE, Peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + super.toString() + '}';
    }

    public void crearLavadora() {

        super.crearElectrodomestico();
        System.out.println("ingrese el valor de la carga");
        this.carga = Leer.nextInt();
    }

    public void precioFinal() {

        this.Precio = (this.precioFinal(this.ConsumoE, this.Peso) + this.Precio);
        if (carga > 30) {
            this.Precio += 500;
        }
    }
}
