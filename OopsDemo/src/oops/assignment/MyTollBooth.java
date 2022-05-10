package oops.assignment;

public class MyTollBooth implements IBooth 
{
	static int TotalTrucks = 0;
	static double TotalReciepts = 0;
	Truck tc;
	@Override
	public void calculateTollDue(Truck t) 
	{
		double due = 0;
		due += (t.getAxles()*5);
		due+=((t.getWeight()/1000)*20);
		System.out.println("Truck arrived");
		System.out.println("Welcome to My Toll Booth");
		System.out.println("Total axles are: "+t.getAxles());
		System.out.println("Total weight is:"+t.getWeight()+ " Kilograms");
	
		System.out.println("The Toll Due is:"+due);
		System.out.println();
		TotalTrucks+=1;
		TotalReciepts+=due;
	}
	
	@Override
	public void displayData()
	{
		System.out.println("****** Collecting Receipts *******");
		System.out.println("Totals since the last collection- Receipts : "+TotalReciepts+" Trucks :"+TotalTrucks);
		TotalTrucks=0;
		TotalReciepts=0;
		System.out.println("The no of trucks & reciepts after Reset");
		System.out.println("Totals since the last collection- Receipts : "+TotalReciepts+" Trucks :"+TotalTrucks);
	}
	
}
