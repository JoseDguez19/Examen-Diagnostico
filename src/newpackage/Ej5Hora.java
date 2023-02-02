package newpackage;

import java.util.Scanner;

public class Ej5Hora {

    public static void main(String [] args){
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 0 y 23: ");
            int hora= entrada.nextInt();
            
        if(hora==7){
            System.out.println("Levantate");
        }
    }
}
