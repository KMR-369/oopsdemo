package week1assignments;

import java.util.Scanner;

/*
 *Program to enter Marks of Robert in three subjects are entered 
 * at runtime (each out of 100 ), 
 * calculate his total marks and percentage marks.
 */
public class RobertMarks {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter marks of 3 subjects:");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		s.close();
		System.out.println("The total marks obtained by Robert are:"+(a+b+c));
		System.out.format("The percentage of Robert is: %.2f",(float)(a+b+c)*100/300);
	}

}
