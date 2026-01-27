import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        int n = sc.nextInt();

        int a = 1;  // first term
        int d = 2;  // common difference

        // Printing AP terms up to n
        while (a <= n) {
            System.out.print(a + " ");
            a = a + d;
        }

        sc.close();
    }
}
