package wagecalculation;
/**
 * 
 * @author Kaif
 *
 */

public class CalculateDailyWagw {
	/*
	 * This method is created for calculating daily wage
	 */

	public static void main(String[] args) {
		
		int wageperhour=20;
		int fulldayhour=8;
		
		/*
		 * To calculate Daily Wage
		 */
		int dailywage=wageperhour*fulldayhour;
		
		System.out.println("Daily Wage of Employee is "+dailywage);
	}
}
