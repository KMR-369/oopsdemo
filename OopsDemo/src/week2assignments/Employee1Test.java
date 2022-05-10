package week2assignments;

class Employee1
{
	double sal;
	int wh;
	
	public Employee1(double sal, int wh) 
	{
		this.sal = sal;
		this.wh = wh;
	}
	void addSal()
	{
		if(sal<500)
		{
			sal+=10;
		}
	}
	void addWork()
	{
		if(wh>6)
		{
			sal+=5;
		}
	}	
	void getinfo()
	{
		System.out.println("The working hours of employee is: "+this.wh);
		System.out.println("The Final salary of employee is: "+this.sal);
	}
}
public class Employee1Test {

	public static void main(String[] args) 
	{
		Employee1 e1 = new Employee1(450, 8);
		e1.addSal();
		e1.addWork();
		e1.getinfo();

	}

}
