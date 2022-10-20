package com.exception.test;
/*
 * Create a class Book with id, name as the member variables.

Create  BookNotFoundException as a exception and create one argument constructor which is accepting String message.

Create a test class with an array of 5 books with ids starting from 1.

Create a method findById(Book[] books , int id) which will take the previously created book array and one id to find the book.

Print "Found" if the book is present with the given id else throw BookNotFoundException with a message "Book with the given id is not present".

Handle the exception in main method and print the stacktrace in catch block.


 */
import com.exception.main.Book;
import com.exception.main.BookNotFoundException;

public class TestBook {
	
	public static void main(String[] args) {
		
		Book[] obj = new Book[5];
		//We have total 5 books
		
		 obj[0] = new Book(1, "Science");
		 obj[1] = new Book(2, "Social Science");
		 obj[2] = new Book(3, "English");
		 obj[3] = new Book(4, "Maths");
		 obj[4] = new Book(5, "Computer Science");
		 
		 try { //try block
			 
			 boolean isFound = findById(obj, 1);  //Call findById()
			 
				if(isFound)
					
				  //If we find book give this message
					System.out.println("Found"); // true
				
				else{
					
					throw new BookNotFoundException("Book with the given id is not present");//false
				}
			
		 }
		 
		catch(BookNotFoundException ex) {	 //catch1
				ex.printStackTrace();
				
			} 
		 
		 catch(Exception ex) { 				//catch2
				ex.printStackTrace();
				
			} 
	}

	//findById method
	private static boolean findById(Book[] books, int id) {
		
		for(int i = 0; i< books.length; i++) {//for loop
			
			if(books[i].getBookId() == id) //check id 
				
			return true;
	}
		
	return false;
	
	}
}
	


