package week2;

public class SimpleObject {
	
	int id;
	
	SimpleObject() //implicit constructor
	{
		this.id = 101;
		System.out.println("This is an implicit constructor,id: "+id);
	}
	
	SimpleObject(int i) //parameterized constructor
	{
		this.id = i;
		System.out.println("This is an parameterized constructor,id: "+id);
	}
}
