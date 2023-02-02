package newpackage;

import java.util.Scanner;

public class Ej2DolarPeso {
    
  public static void main(String[] args) {
      
    Scanner entrada = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de dolares: ");
    double Dolar = entrada.nextDouble();
    double Equivalencia = 20;
    double pesos = Dolar * Equivalencia;
    System.out.println(Dolar + " dolares son " + pesos + " pesos mexicanos");
  }
}
