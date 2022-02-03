package Clases;

import java.util.Date;

public class Barco {

    protected String matricula;
    protected Integer eslora;
    protected Date anioFab;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Date anioFab) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFab = anioFab;
    }

    
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Date getAnioFab() {
        return anioFab;
    }

    public void setAnioFab(Date anioFab) {
        this.anioFab = anioFab;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", anioFab=" + anioFab + '}';
    }

}
