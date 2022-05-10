package week2assignments;

class Employee
{
	
	String name,address;
	int yoj;
	double salary;
	
	public Employee(String name, String address, int yoj, double salary) {
		this.name = name;
		this.address = address;
		this.yoj = yoj;
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println(this.name+"\t\t"+ this.yoj+"\t\t\t"+this.salary+"\t\t"+this.address);
	}
		
}

public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee("Jhon","102- America",2013,80000);
		Employee e2 = new Employee("Ravi","104- Australia",2021,23000);
		Employee e3 = new Employee("Venky","113- England",2019,40000);
		
		System.out.println("Name\t\tYear of Joining\t\tSalary\t\taddress");
		e1.display();
		e2.display();
		e3.display();
		
	}
}
