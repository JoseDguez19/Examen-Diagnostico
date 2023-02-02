import java.util.Scanner;

public class Examen2_16 {
    public static void main(String []args){
    
        Scanner entrada = new Scanner(System.in);
        
        int N1, N2;
        
        System.out.println("Ingrese un digito: ");
        N1= entrada.nextInt();
        
        System.out.println("Ingrese un digito: ");
        N2 = entrada.nextInt();
    
        if(N1>N2){

            System.out.println(N1 + " Es mas grande que: " + N2);
        }
        
        if(N2>N1){
        
            System.out.println(N2 + " Es mas grande que: " + N1);
        }
    
        if(N1==N2){
        
            System.out.println(N1 + " Es igual a: " + N2);
        }
    }
}
