package newpackage;

import java.util.Scanner;

public class Ej7NumeroContador {
    
  public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
   
    System.out.print("Ingrese un número: ");
   
    int num = scanner.nextInt();
   
    for (int i = 1; i <= num; i++) {
      System.out.println(i);
    }
  }
}
