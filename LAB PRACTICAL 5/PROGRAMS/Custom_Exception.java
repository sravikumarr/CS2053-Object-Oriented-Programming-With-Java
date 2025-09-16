
import java.util.Scanner;

class MarksException extends Exception {
	public MarksException(String message) {
		super(message);
	}
}
public class Custom_Exception {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks (0-100): ");
		int marks = sc.nextInt();
		
		try {
			if (marks < 0 || marks > 100) {
				throw new MarksException("Marks between (0-100)");
			} else {
				System.out.println("Marks entered:" + marks);
			}
		} catch (MarksException e) {
			System.out.println(e.getMessage()); // show the actual error
        } finally {
            System.out.println("Program continues...");
            sc.close();
		}
	}
}  
     