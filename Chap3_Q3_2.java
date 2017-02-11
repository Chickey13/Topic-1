import java.util.Scanner;

public class Chap3_Q3_2 {

	public static void main(String[] args) {
		// This program produces Auto-generated number addition
		
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() /7 % 10);
		int number3 = (int)(System.currentTimeMillis() /7 % 10);
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
		
		int answer = input.nextInt();
		
		System.out.println(
				number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
				(number1 + number2 + number3 == answer));
	}

}
