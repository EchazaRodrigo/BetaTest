package Clases;


public class Rectangulo {

    public Integer base;
    public Integer Altura;

    public Rectangulo() {
    }

    public Rectangulo(Integer base, Integer Altura) {
        this.base = base;
        this.Altura = Altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setBase(Integer base) {
        this.base = base;
    }

    public Integer getAltura() {
        return Altura;
    }

    public void setAltura(Integer Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", Altura=" + Altura + '}';
    }
    
    
    
    
}
