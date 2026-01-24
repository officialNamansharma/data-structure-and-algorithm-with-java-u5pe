import java.util.Scanner;

public class HelloWorldNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        int n = sc.nextInt();

        // Loop to print Hello World n times
        for (int i = 1; i <= n; i++) {
            System.out.println("Hello World");
        }

        sc.close();
    }
}
