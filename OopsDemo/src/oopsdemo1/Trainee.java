package oopsdemo1;

//program to demonstrate constructors and generate them in eclipse
//generate constructors --> Right click --> Source -> generate Constructor
public class Trainee {

	private int id;
	private String name,tech;
	private double stipend;

	public Trainee() {
		System.out.println("Implicit constructor");

		this.id = 111;
		this.name = "radhe shyam";
		this.tech = "python";
		this.stipend=5500;
	}

	public Trainee(int id, String name, String tech, double stipend) {
		this.id = id;
		this.name = name;
		this.tech = tech;
		this.stipend = stipend;
	}

	void display()
	{
		System.out.println("************ Trainee Detials ***************");
		System.out.println(this.id+ " "+this.name+" "+this.tech+" "+this.stipend);
		System.out.println("-------------------------------------------");
	}
}
