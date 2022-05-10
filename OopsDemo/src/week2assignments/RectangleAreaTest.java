package week2assignments;

import java.util.Scanner;

class Area
{
	float length,breadth;

	public Area(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	float returnArea()
	{
		return this.length*this.breadth;
	}
}

public class RectangleAreaTest {

	public static void main(String[] args) 
	{
		float l,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of rectangle: ");
		l = s.nextFloat();
		System.out.println("Enter the breadth of rectangle: ");
		b = s.nextFloat();
		s.close();
		
		Area a1 = new Area(l,b);
		System.out.println("The area of rectangle is: "+a1.returnArea());
		
	}

}
