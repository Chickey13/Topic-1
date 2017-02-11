import java.util.Scanner;
public class Chap3_Q3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a,b,c,d,e,f ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		//Find Determinant
		double determinant = (a*d - b*c);
		
		//Perform Cramer's Rule
		double x = ((e*d - f*b)/determinant);
		double y = ((a*f - c*e)/determinant);
		 
		if (determinant == 0){
			System.out.println("The equation has no solution");
		System.exit(0);
		}
		else if (determinant != 0);
			System.out.println("x = " + x + " y = " + y);	
		
		
	}

}
