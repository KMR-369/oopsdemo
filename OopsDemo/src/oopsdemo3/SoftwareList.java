package oopsdemo3;

import javax.management.openmbean.OpenDataException;

import com.wipro.training.microsoft.OperatingSystem;
import com.wipro.training.oracle.DataBase;

//Demonstrate the use of Packages

public class SoftwareList {

	public static void main(String[] args) 
	{
		DataBase d1 = new DataBase();
		d1.printSoftware();
		
		System.out.println("---------------------------");
		
		OperatingSystem op1 = new OperatingSystem();
		
		op1.listSoftware();
	}

}
