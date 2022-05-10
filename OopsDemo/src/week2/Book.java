package week2;

/* OOProgram to check the details of a Book
*/

import java.util.Scanner;

class Book
{
	String name,author;
	double price;
	int id,copies;
	Scanner s = new Scanner(System.in);
	public void inputDetails()
	{
		System.out.println("Enter the Name,Author,Price & id of the book:");
		name = s.next();
		author = s.next();
		price = s.nextDouble();
		id = s.nextInt();
		System.out.println("Enter the  no. of copies avilable:");
		copies = s.nextInt();
	}
	public void displayDetails()
	{
		System.out.println("----------------*******-------------------");
		System.out.println("The name of the book is:"+name);
		System.out.println("The Author of the book is:"+author);
		System.out.println("The name of the book is:"+price);
		System.out.println("The id of the book is:"+id);
		System.out.println(copies+" books are avilable");
		System.out.println("----------------*******-------------------");
	}
}