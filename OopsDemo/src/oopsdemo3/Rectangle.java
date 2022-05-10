package oopsdemo3;

public class Rectangle implements IShape
{
	protected double width,height;
	
	//generate constructor using fields
	public Rectangle(double width, double height) {
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}

	@Override
	public double getArea()
	{
		return this.height*this.width;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
}
