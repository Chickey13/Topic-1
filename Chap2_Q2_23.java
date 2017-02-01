import java.util.Scanner; //scanner is in the java.util package

public class Chap2_Q2_23 {

	public static void main(String[] args) {
		// This program will computer cost of driving 
		//Create scanner object
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Driving distance: ");//prompt user for driving distance
		Float Drivingdistance = input.nextFloat();
		System.out.print("Enter the Miles per gallon: ");//prompt user for miles per gallon
		Float Milespergallon = input.nextFloat();
		System.out.print("Enter the Price per gallon: ");//prompt user for price per gallon
		Float Pricepergallon = input.nextFloat();
		Float Cost = ((Drivingdistance/Milespergallon) * Pricepergallon); //compute cost of driving	
		//Display Cost of Driving 
		System.out.print("The Cost of driving is $");
		System.out.format("%.2f%n", (Cost)); //round to two decimal places (http://stackoverflow.com/questions/26557213/too-many-decimal-places-when-using-java0
		
	}

}
