package week2assignments;

class Rectangle
{
	float length,breadth;

	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	float area()
	{
		return (this.length*this.breadth);
	}
}

public class RectangleTest {

	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		
		System.out.println("The area of first rectangle is: "+r1.area());
		System.out.println("The area of second rectangle is: "+r2.area());
		

	}

}
