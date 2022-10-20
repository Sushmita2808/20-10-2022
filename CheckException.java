package com.exception.main;
/*
 * 2.	After mentioning to Professor Jackson that you would 
 * like to get some more practice with exceptions, she offered 
 * to let you write some grading software! Before she gives you 
 * full control over auto-grading students’ work, she asked if 
 * you could write a function called checkFileExtension(). 
 */
public class CheckException {
	
	public static void main(String[] args) {
		    
			//Student's name
			String[] names = {"Ragib", "Sushmita" ,"Lovejeet" , "Nikki", "Piru", "Manju"};
			//File name
			String[] files = {"Triangle.java" , null , "Notes.txt" ," Java.doc", " "};
			
			System.out.println("\n*********************STUDENT'S DETAILS***********************************************");	
				
			int i = 0 ;//Check with Index 0
				
				for(String file:files) {  //for each
					
				System.out.println("-------------------------------------------------------------------------------------");	
				
				System.out.println("Hello "+names[i]+"!!!");
				
					try {	//try block
							 
					int f = checkFileExtension(file); //method to check file extension
			       
					if(f == 1) //condition check if true statement we got
						
						System.out.println("Your " + file + " is a java file .You scored 1."); //for java file
					
					else
						
						System.out.println("Your " + file + " is not a java file .You scored 0."); //not for java file
					 
				}	
					
					
			catch(NullException ex) {//Catch1 for null string
				
				System.out.println("Your have send a null. You scored -1.");
				
				System.out.println(ex.getMessage());
			}
			catch(EmptyException ex) {//Catch2 for empty string
				
				System.out.println("Your have send an empty string. You scored -1.");
				
				System.out.println(ex.getMessage());
			}
			
			catch(Exception ex) {//Catch3 for other exception
				
				System.out.println("You scored -1");
				
				System.out.println(ex.getMessage());
			}
					i++;	//increment
					
					}
				
				System.out.println("-------------------------------------------------------------------------------------");	
				
	
			}
			
			
			public static int checkFileExtension(String fileName) throws NullException, EmptyException {
				
				if(fileName == null)
					
					throw new NullException("This is a null string.");	//message 
				
				
				if(fileName.isEmpty())
					
					throw new EmptyException("This is an empty string."); //message
				
				if(fileName.endsWith(".java"))	//File extension
					
					return 1;	//return true
				
				else 
					
					return 0;	//return false
		}

		
}
