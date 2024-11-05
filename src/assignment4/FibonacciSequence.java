package assignment4;

import java.util.Scanner;

public class FibonacciSequence {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of elements to print in the Fibonacci sequence : ");
        int n = scanner.nextInt();
        int firstnumber = 0;
        int secondnumber = 1;
        
        System.out.println("Fibonacci sequence is : ");
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.print(firstnumber + " ");
            } else if (i == 2) {
                System.out.print(secondnumber + " ");
                
            } else {
                int nextnumber = firstnumber + secondnumber;
                System.out.print(nextnumber + " ");
                firstnumber = secondnumber;
                secondnumber = nextnumber;
                
            }
        }
    }
    
}
