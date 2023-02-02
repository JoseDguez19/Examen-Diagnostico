package newpackage;

import java.util.Scanner;

public class Ej6EdadMultiple {

    public static void main(String [] args){
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu edad: ");
            int edad = entrada.nextInt();
      
        if(edad>= 1 && edad<=12){
            System.out.println("Es niño");
        }

        if(edad>= 13 && edad<=17){
            System.out.println("Es adoslencente");
        }

        if(edad>= 18 && edad<=30){
            System.out.println("Es joven");
        }

        if(edad>= 31 && edad<=40){
            System.out.println("Es adulto");
        }

        if(edad>= 41 && edad<=55){
            System.out.println("Es adulto mayor");
        }

        if(edad>= 56 && edad<=99){
            System.out.println("Es anciano");
        }
    
        if(edad>=100){
            System.out.println("Felicidades");
        }
    }
}
