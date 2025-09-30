package Lab03; 

public class cal {
	public static void main(String[] args) {
		// Check 3 arguments
		if (args.length < 3) {
			System.out.println("Please provide two numbers.");
			return;  
		}
		
		//Converting command line arguments from string to integer
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		
		// Perform sum , sub, div 
		
		System.out.println("Provide three argument are "+ num1 +", "+ num2+ ", "+ num3 +" ");
		System.out.println("Sum is :" + (num1 + num2 + num3));
		System.out.println("Sub is :" + (num1 - num2 - num3));
		System.out.println("Product is :" + (num1 * num2 * num3));
		System.out.println("Division is :" + (num1 / num2 / num3));
       
	}

}
