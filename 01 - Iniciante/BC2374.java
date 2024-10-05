import java.io.IOException;
import java.util.Scanner;

public class BC2374 {
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        
        int difPress = N-M;
        
        System.out.println(difPress);
        
        scanner.close();
    }
 
}