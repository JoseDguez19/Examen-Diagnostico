
public class Examen2_18 {
    
   public static void main(String[] args) {
      drawCuadrado();
      drawOvalo();
      drawFlecha();
      drawDiamante();
   }

   private static void drawCuadrado() {
      System.out.println("Cuadrado:");
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            System.out.print("* ");
         }
         System.out.println();
      }
      System.out.println();
   }

   private static void drawOvalo() {
      System.out.println("Ovalo:");
      for (int i = -4; i <= 4; i++) {
         for (int j = -4; j <= 4; j++) {
            if (i * i * 4 + j * j * 4 <= 16) {
               System.out.print("* ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
      System.out.println();
   }

   private static void drawFlecha() {
      System.out.println("Flecha:");
      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            if (i == j || i + j == 4) {
               System.out.print("* ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
      System.out.println();
   }

   private static void drawDiamante() {
      System.out.println("Diamante:");
      for (int i = -2; i <= 2; i++) {
         for (int j = -2; j <= 2; j++) {
            if (Math.abs(i) + Math.abs(j) <= 2) {
               System.out.print("* ");
            } else {
               System.out.print("  ");
            }
         }
         System.out.println();
      }
   }
}

