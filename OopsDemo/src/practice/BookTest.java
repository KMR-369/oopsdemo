package practice;

class Book
{
	int bookNo;
	String title,author;
	double price;
	public Book(int bookNo, String title, String author, double price)
	{
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void displayDetails()
	{
		System.out.println("The Book Number is: "+this.bookNo);
		System.out.println("The Title of book is: "+this.title);
		System.out.println("The Author of book is: "+this.author);
		System.out.println("The Price of the book is: "+this.price);
	}
	double discountedPrice(double d)
	{
		return this.price-(this.price*(d/100));
	}
	
}
public class BookTest {

	public static void main(String[] args) 
	{
		Book b1 = new Book(101,"Book on java","Athma",400);
		
		b1.displayDetails();
		System.out.println("The price after Discount is: "+ b1.discountedPrice(5.5));

	}

}
