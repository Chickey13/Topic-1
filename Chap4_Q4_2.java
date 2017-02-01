import java.util.Scanner; //scanner is in the java.util package

public class Chap4_Q4_2 {

	public static void main(String[] args) {
		// This application will find the great circle distance between two points
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user for coordinates for point 1
		System.out.print("Enter point 1 (lattitude and longitude): ");
		double x1 = Math.toRadians(input.nextDouble());//convert input to Radians
		double y1 = Math.toRadians(input.nextDouble());//convert input to Radians
		
		System.out.print("Enter point 2 (lattitude and longitude): ");
		//convert input to radians
		double x2 = Math.toRadians(input.nextDouble());//convert input to Radians
		double y2 = Math.toRadians(input.nextDouble());//convert input to Radians
		double distance = 6371.01 * Math.acos(Math.sin(x1) * Math.sin(x2) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)));
		
		System.out.print("The distance between the two points is: " + distance + " km" );
	}	

}
