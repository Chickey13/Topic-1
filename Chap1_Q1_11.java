import java.math.BigDecimal;

public class Chap1_Q1_11 {

	public static void main(String[] args) {
		// This program will display the population for each of the next five years
		System.out.println("The number of births in year one is " + (365.0*24.0*60.0*60.0)/7);
		System.out.println("The number of deaths in year one is " + (365.0*24.0*60.0*60.0)/13);
		System.out.println("The number of immigrants in year one is " + (365.0*24.0*60.0*60.0)/45);
		System.out.println("The population after year one is " +  (312032486.0 + 365.0*24.0*60.0*60.0/45 + 365.0*24.0*60.0*60.0/13+365*24.0*60.0*60.0/7));
		System.out.println("The population after year two is " +  (312032486.0 + (365.0*24.0*60.0*60.0/45 + 365.0*24.0*60.0*60.0/13+365*24.0*60.0*60.0/7)*2));
		System.out.println("The population after year three is " +  (312032486.0 + (365.0*24.0*60.0*60.0/45 + 365.0*24.0*60.0*60.0/13+365*24.0*60.0*60.0/7)*3));
		System.out.println("The population after year four is " +  (312032486.0 + (365.0*24.0*60.0*60.0/45 + 365.0*24.0*60.0*60.0/13+365*24.0*60.0*60.0/7)*4));
		System.out.println("The population after year five is " +  (312032486.0 + (365.0*24.0*60.0*60.0/45 + 365.0*24.0*60.0*60.0/13+365*24.0*60.0*60.0/7)*5)
				);
	}

}

