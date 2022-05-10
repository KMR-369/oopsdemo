package week1assignments;

import java.util.Scanner;

/*
 * Program that inputs three integers from the user and displays the 
 * sum, average, product, smallest
 * and largest of the numbers.
 */
public class ProductAvg {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 values:");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		s.close();
		System.out.println("The product of three numbers is:"+(a*b*c));
		System.out.println("The Average of three numbers is:"+((float)(a+b+c)/3));
		if(a>b && a>c)
		{
			System.out.println(a+" is greatest");
		}
		else if(b>c)
		{
			System.out.println(b+" is greatest");
		}
		else
		{
			System.out.println(c+" is greatest");
		}
		if(a<b && a<c)
		{
			System.out.println(a+" is Smallest");
		}
		else if(b<c)
		{
			System.out.println(b+" is Smallest");
		}
		else
		{
			System.out.println(c+" is Smallest");
		}
	}
}
