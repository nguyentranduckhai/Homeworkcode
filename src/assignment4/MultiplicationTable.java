package assignment4;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to create a Multiplication Table of it :");
        int number = scanner.nextInt();
        System.out.println("Multiplication Table of" + number + " : ");
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }

}
