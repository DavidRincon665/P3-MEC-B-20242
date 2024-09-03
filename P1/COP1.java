/*Correccion parcial .Crear una clase llamada triangulo con atributos base y altura aplicar encapsulamiento y los metodos apropiados para inicializar o crear objetos con su respectivos atributos */
package javaapplication1;


public class Triangulo {
  
    private double base;
    private double altura;

   
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
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
