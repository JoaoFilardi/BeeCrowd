import java.io.IOException;
import java.util.Scanner;
 
public class BC2413 {
 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        int result;
        
        result = (t * 2) * 2;
        
        System.out.println(result);
        
        sc.close();
 
    }
 
}