/*crear 2 metodos puros que permitan obtener area y perimetro del triangulo asumiendo que todos son triangulo rectangulo*/
package javaapplication1;


public class Triangulo {

    public static void Triangulo(String[] args, triangulo Triangulo) {
        int base =0;
        int altura =0;
        Triangulo = new triangulo (base, altura);
        int area , perimetro; 
        int lado1= 0,lado2= 0, lado3 =0;
        area= (base*altura)/2 ;
       perimetro = (lado1+lado2+lado3);
        
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
