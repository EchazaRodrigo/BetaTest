package Clases;

public interface CalculosCirculo <P>{
    
//
// Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2   
    public final double PI = Math.PI;
    
    public Double AreaCirculo(P circ);
    public Double PerimetroCirculo(P circ);

}
