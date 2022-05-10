package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo
{

	public static void main(String[] args) 
	{
		try 
		{ 
			// Creating Writer obj in Append mode -true
			FileWriter writer = new FileWriter("d:/demo/names.txt",true);  // true is given to add contents to existing data without clearing them
			// Improves Efficiency while Writing Data in to file
			BufferedWriter bwr = new BufferedWriter(writer);  
			
			bwr.write("Manikanta"); 
			bwr.write("\n"); // bwr.newLine();
			bwr.write("Reddy"); 
			bwr.write("\n");
			bwr.close(); 

			System.out.println("Succesfully Written to a File");
		} 
		catch (IOException ioe) 
		{ 
			System.err.println("Error occured in writing the Data");
			System.err.println(ioe.getMessage());
			//ioe.printStackTrace(); 
		}
	}
}
