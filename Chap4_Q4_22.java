import java.util.Scanner; //scanner is in the java.util package


public class Chap4_Q4_22 {

		public static void main(String[] args) {
			// This application will find test for substrings from user input
			//Create scanner object
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a line: ");
			String string1 = input.nextLine();
			System.out.print("Enter another line: ");
			String string2 = input.nextLine();
		//compare the two strings (got help on this part - found error - unnecessary semicolon
				if (string1.contains(string2)) {
				  System.out.println(string2 + " is a substring of " + string1); 
		} 		    else {
				
			  		System.out.println(string2 + " is not a substring of " + string1); 
		}
			  	
			
	}

		
}
