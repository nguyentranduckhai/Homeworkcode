package assignment4;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a int number : ");
        int n = scanner.nextInt();
        int sumofdigits = 0;// tao bien tong cac chu so cua so nguyen
        while (n > 0) {
            int digit = n % 10;// Lay chu so cuoi cung cua n
            sumofdigits = sumofdigits + digit; // cong chu so cuoi cung cua n vao tong
            n = n / 10; // Loai bo chu so cuoi cung

        }
        System.out.println("Sum of digits is : " + sumofdigits);
    }

}
