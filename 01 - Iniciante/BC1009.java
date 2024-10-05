import java.io.IOException;
import java.util.Scanner;
 
public class BC1009 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        
        double salario = sc.nextDouble();
        double  vendas = sc.nextDouble();
        
        double comissao = 0.15 * vendas;
        
        double total = comissao + salario;
        
        System.out.println("TOTAL = R$ " + String.format("%.2f", total));
        
        sc.close();
 
    }
 
}