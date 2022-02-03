package Clases;

import java.util.ArrayList;
import java.util.Date;

public class AlquileresBarcos {

    private String nombre;
    private Double DNI;
    private Date fechaIni;
    private Date fechaDev;
    private Integer posicion;
    private ArrayList<Barco> barco = new ArrayList();

    public AlquileresBarcos() {
    }

    public AlquileresBarcos(String nombre, Double DNI, Date fechaIni, Date fechaDev, Integer posicion, ArrayList<Barco> barco) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaIni = fechaIni;
        this.fechaDev = fechaDev;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getDNI() {
        return DNI;
    }

    public void setDNI(Double DNI) {
        this.DNI = DNI;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(Date fechaDev) {
        this.fechaDev = fechaDev;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public ArrayList<Barco> getBarco() {
        return barco;
    }

    public void setBarco(ArrayList<Barco> barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "AlquileresBarcos{" + "nombre=" + nombre + ", DNI=" + DNI + ", fechaIni=" + fechaIni + ", fechaDev=" + fechaDev + ", posicion=" + posicion + ", barco=" + barco + '}';
    }
    
    
    
}