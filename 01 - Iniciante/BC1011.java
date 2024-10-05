import java.io.IOException;
import java.util.Scanner;

public class BC1011 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        double raio = sc.nextDouble();
        final double pi = 3.14159;
        
        double volume = (4.0/3.0) * pi * (raio * raio * raio);
        
        System.out.println("VOLUME = " + String.format("%.3f", volume));
        
        sc.close();
 
    }
 
}