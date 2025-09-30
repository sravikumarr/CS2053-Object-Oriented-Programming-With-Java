// WAP in java to check whether the given number is a palindrome or not

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;
        int temp = num;

        // Reverse the number
        while (temp != 0) {
            int digit = temp % 10;   
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        // Check palindrome
        if (num == reversed) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is NOT a Palindrome");
        }

        sc.close();
    }
}
