import java.io.IOException;
import java.util.Scanner;

public class BC1012 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        
        final double pi = 3.14159;
        
        double areaTriangulo = (A * C) / 2;
        double areaCirculo = pi * (C * C);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = B * B;
        double areaRetangulo = A * B;
        
        System.out.println("TRIANGULO: " + String.format("%.3f", areaTriangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", areaCirculo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", areaTrapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", areaQuadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", areaRetangulo));
        
        sc.close();
 
    }
 
}