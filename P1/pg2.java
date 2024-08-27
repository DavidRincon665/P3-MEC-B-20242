/*A partir de la clase triangulo crear sobrecarga al constructor y crear 2 objetos para cada una de las formas del constructor*/
package javaapplication1;


public class Triangulo {

    public static void main(String[] args, triangulo Triangulo) {
        int base =0;
        int altura =0;
        Triangulo = new triangulo (base, altura);
    
        return(triangulo(int base , int altura));//sobre carga
  
    }

    private static class Altura {
     
        public static void Altura() {
            Altura = new altura() ;
        }
    }
     private static class Base  {

        public static void Base() {
            Base = new base () ;
        }
    }

    private static class triangulo {

        public triangulo(int base, int altura) {
        }
    }
   
}
