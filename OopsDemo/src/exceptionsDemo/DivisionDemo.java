package exceptionsDemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) 
	{
		 int a, b, result;
         Scanner input = new Scanner(System.in);
        
          System.out.println("Input two integers");
          a = input.nextInt();
          b = input.nextInt();
          
         try  //Statements to be monitored which may throw exception
         {
        	 result = a / b;  // Throws Arithmetic exception
        	 System.out.println("Result = " + result);
         }
         
         catch(ArithmeticException e) //Exception thrown is handled in Catch Blockc
         {
        	 System.out.println("Divide by Zero Error - Enter non-Zero value");
        	 System.out.println("Exception Description : "+e.getMessage());
        	 System.out.println("Exception Name & description :"+e.toString());
        	 
        	 //Details about exception Name,Description,Line number of code with generated Exception
        	 e.printStackTrace();
         }
         
         finally  //clean-up operations
         {
        	 input.close();
        	 System.out.println("In Finally Block- Program execution ended");
         }
         
         
	}

}
