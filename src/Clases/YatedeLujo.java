package Clases;

import java.util.Date;

public class YatedeLujo extends Barco {

    private Integer potencia;
    private Integer camarotes;

    public YatedeLujo() {
        super();
    }

    public YatedeLujo(Integer potencia, Integer camarotes, String matricula, Integer eslora, Date anioFab) {
        super(matricula, eslora, anioFab);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "YatedeLujo{" + "potencia=" + potencia + ", camarotes=" + camarotes + super.toString() + '}';
    }

}
