import java.util.Scanner; //scanner is in the java.util package
public class Chap2_Q2_20 {

	public static void main(String[] args) {
		// This program will compute gratuity and total 
		//Create scanner object
		Scanner input = new Scanner(System.in);
		//Prompt user for Balance and Annual Interest rate;
		System.out.print("Enter the Balance and Annual Interest Rate: ");
		Float Balance = input.nextFloat(), Annualinterestrate = input.nextFloat();
		Float Interest = (Balance * (Annualinterestrate/1200)); //compute Interest
		//Display Interest 
		System.out.println("The Interest is $" + (Interest)); 
	}

}
