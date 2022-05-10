package week2assignments;

class Rectangle2
{
	float length,breadth;

	public Rectangle2(float length, float b) {
		this.length = length;
		this.breadth = b;
	}
	
	float Area()
	{
		return (this.breadth*this.length);
	}
	
	float peri()
	{
		
		return(2*(this.breadth+this.length));
	}	
}

class Square extends Rectangle2
{
	float s;
	public Square(float s) {
		super(s,s);
	}
	
}
public class RectangleTest2 {

	public static void main(String[] args) {
		
		Rectangle2 r1 = new Rectangle2(2,4);
		Square s1 = new Square(4);
		
		System.out.println("The area of Rectangle is: "+r1.Area());
		System.out.println("The Perimeter of Rectangle is: "+r1.peri());
		
		System.out.println("*********************************************");
		
		System.out.println("The area of Square is: "+s1.Area());
		System.out.println("The Perimeter of Square is: "+s1.peri());

	}

}
