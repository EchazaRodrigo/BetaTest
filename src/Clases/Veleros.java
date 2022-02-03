package Clases;

import java.util.Date;


public class Veleros extends Barco {
    
   private Integer mastiles;

    public Veleros() {
   super();
    }

    public Veleros(Integer mastiles, String matricula, Integer eslora, Date anioFab) {
        super(matricula, eslora, anioFab);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Veleros{" + "mastiles=" + mastiles + super.toString()+'}';
    }
   
   

}
