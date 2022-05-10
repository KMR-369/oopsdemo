package basics;

import java.util.Scanner;

/*
 * Perform Arithmetic Operations using Switch Case
 */
public class SwitchDemo {

	public static void main(String[] args) {
		int a,b,res;
		String o;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("Enter Operator (+,-,*,/) :");
		o = s.next();
		switch(o)
		{
		case "+":
			res=a+b;
        	System.out.println("The Addition is :"+res);
        	break;
		case "-": 
			res=a-b;
        	System.out.println("The Subtraction is :"+res);
        	break;
		case "*": 
			res=a*b;
			System.out.println("The Multiplication is :"+res);
			break;
		case "/": 
			res=a/b;
			System.out.println("The Division is :"+res);
			break;
		default: 
			System.out.println("Invalid Operator");
		}
		s.close();
	}

}
