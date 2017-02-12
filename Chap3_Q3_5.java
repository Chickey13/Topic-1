import java.util.Scanner;
public class Chap3_Q3_5 {

	public static void main(String[] args) {
		// This application will find the day of a week
		String day = null;
		String future = null;
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//prompt user for today's day
		
		System.out.println("Enter today's day: ");
		int today = input.nextInt();
		//prompt user for elapsed days
		System.out.print("Enter the number of days elapsed from today: ");
		int elapsed = input.nextInt();
		
		if (today == 0) day = "Sunday";
		else if (today == 1) day = "Monday";
		else if (today == 2) day = "Tuesday";
		else if (today == 3) day = "Wednesday";
		else if (today == 4) day = "Thursday";
		else if (today == 5) day = "Friday";
		else day = "Saturday";
		//calulate future day
		int futureday = (today + elapsed) % 7;
		
		if (futureday == 0) future = "Sunday";
		else if (futureday== 1) future = "Monday";
		else if (futureday == 2) future = "Tuesday";
		else if (futureday == 3) future = "Wednesday";
		else if (futureday == 4) future = "Thursday";
		else if (futureday == 5) future = "Friday";
		else future = "Saturday";
		//output		
  		System.out.println("Today is " + day + " The future day is " + future +"." + elapsed);
	
	}
	}

	

