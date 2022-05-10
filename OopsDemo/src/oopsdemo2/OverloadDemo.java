package oopsdemo2;

public class OverloadDemo {

	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		
		//invoking add() overload method
		
		a1.add();
		a1.add(20, 30);
		a1.add(34.52f,234.21f); //type promotion to double
		a1.add(2000,342,4312);
		a1.add("Java ","Program");
		

	}

}
