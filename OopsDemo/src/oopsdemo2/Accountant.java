package oopsdemo2;

//child class derived from Employee parent class
public class Accountant extends Employee 
{
	String task,tech;
	
	public Accountant(int empId, String name, String t1, String t2) {
		super(empId, name); //invokes base class constructor and pass arguments
		this.task = t1;
		this.tech = t2;
	}
	
	void print()
	{
		super.display(); //invokes parent/base class display method
		System.out.println("Accountant task: "+this.task);
		System.out.println("Accountant technology: "+this.tech);
		System.out.println("*****************************************");
	}

	
}
