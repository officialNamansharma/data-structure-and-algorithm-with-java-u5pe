import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int cp = sc.nextInt();
       int sp = sc.nextInt();
    
    if (cp>sp) {
        System.out.println("Loss");
    } else if(cp<sp) {
        System.out.println("Profit");
    } else {
        System.out.printf("No Profit, No Loss");
    }
    }
}