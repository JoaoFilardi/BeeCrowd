import java.io.IOException;
import java.util.Scanner;

public class BC1013 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int A, B, C;
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        
        int maiorAB = (A + B + Math.abs(A-B)) / 2;
        int maior = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
        
        System.out.println(maior + " eh o maior");
        
        sc.close();
    }
 
}