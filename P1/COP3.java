/*crear 2 metodos puros que permitan obtener area y perimetro del triangulo asumiendo que todos son triangulo rectangulo*/
package javaapplication1;

public class Triangulo {
  
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo() {
    }

    public Triangulo(double base) {
        this.base = base;
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

    public double calcularArea() {
        return 0.5 * base * altura;
    }

    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(base * base + altura * altura);
        return base + altura + hipotenusa;
    }
}

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(0, 0); }
        Triangulo triangulo2 = new Triangulo(); 
        Triangulo triangulo3 = new Triangulo(0); 
    }
}
