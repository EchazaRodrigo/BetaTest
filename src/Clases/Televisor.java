package Clases;

public class Televisor extends Electrodomestico {

    private Double resolucion;
    private Boolean TDT = false;

    public Televisor() {
        super();
    }

    public Televisor(Double resolucion, Boolean TDT, Double Precio, String Color, String ConsumoE, Double Peso) {
        super(Precio, Color, ConsumoE, Peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", TDT=" + TDT + super.toString() + '}';
    }

    public Boolean getTDT() {
        return TDT;
    }

    public void setTDT(Boolean TDT) {
        this.TDT = TDT;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        System.out.println("ingrese la resolucion");
        this.resolucion = Leer.nextDouble();
        System.out.println("Tiene TDT? S/N");
        String aux = Leer.next();

        if (aux.equalsIgnoreCase("s")) {
            this.TDT = true;
        }
    }

    public void precioFinal() {
        double aux = 0, aux2 = 0;
        if (this.resolucion > 40) {
            aux = aux + (this.Precio * 0.30);
        }
        if (TDT) {
            aux2 = 500;
        }

        this.Precio = (this.precioFinal(this.ConsumoE, this.Peso) + this.Precio) + aux + aux2;

    }
}
