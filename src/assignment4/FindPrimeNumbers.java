package assignment4;

public class FindPrimeNumbers {

    public static boolean CheckPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return x > 1;
    }

    public static void main(String[] args) {
        System.out.println(" Prime number from 1 to 100 is : ");
        for (int i = 1; i <= 100; i++) {
            if (CheckPrime(i)) { //Kiem tra so nguyen to
                System.out.println(i + " ");
            }
        }

    }

}
