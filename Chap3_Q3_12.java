import java.util.Scanner;

public class Chap3_Q3_12 {

		public static void main(String[] args) {
			// This application will find the day of a week
			int Palindrome;
			//Create scanner object
			Scanner input = new Scanner(System.in);
			//prompt user for integer1
			System.out.println("Enter three numbers: ");
			int digit1 = input.nextInt();
			int digit2 = input.nextInt();
			int digit3 = input.nextInt();
			Palindrome = (digit1 - digit3);
			
			//determine if number is a palindrome
			if (Palindrome == 0){
				System.out.print("Palindrome");}
			else  {
				System.out.print("Not a Palindrome");}
				
			}
			
}

		


