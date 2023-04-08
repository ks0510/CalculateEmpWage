package practice;

import java.util.*;

/**
 * 
 * @author Kaif
 *
 */

public class CalculateEmployeeWage {

	/**
	 * This mehtod is created to check the attendance of employee and calculate wage
	 * according to attendence.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * 1) Get the value from user for wage of employee 2) Get the value from user
		 * for number of days 3) Calculate the random number 4) Calculate the wage of
		 * employee if employee is present 5) Calculate the wage of employee if employee
		 * is partially present 6) Print if employee is absent 7) Print total wage of
		 * employee
		 */

		/*
		 * 1) Get the value from user for wage of employee
		 */

		Scanner sc = new Scanner(System.in);

		/*
		 * 1) Get the value from user for wage of employee
		 */
		System.out.println("Please enter wage of employee");
		int wageOfEmployee = sc.nextInt();

		int sumofwage = 0;

		/*
		 * 2) Get the value from user for number of days
		 */
		System.out.println("Please enter number of days");
		int numberOfDays = sc.nextInt();

		for (int i = 1; i <= numberOfDays; i++) {

			/*
			 * 3) Calculate the random number
			 */
			double isPresent = Math.random() * 3;

			/*
			 * 4) Calculate the wage of employee if employee is present
			 */
			if (isPresent >= 2) {
				sumofwage += wageOfEmployee;
				System.out.println("Employee is present");
			}

			/*
			 * 5) Calculate the wage of employee if employee is partially present
			 */
			else if (isPresent >= 1 && isPresent < 2) {
				sumofwage += (wageOfEmployee / 2);
				System.out.println("Employee is partial present");
			}

			/*
			 * 6) Print if employee is absent
			 */
			else {
				System.out.println("Employee is absent");
				System.out.println("Employee earned " + 0);
			}
		}

		/*
		 * 7) Print total wage of employee
		 */
		System.out.println("Employee earned " + sumofwage);
		sc.close();
	}
}
