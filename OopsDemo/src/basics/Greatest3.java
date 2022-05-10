package basics;

import java.util.Scanner;

public class Greatest3 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 3 numbers:");
		a = s.nextInt();
		b = s.nextInt();
		c = s.nextInt();
		if(a>b && a>c)
		{
			System.out.println(a+" is greatest");
		}
		else if(b>c)
		{
			System.out.println(b+" is greatest");
		}
		else if(c>a)
		{
			System.out.println(c+" is greatest");
		}
		else
		{
			System.out.println("All are equal");
		}
		s.close();

	}

}
