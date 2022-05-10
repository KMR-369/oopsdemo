package oopsdemo3;

/*
 * Override demo
 */
public class Account {

	String name;
	protected double balance;

	public Account(String name, double balance) //constructor using fields
	{
		this.name = name;
		this.balance = balance;
	}

	//getters for variables
	public String getName()
	{
		return name;
	}

	public double getBalance() 
	{
		return balance;
	}

	final void deposit(double amt) //final methods cannot be overridden
	{
		balance += amt;
		System.out.println("Depositing: " + amt);
	}

	void withdraw(double amt)
	{
		balance -= amt;
		System.out.println("WithDrawing: " + amt);
	}
}
