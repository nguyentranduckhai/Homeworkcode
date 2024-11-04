package assignment4;

public class SumOfOddAndEvenNumbers {

    public static void main(String[] args) {
        int sumeven = 0; // Tong so chan
        int sumodd = 0; // Tong so le
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sumeven = sumeven + i;
            } else {
                sumodd = sumodd + i;
            }
        }
        System.out.println("Sum of Even numbers from 1 to 100 is : " + sumeven);
        //Tong so chan tu 1 den 100 
        System.out.println("Sum of Odd numbers from 1 to 100 is : " + sumodd);
        //Tong so le tu 1 den 100
    }

}
