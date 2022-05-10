package oopsdemo1;

public class BookTest {

	public static void main(String[] args) {

		Book b1 = new Book();
		
		//invoke setters method
		b1.setBookId(101);
		b1.setBookName("Programming in C");
		b1.setPrice(500);
		b1.setPublisher("Prime Books");
		
		//invoke getter method --output
		System.out.println("**************** Book Details ******************");
		b1.display();
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		
		System.out.println("The discounted price of he book:"+b1.discountPrice());
		
		System.out.println(b1); //invokes toString method of instance class
		
		Book b2 = new Book();
		
		//invoke setters method
		b2.setBookId(202);
		b1.setBookName("Programming in Python");
		b1.setPrice(600);
		b1.setPublisher("Python Publishers");
		
		//invoke getter method --output
		System.out.println("**************** Book Details ******************");
		b1.display();
		System.out.println(b1.getBookId()+" "+b1.getBookName()+" "+b1.getPrice()+" "+b1.getPublisher());
		
		System.out.println("The discounted price of he book:"+b1.discountPrice());
		
		System.out.println(b1); //invokes toString method of instance class
	}

}
