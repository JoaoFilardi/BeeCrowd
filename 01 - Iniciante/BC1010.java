import java.io.IOException;
import java.util.Scanner;

public class BC1010 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int codigo1 = sc.nextInt();
        int numPeca1 = sc.nextInt();
        double valor1 = sc.nextDouble();
        
        int codigo2 = sc.nextInt();
        int numPeca2 = sc.nextInt();
        double valor2 = sc.nextDouble();
        
        double total;
        
        total = numPeca1 * valor1;
        total += numPeca2 * valor2;
        
        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));
 
    }
 
}