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

public class Ej8Calf {
    
  public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese una calificación de 0 a 10: ");
    int calificacion = scanner.nextInt();
    if (calificacion >= 7) {
      System.out.println("Aprobado");
    } else {
      System.out.println("Reprobado");
    }
  
  }
}
