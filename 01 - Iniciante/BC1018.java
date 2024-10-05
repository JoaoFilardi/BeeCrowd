import java.io.IOException;
import java.util.Scanner;

public class BC1018 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int entrada;
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] qntNotas = new int[notas.length];
        
        do {
            entrada = sc.nextInt();
        } while (entrada < 0 || entrada > 1000000);
        
        int valor = entrada;
        
        for (int i = 0; i < notas.length; i++) {
            qntNotas[i] = valor / notas[i];
            valor -= qntNotas[i] * notas[i];
        }

        System.out.println(entrada);

        for (int i = 0; i < notas.length; i++) {
            System.out.println(qntNotas[i] + " nota(s) de R$ " + notas[i] + ",00");
        }
        
        sc.close();
        
    }
}