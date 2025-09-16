
import java.util.Scanner;

class InvalidAge extends Exception {
    public InvalidAge(String message) {
        super(message);
    }
}

public class SimpleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        try {
            // Step 2: Check condition and throw exception if invalid
            if (age < 5 || age > 18) {
                throw new InvalidAge("Error: Age must be between 5 and 18!");
            }
            System.out.println("Valid age: " + age);
        } catch (InvalidAge e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program continues...");
            sc.close();
        }
    }
}
  