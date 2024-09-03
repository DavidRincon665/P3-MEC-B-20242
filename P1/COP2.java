/*A partir de la clase triangulo crear sobrecarga al constructor y crear 2 objetos para cada una de las formas del constructor*/

package javaapplication1;

public class Triangulo {
  
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
    }

    public Triangulo() {
    }

    
    public Triangulo(double base) {
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(0, 0); 
        Triangulo triangulo2 = new Triangulo(); 
        Triangulo triangulo3 = new Triangulo(0); 
    }
}
