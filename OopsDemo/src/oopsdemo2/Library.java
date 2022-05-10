package oopsdemo2;

import java.util.List;

//composition Example

public class Library 
{
	List<Book> books; //Object references- Composition

	//constructor to initialize books in library
	public Library(List<Book> books) {
		this.books = books;
	}

	///getter() method to getBooks in Library
	public List<Book> getBooks() {
		return books;
	}
	
	
}
