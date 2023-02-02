import java.util.Scanner;

public class Examen2_17 {
    
    public static void main(String [] args){
    
    Scanner Teclado = new Scanner(System.in);
    
    int N1, N2, N3;
    
        System.out.println("Ingrese el primer numero: ");
            N1= Teclado.nextInt();
    
        System.out.println("Ingrese el segundo numero: ");
            N2= Teclado.nextInt();
    
        System.out.println("Ingrese el tercer numero: ");
            N3= Teclado.nextInt();
            
            int S = N1 + N2 + N3;
            int P = S / 3;
            int Prod = N1 * N2 * N3;
            
            System.out.println("EL RESULTADO DE LA SUMA ES: " + S);
            System.out.println("EL PROMEDIO ES: " + P);
            System.out.println("EL PRODUCTO ES: " + Prod);
            
            if(N1>N2 && N1>N3){
                System.out.println("EL NUMERO MAYOR ES: " + N1);
            }
            if(N2>N1 && N2>N3){
                System.out.println("EL NUMER MAYOR ES: " + N2);
            }
            if(N3>N1 && N3>N2){
                System.out.println("EL NUMERO MAYOR ES: " + N3);
            }
    }
}
