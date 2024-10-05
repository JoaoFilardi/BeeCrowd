import java.io.IOException;
import java.util.Scanner;


public class BC1008 {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int hours = scanner.nextInt();
        
        float pricePerHour = scanner.nextFloat();
        
        float salary = hours * pricePerHour;
        
        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$ " + String.format("%.2f", salary));
        
        scanner.close();
 
    }
 
}