import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Numbers less than or equal to 3 are not composite
        if (n <= 3) {
            System.out.println("No");
            return;
        }

        boolean isComposite = false;

        // Check for factors from 2 to √n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;
            }
        }

        if (isComposite) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
