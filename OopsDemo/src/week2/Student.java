package week2;

public class Student {
	
	int id;
	String name;
	
	Student() //implicit constructor
	{
		id = 101;
		name = "Unknown";
	}
	Student(int i,String name) //parameterized constructor with 2 arguments
	{
		this.id = i;
		this.name = name;
	}
	Student(String name) //parameterized constructor with 1 argument
	{
		this.id = 103;
		this.name = name;
	}
	void display()
	{
		System.out.println("The student id is:"+this.id);
		System.out.println("The student name is:"+this.name);
	}
}
