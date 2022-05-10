package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

// Writer class is used to write String/ text data in to a text file

public class WriterExample {

	public static void main(String[] args)
	{
		try
		{
			Writer w = new FileWriter("c:/demo/data.txt");
			
			String content = "She sells Sea Shells In The Sea";
			
			w.write(content);
			w.close();
			System.out.println("Data Written to a File");
		}
		catch(IOException e)
		{
			System.err.println("Error Occured");
			e.printStackTrace();		
		}
	}

}
