import java.util.Scanner;
public class Examen2_15 {
    
    public static void main(String [] args){
    
        int N1, N2;
        
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
            N1= Entrada.nextInt();
        
        System.out.println("Ingrese un número: ");
            N2= Entrada.nextInt();

           int S= N1 + N2;
           int R= N1 - N2;
           int M= N1 * N2;
           float Mo= N1 % N2;   
           float D= N1 / N2;
           System.out.println("EL RESULTADO DE LA SUMA ES: " + S);
           System.out.println("EL RESULTADO DE LA RESTA ES: " + R);
           System.out.println("EL RESULTADO DE LA MULTIPLICACION ES: " + M);
           System.out.println("EL RESULTADO DE LA DIVISIÓN ES: " + D);
           System.out.println("EL RESULTADO DEL MODULO DE LA DIVISIÓN ES: " + Mo);
    }
}
