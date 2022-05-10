package oops.assignment;

public class BenzTruck implements Truck
{
	protected int Axles;
	protected double Weight;
	
	public BenzTruck(int axles, double weight) {
		this.Axles = axles;
		this.Weight = weight;
	}
	
	@Override
	public int getAxles() {
		return this.Axles;
	}
	
	@Override
	public double getWeight() {
		return this.Weight;
	}

}
