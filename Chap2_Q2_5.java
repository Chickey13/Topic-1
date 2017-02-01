import java.util.Scanner; //scanner is in the java.util package
public class Chap2_Q2_5 {

	public static void main(String[] args) {
		// This program will compute gratuity and total 
		//Create scanner object
		Scanner input = new Scanner(System.in);
		//Prompt user for Subtotal and Gratuity rate;
		System.out.print("Enter the Subtotal and Gratuity Rate: ");
		double subtotal = input.nextDouble(), gratuityrate = input.nextDouble();
		double gratuity = (subtotal * gratuityrate); //compute gratuity
		double total = (subtotal + gratuity);//compute total
		//Display Gratuity and Total 
		System.out.println("The Gratuity is $" + (gratuity) + " The Total is $" + (total));

	}

}
