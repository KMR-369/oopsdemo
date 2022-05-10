package oopsdemo3;

public class Director extends Employee
{
	double transportAllowance;

	public Director(String name, double basic, String address,double ta) {
		super(name, basic, address);
		this.transportAllowance=ta;
	}
	
	void show()
	{
		super.show();
		System.out.println("Transport Allowance: \t"+ transportAllowance);
	}

	@Override
	double totalPay()
	{
		double totalAmount = 0;
        double houseRentAllowance = (basic * 0.08);
        double dearnessAllowance = (basic * 0.3);
        double medicalAllowance = 1500;
        totalAmount = basic + houseRentAllowance
        + dearnessAllowance + medicalAllowance;
        return totalAmount;
	}
	
}
