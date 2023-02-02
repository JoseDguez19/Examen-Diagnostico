/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author ap550
 */
import java.util.Scanner;

public class Ej11Switch {
    
  public static void main(String[] args) {
      
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Ingrese el primer número: ");
    double a = entrada.nextDouble();
    System.out.print("Ingrese el segundo número: ");
    double b = entrada.nextDouble();

    System.out.println("Elija una opción:");
    System.out.println("1. Suma");
    System.out.println("2. División");
    System.out.println("3. Multiplicación");
    System.out.println("4. Resta");
    int opcion = entrada.nextInt();

    switch (opcion) {
      case 1:
        System.out.println("El resultado de la suma es: " + (a + b));
        break;
      case 2:
        System.out.println("El resultado de la división es: " + (a / b));
        break;
      case 3:
        System.out.println("El resultado de la multiplicación es: " + (a * b));
        break;
      case 4:
        System.out.println("El resultado de la resta es: " + (a - b));
        break;
      default:
        System.out.println("Opción inválida");
        break;
    }
  }
}
