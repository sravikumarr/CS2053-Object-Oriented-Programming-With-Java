package Lab03;

public class cmd {
	public static void main(String[] args) {
        // Check if two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide two numbers.");
            return;
        }
        
        try {
            // Convert arguments to integers and add them
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println("The sum of "+ num1 +" and "+ num2 +" is : " + (num1 + num2));  // Display the result
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integers.");
        }
    }

}
