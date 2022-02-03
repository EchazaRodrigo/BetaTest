package Clases;

import java.util.Date;


public class BarcosAMotor extends Barco {

    private int Potencia;

    public BarcosAMotor() {
        super();
    }

    public BarcosAMotor(int Potencia, String matricula, Integer eslora, Date anioFab) {
        super(matricula, eslora, anioFab);
        this.Potencia = Potencia;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    @Override
    public String toString() {
        return "BarcosAMotor{" + "Potencia=" + Potencia + super.toString()+'}';
    }
    
    
}
