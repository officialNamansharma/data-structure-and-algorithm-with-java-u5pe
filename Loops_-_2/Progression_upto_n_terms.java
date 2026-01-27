import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input: number of terms
        int n = sc.nextInt();

        int a = 1;  // first term
        int d = 2;  // common difference

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            a = a + d;
        }

        sc.close();
    }
}
