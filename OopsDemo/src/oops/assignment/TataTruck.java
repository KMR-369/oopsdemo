package oops.assignment;

public class TataTruck implements Truck
{

	protected int Axles;
	protected double Weight;
	
	public TataTruck(int axles, double weight) {
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
