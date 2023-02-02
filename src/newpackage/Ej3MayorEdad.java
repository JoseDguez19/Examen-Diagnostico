package newpackage;

import java.util.Scanner;

public class Ej3MayorEdad {
    
    public static void main(String [] args){
    
        Scanner Entrada = new Scanner(System.in);
        int edad=0;
        System.out.println("Ingrese su edad: ");
            edad = Entrada.nextInt();
            
        if(edad>=18){
            System.out.println("ERES MAYOR DE EDAD.");
        } else if(edad<18){
            System.out.println("NO ERES MAYOR DE EDAD.");
        }
    }
}
