package wagecalculation;
/**
 * 
 * @author Kaif
 *
 */

public class EmpWageSwitchCase {
	
	/**
	 * Created this method to check attendance of employee
	 * using switch case
	 * @param args
	 */

	public static void main(String[] args) {
		
		/*
		 * 1)To Calculate the random number
		 * 2) To convert random number into integer to use in switch case
		 * 3) To check the attendance of employee used switch case
		 * 4) To Print if employee is present
		 * 5) To Print if employee is partialy present
		 * 6) To Print if employee is absent
		 */
		
		/*
		 * 1)To Calculate the random number
		 */
		
		 double ispresent = Math.random()*3;
		
		 /*
                 *2) To convert random number into integer to use in switch case
                 */

                 Double newData = new Double(ispresent);
                 int value = newData.intValue();
        
                 /*
                 *3) To check the attendance of employee used switch case
                 */
   
		switch (value) {
		case 1:
			/*
			 * 4) To Print if employee is present
			 */
			System.out.println("Employee is present");
			break;
		case 2:
			/*
			 * 5) To Print if employee is partialy present
			 */
			System.out.println("Employee is partialy present");
			break;
		default:
			/*
			 * 6) To Print if employee is absent
			 */
			System.out.println("Employee is absent");
		}
     }
}

