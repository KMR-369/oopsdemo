package oops.assignment;

public class TestTollBooth {

	public static void main(String[] args) 
	{
		IBooth booth = new MyTollBooth();

		Truck tata = new TataTruck(5, 12000); // 5 axles and 12000 kilograms
		Truck benz1 = new BenzTruck(2, 5000); // 2 axles and 5000 kg
		Truck benz2 = new BenzTruck(6, 7500);

		booth.calculateTollDue(tata);
		booth.calculateTollDue(benz1);
		booth.calculateTollDue(benz2);
		booth.displayData();

	}
}
