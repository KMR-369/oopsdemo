package oopsdemo3;

class SoftwareEngineer
{
	protected String name,tech;
	double salary;
	
	public SoftwareEngineer(String name, String tech, double salary) {
		this.name = name;
		this.tech = tech;
		this.salary = salary;
	}
	
	final void display()
	{
		System.out.println(name+" "+tech+" "+salary);
	}
	
	void work()
	{
		System.out.println("Coding & Testing");
	}
	
}

class Developer extends SoftwareEngineer
{

	public Developer(String name, String tech, double salary) {
		super(name, tech, salary);

	}
	
	void work() //overridden method
	{
		System.out.println("Coding using: "+tech);
	}
}

class Tester extends SoftwareEngineer
{

	public Tester(String name, String tech, double salary) {
		super(name, tech, salary);
	}
	
	void work() //overridden method
	{
		System.out.println("Testing using : "+tech);
	}
	
}
public class OverrideDemo {

	public static void main(String[] args) {
		
		SoftwareEngineer s1 = new SoftwareEngineer("Navin", "Java Full Stack",35000);
		Developer d1 = new Developer("Gsoling", "Java", 25000);
		Tester t1 = new Tester("Mike","JMeter",20000);
		
		//invokes base class methods
		s1.display();
		s1.work();
		
		d1.display(); //invokes base class method
		d1.work(); //invokes derived class overridden methods
		
		t1.display();
		t1.work(); //invokes derived class overridden methods
		

	}

}
