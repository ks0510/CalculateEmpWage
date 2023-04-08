package wagecalculation;
/**
 * 
 * @author Kaif
 *
 */

public class CheckEmployee {
	/**
	 * created this following method to check attendance of Employee 
	 * @param args
	 */

	public static void main(String[] args) {
		
	/*
        * To Calculate the random number
        */
		
	double ispresent = Math.random()*3;
		 
	if (ispresent >= 2) {
             System.out.println("Employee is present");
         }
         else {
	     System.out.println("Employee is absent");
        }
    }
}
