package week1assignments;
/*
 * Program to convert fahrenheit to celcius
 */
import java.util.Scanner;

public class FtoC {

	public static void main(String[] args) {

		float f,c;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit:");
		f = s.nextFloat();
		s.close();
		c = ((float)(f-32)*5)/9;
		System.out.println("The temperature in celcius is:"+c);
	}

}
