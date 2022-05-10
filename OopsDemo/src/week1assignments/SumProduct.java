package week1assignments;
/*
 * Program to take two values from user
 * and display their sum,product
 * difference and Quotient
 */
import java.util.Scanner;

public class SumProduct {
	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st value:");
		a = s.nextInt();
		System.out.println("Enter 2nd value:");
		b = s.nextInt();
		s.close();
		System.out.println("The Sum of two numbers is:"+(a+b));
		System.out.println("The Product of two numbers is:"+(a*b));
		System.out.println("The Difference of two numbers is:"+(a-b));
		System.out.println("The Quotient of two numbers is:"+(float)a/b);
		
	}
}
