import java.util.Scanner; //scanner is in the java.util package
public class Chap2_Q2_4 {

	public static void main(String[] args) {
		// This program will convert pounds to kilograms
		//Create scanner object
		Scanner input = new Scanner(System.in);
		//Prompt user for number of pounds
		System.out.print("Enter the number of pounds: ");
		double pounds = input.nextDouble();
		final double POUNDS_TO_KILOGRAMS = 0.454; //declare Pounds to Kilometers at constant
		
		//Convert pounds to kilograms and Display result
		System.out.println("The number of Kilograms is " + (pounds * POUNDS_TO_KILOGRAMS));
		
	}

}
