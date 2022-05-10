package oopsdemo2;

// Multilevel Inheritance

public class Account {

	int accNo;
	String name;
	
	public Account(int accNo, String name) {
		this.accNo = accNo;
		this.name = name;
	}
	
	void display()
	{
		System.out.println("************* Account Details **************8");
		System.out.println("Account Number :"+accNo);
        System.out.println("Customer Name :"+name);
    }
}
