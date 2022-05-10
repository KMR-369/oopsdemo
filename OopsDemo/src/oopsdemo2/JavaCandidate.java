package oopsdemo2;

public class JavaCandidate extends Candidate {
	private String tech;
	private double perks;

	public JavaCandidate(int id, String name, double salary, String t) {
		super(id, name, salary);
		this.tech=t;
	}
	void getperks()
	{
		perks=salary*.10;
		System.out.println("perks of candidate"+perks);
	}
	void display()
	{
		super.display();
		System.out.println("Tech: "+this.tech);
	}

}