package oopsdemo2;

public class AccountantTest {

	public static void main(String[] args) {
		
		Accountant ac1 = new Accountant(1001, "Gaurav Sharma", "Process salary of Employees", "SAP");
		Accountant ac2 = new Accountant(1002, "Marry Jhon","Payment to Vendors","Tally");
		
		ac1.print();
		ac2.print(); 
	}

}
