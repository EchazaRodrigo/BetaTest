package Clases;

import java.util.Scanner;

public class Electrodomestico {

    Scanner Leer = new Scanner(System.in);

    protected Double Precio;
    protected String Color;
    protected String ConsumoE;
    protected Double Peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double Precio, String Color, String ConsumoE, Double Peso) {
        this.Precio = Precio;
        this.Color = Color;
        this.ConsumoE = ConsumoE;
        this.Peso = Peso;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = this.comprobarColor(Color);
    }

    public String getConsumoE() {
        return ConsumoE;
    }

    public void setConsumoE(String ConsumoE) {
        this.ConsumoE = this.comprobarConsumoEnergetico(ConsumoE);
    }

    public Double getPeso() {
        return Peso;
    }

    public void setPeso(Double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "Precio=" + Precio + ", Color=" + Color + ", ConsumoE=" + ConsumoE + ", Peso=" + Peso + '}';
    }

    public Double precioFinal(String letraC, Double Peso) {
        int auxC = 0, auxP = 0;
        switch (letraC) {
            case "a":
                auxC = 1000;
                break;
            case "b":
                auxC = 800;
                break;
            case "c":
                auxC = 600;
                break;
            case "d":
                auxC = 500;
                break;
            case "e":
                auxC = 300;
                break;
            case "f":
                auxC = 100;
                break;
        }
        if (Peso > 1 && Peso < 19) {
            auxP = 100;
        }
        if (Peso > 20 && Peso < 49) {
            auxP = 500;
        }
        if (Peso > 50 && Peso < 79) {
            auxP = 800;
        }
        if (Peso > 80) {
            auxP = 1000;
        }
        double pf = auxC + auxP;
        return pf;
    }

    public void crearElectrodomestico() {

        this.Precio = 1000.;
        System.out.println("Ingrese el color");
        this.Color = this.comprobarColor(Leer.next());
        System.out.println("Ingrese la letra asociada al consumo electrico");
        this.ConsumoE = this.comprobarConsumoEnergetico(Leer.next());
        System.out.println("Ingrese el peso");
        this.Peso = (Leer.nextDouble());

    }

    public String comprobarConsumoEnergetico(String letra) {
        switch (letra.toLowerCase()) {
            case "a":
            case "b":
            case "c":
            case "d":
            case "e":
                return letra;
            default:
                letra = "f";
                return letra;
        }

    }

    public String comprobarColor(String color) {
        switch (color.toLowerCase()) {
            case "negro":
            case "rojo":
            case "azul":
            case "gris":
                return color;
            default:
                color = "blanco";
                return color;
        }
    }
}
