import java.util.*;
import java.util.Scanner;
public class main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if (x%3==0 || x%5==0) {
        System.out.println("Divisible");
    } else {
        System.out.println("Not Divisible");
    }
    }
}