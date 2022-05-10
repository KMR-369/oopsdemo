package basics;

import java.util.Scanner;

/*
 * Program to find the
 * Area of a circle
 */

public class Area {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float a,r;
		final float pi = 3.14f;
		//taking radius input from user
		System.out.println("Enter the radius of circle:");
		r = s.nextFloat();
		a = pi*r*r;
		//Printing the area of circle
		System.out.println("The area of circle is:");
		System.out.format("%.3f",a);
		s.close();
	}

}
