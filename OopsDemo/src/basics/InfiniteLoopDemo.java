package basics;

import java.util.Scanner;

/*program below calculates the sum of numbers entered by the
 * user until user enters a negative number.
 */
public class InfiniteLoopDemo{
	public static void main(String[] args) {
		Double number, sum = 0.0;

		// create an object of Scanner
		Scanner s = new Scanner(System.in);

		while (true)
		{
			System.out.print("Enter a number: ");

			// takes double input from user
			number = s.nextDouble();

			// if number is negative the loop terminates
			if (number < 0.0)
			{
				break;
			}

			sum += number;
		}
		System.out.println("Sum = " + sum);
		s.close();
	}

}
