package assignment4;

import java.util.Scanner;

public class NumberPyramid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of rows for the Pyramid : ");
        int n = scanner.nextInt();

        System.out.println(" Number of Paramid : ");
        for (int i = 1; i <= n; i++) { //Vong lap ngoai de in ra tung hang
            for (int j = 1; j <= i; j++) {// Vong lap trong de in ra cac so cua hang
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }

}
