package wagecalculation;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class CalculateMonthlyEmpwage {
	/**
	 * This mehtod is created to check the attendance of employee and calculate wage
	 * according to attendence for a month.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * 1) To initialize all variables to zero to use in further calculation 2) Get
		 * the value from user for number of days 3) For loop to check attendance of
		 * employee for number of days 4) Calculate the random number 5) To convert
		 * random number into integer to use in switch case 6) To check the attendance
		 * of employee used switch case 7) To Print if employee is present 8) To Print
		 * if employee is partialy present 9) To Print if employee is absent 10) Put
		 * condition is given in problem statement number of days in month should be 20
		 * and total working hours should 100 11) To calculate wage of employee 12)To
		 * display total salary of employee for month
		 */

		/*
		 * 1) To initialize all variables to zero to use in further calculation
		 */

		int salaryperhour = 80;
		int totaldays = 0, totalhours = 0, totalsalary = 0, empworkhour = 0, salary = 0;

		Scanner sc = new Scanner(System.in);

		/*
		 * 2) Get the value from user for number of days
		 */

		System.out.println("Enter Number of Days");
		int NumofDays = sc.nextInt();

		/*
		 * 3) For loop to check attendance of employee for number of days
		 */
		int day = 1;

		for (; day <= NumofDays; day++) {

			/*
			 * 4) Calculate the random number
			 */
			double num = Math.random() * 3;

			/*
			 * 5) To convert random number into integer to use in switch case
			 */

			Double newData = new Double(num);
			int value = newData.intValue();

			/*
			 * 6) To check the attendance of employee used switch case
			 */

			switch (value) {
			case 1:

				/*
				 * 7) To Print if employee is present
				 */

				empworkhour = 8;
				System.out.println("Employee is present");

				break;
			case 2:

				/*
				 * 8) To Print if employee is partialy present
				 */

				empworkhour = 4;
				System.out.println("Employee is partialy present");

				break;
			default:

				/*
				 * 9) To Print if employee is absent
				 */

				empworkhour = 0;
				System.out.println("Employee is absent");
			}

			/*
			 * 10) Put condition is given in problem statement number of days in month
			 * should be 20 and total working hours should 100
			 */

			if (day <= 20 && totalhours <= 100) {

				/*
				 * 11) To calculate wage of employee
				 */

				salary = empworkhour * salaryperhour;

				totalsalary = totalsalary + salary;
				totalhours = totalhours + empworkhour;
			}
		}

		/*
		 * 12) To display total salary of employee for month
		 */

		System.out.println("Total salary of Employee "+totalsalary);
		System.out.println("Total Working Hours "+totalhours);
		System.out.println("Day number "+day);
	}
}
