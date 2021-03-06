
package ejercicio2boperadores66668;

public class Ejercicio2BOperadores66668 {

    public static void main(String[] args) {

         int [ ] [ ] matriz = new int [2] [2];
         matriz [0] [0] = 11;
         matriz [0] [1] = 12;
         matriz [1] [0] = 21;
         matriz [1] [1] = 22;
         
         System.out.println("Una matriz de 2 x 2:");
         System.out.println("[" + matriz [0] [0] + " " + matriz [0] [1] + "]");
         System.out.println("[" + matriz [1] [0] + " " + matriz [1] [1] + "]");

         int suma1 = (matriz [0] [0] + matriz [1] [1]);
         int suma2 = (matriz [0] [1] + matriz [1] [1]);
         int determinante = suma1 * suma2;
         
         
         System.out.println("La determinante de la matriz es "  + determinante);
  
    }
    
}
