package newpackage;

import java.util.Scanner;

public class Ej4Suma_Mul_Div {
    
    public static void main(String [] args){
    
        Scanner entrada = new Scanner(System.in);
        int A, B;
        
        System.out.println("Ingrese un numero: ");
            A= entrada.nextInt();
            
        System.out.println("Ingrese otro numero: ");
            B= entrada.nextInt();
            
        int S= A + B;
        int R= (S * A) / B;
        
        System.out.println("El resultado es: " + R);
    }
}
