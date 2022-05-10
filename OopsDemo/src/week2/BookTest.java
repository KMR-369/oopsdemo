package week2;
/*
 * Program to check the working of book class
 */
public class BookTest {

	public static void main(String[] args) {
		
		Book b1 = new Book(); //creating instance of book
		Book b2 = new Book();
		
		//taking details of book
		b1.inputDetails();
		b2.inputDetails();
		
		//displaying details of book
		b1.displayDetails();
		b2.displayDetails();
	}

}
