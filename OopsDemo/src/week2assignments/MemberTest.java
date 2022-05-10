package week2assignments;

class Member
{
	String name,address,phoneNumber;
	int age;

	double salary;
	
	public Member(String name, String address, int age, String phoneNumber, double salary) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	void display()
	{
		System.out.println("The name of member is: "+this.name);
		System.out.println("The address of member is: "+this.address);
		System.out.println("The age of member is: "+this.age);
		System.out.println("The phone number is: "+this.phoneNumber);
	}
	void printSal()
	{
		System.out.println("The salary is: "+this.salary);
	}
}

class Employe extends Member
{
	String spec;
	
	public Employe(String name, String address, int age, String phoneNumber, double salary, String s) {
		super(name, address, age, phoneNumber, salary);
		this.spec = s;
	}
	
	void display()
	{
		super.display();
		System.out.println("The specialisation of Employee is: "+this.spec);
	}
}

class Manager extends Member
{
	String dept;
	
	public Manager(String name, String address, int age, String phoneNumber, double salary, String d) {
		super(name, address, age, phoneNumber, salary);
		this.dept = d;
	}
	
	void display()
	{
		super.display();
		System.out.println("The Department of Employee is: "+this.dept);
	}
}


public class MemberTest {

	public static void main(String[] args)
	{
		Member m1 = new Member("Jhon", "102- America", 32 ,"9876543210",40000);
		Employe e1 = new Employe("Pooran","222-Australia",34,"1234556765",45000,"Automobile");
		Manager ma1 = new Manager("Haasan","123-London",40,"2143657809",50000,"Human Resource");
		
		System.out.println("*************** Member ******************");
		m1.display();
		m1.printSal();
		System.out.println("*************** Employee *****************");
		e1.display();
		e1.printSal();
		System.out.println("*************** Manager *******************");
		ma1.display();
		ma1.printSal();
				
		

	}

}
