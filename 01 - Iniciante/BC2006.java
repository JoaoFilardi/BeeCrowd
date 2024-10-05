import java.util.Scanner;

public class BC2006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 0;
        do {
            T = sc.nextInt();
        } while (T < 1 || T > 4);

        int[] respostas = new int[5];

        for (int i = 0; i < 5; i++) {
            respostas[i] = sc.nextInt();
        }

        int respCorretas = 0;

        for (int resposta : respostas) {
            if (resposta == T) {
                respCorretas++;
            }
        }

        System.out.println(respCorretas);
        sc.close();
    }
}
