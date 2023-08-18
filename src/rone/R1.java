package rone;
import java.util.*;

public class R1 {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter your age:");
        Scanner sc;

        sc = new Scanner(System.in);

        a = sc.nextInt();
        

        if(a >= 18)
            System.out.println("You are elegible fotr voting");

        else
            System.out.println("You are in-eligible");
    }
    
}