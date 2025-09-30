// WAP in java to find out whether a given numbe ris prime or not

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPrime = true; // Assume it's prime initially

        if (num <= 1) {
            isPrime = false; // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false; // Found a factor → not prime
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }

        sc.close();
    }
}
