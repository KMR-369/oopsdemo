package week1assignments;

import java.util.Scanner;

/*
 * Program to take two double inputs for length and breadth 
 * of a rectangle and 
 * print area type casted to integer.
 */
public class RectangleArea {

	public static void main(String[] args) {
		double l,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of Rectangle:");
		l = s.nextDouble();
		System.out.println("Enter breadth of Rectangle:");
		b = s.nextDouble();
		s.close();
		System.out.println("The area of rectangle is:"+(int)(l*b));
	}

}
