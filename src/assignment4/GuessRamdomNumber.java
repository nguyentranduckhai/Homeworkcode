package assignment4;

import java.util.Scanner;
import java.util.*;

public class GuessRamdomNumber {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomnumber = random.nextInt(50) + 1; // So ngau nhien tu 1 den 50
        int userguessnumber = 0;
        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Try to guess the number from 1 to 50");

        while (userguessnumber != randomnumber) {
            System.out.println("Enter a number you guess: ");
            userguessnumber = scanner.nextInt();

            if (userguessnumber > randomnumber) {
                System.out.println("Your number is Higher. Try again");
            } else if (userguessnumber < randomnumber) {
                System.out.println("Your number is Lower. Try again");
            } else {
                System.out.println("Corgratulation !!! You guess the correct number.");
            }
        }

    }
}
