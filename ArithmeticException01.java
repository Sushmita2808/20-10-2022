package com.exception.main;
/*
 * 1.	The professor you TA (Training Associate) for, Professor Jackson,
 *  shared with you the code she uses to auto-grade students’ work. 
 *  She and the other TAs have encountered some problems with the code
 *   in the past when they enter the total possible point value for an assignment. 
 *   Occasionally, they accidentally enter 0 for the total number of possible points
 *    and the program encounters a fatal error when trying to divide by 0.
 */
public class ArithmeticException01 {
	
	public static void main(String[] args) {
		
		try {    // try block
			
			int x = 100, y = 0;
			
			int result = divide(x , y);//calling method
			
			System.out.println("\n RESULT : "+result);//print result
			}
		
		catch (ArithmeticException ex){ //catch 1
			
			System.out.println(" ArithmeticException occurs.");//message
			
			} 
		catch (Exception ex) {//catch 2
			
		   System.out.println("\n Invalid divisor: Division by zero can't be processed.");//message
		    
		}
		
          
	}
	
	public static int divide(int x, int y) {//static divide method with two parameters
		
		int result = x / y;
		
		return result ;
	   
	}
}
