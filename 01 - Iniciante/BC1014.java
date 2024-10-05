import java.io.IOException;
import java.util.Scanner;

public class BC1014 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        float Y = sc.nextFloat();
        
        float kmPorLitro = X / Y;
        
        System.out.println(String.format("%.3f", kmPorLitro) + " km/l");
        
        sc.close();
        
    }
 
}