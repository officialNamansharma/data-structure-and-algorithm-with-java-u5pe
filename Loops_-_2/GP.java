import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // first term
        int r = sc.nextInt(); // common ratio
        int n = sc.nextInt(); // number of terms

        int term = a;

        for (int i = 1; i <= n; i++) {
            System.out.println(term);
            term = term * r;
        }
    }
}
