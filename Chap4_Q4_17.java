import java.util.Scanner; //scanner is in the java.util package

public class Chap4_Q4_17 {

	//had to get help from a colleague and Stack Overflow - still a little confused about using strings to find the month days according to the year
		 public static void main(String args[]) {
			 Scanner input = new Scanner(System.in);
		//user input year
		     System.out.println("Enter a year: " );
		     int year = input.nextInt();
		     input.nextLine();
		//user input month     
		     System.out.println("Enter a month: ");
		     String month = input.nextLine();
        // rule to determine if year is a leapyear
		     boolean isLeapyear = (year % 400 == 0);
		//compare input 	 
			 switch (month){
			 case "Jan":
			 case "Mar":
			 case "May":
			 case "Jul":
			 case "Aug":
			 case "Oct":
			 case "Dec":
				 System.out.println(month + " " + year + " has 31 days"); break;
			 case "Apr":
			 case "Jun":
			 case "Sep":
			 case "Nov":
				 System.out.println(month + " " + year + " has 30 days");
			 case "Feb":
				 if(isLeapyear)
				 {
				 System.out.println(month + " " + year + " has 29 days");
				 }
				 else
				 {System.out.println(month + " " + year + " has 28 days");}
			 
			 }
				 
	}	
			
}		 
	
			

	    

