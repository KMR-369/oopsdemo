package basics;

import java.util.Scanner;

public class Greatest2 {

	public static void main(String[] args) {
		
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		a = s.nextInt();
		b = s.nextInt();
		
		if(a>b)
		{
			System.out.println(a+" is greatest");
		}
		else
		{
			System.out.println(b+" is greatest");
		}
		s.close();
	}

}
