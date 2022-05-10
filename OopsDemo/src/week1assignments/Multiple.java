package week1assignments;

import java.util.Scanner;

/*
 * Program that reads two integers, 
 * determines whether the first is a multiple of the second and 
 * print the result.
 */
public class Multiple {

	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		a = s.nextInt();
		System.out.println("Enter 2nd Number:");
		b = s.nextInt();
		s.close();
		if(a%b==0)
		{
			System.out.println(a+" is multiple of "+b);
		}
		else
		{
			System.out.println(a+" is not multiple of "+b);
		}

	}

}
