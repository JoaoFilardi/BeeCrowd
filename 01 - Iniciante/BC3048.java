import java.io.IOException;
import java.util.Scanner;

public class BC3048 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] seq = new int[N];
        
        for (int i = 0; i < N; i++) {
            seq[i] = sc.nextInt();
        }
        
        int maxCount = 1; 

        for (int i = 1; i < N; i++) {
            if (seq[i] != seq[i - 1]) {
                maxCount++; 
            }
        }

        
        System.out.println(maxCount);
        
        sc.close();
    }
}
