
package newpackage;

import java.util.Scanner;

/**
 *
 * @author ap550
 */
public class Ej1Triangulo {
       public static void main(String [] args){
    
         float B, H;
         
          Scanner key = new Scanner(System.in);
    
         System.out.println("INGRESE LA BASE DEL TRIANGULO: ");
                B= key.nextInt();
    
         System.out.println("INGRESE LA ALTURA DEK TRIANGULO: ");
                H= key.nextInt();
                
               float A= (B*H)/2;
                
          System.out.println("EL AREA DEL TRIANGULO ES: " + A);
    }
}
