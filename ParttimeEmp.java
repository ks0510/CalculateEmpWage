package wagecalculation;
/**
 * 
 * @author Kaif
 *
 */

public class PartTimeEmp {
	
	/*
         *Created method to add part time employee feature
	 * 
	 */

	public static void main(String[] args) {
		
		 /*
         * 1) Calculate the random number
         */
        double isPresent = Math.random() * 3;
        
        int emphour=0;
        
        if (isPresent >= 2) {
        	emphour=12;
        	System.out.println("Employee is present");
        }
        /*
         * 2) Added part time hour
         */
        else if (isPresent >= 1 && isPresent < 2) {
        	 emphour = 8;
        	System.out.println("Employee is partial present");
        }
        else {
              System.out.println("Employee is absent");
        }
        System.out.println("Employee Working hour is "+emphour);
     }
}
