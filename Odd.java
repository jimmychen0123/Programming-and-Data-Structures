/**Name: Yen Lung Chen/ Student No. 2971978
 * 
 *This program is to state whether or not the user enters an odd positive number. 
 * 
 */


package Workbook01;

import java.util.Scanner; //allow user to input


public class Odd { //creating the class called Odd
	
	private int number; //declare int type to store the input from user
	

	public Odd(int n) { //constructor for the Odd object
		
		number=n;
		
	}//Odd()
	
	/*
	 * create a method to state if the number is odd positive number
	 */
	public void oddPositive() {
		
		if (number>0&&number%2!=0) { //boolean expression of odd positive integer
			
			System.out.println("Cool! This is an odd positive integer.");
			
		}//if
		else {
			
			System.out.println("This is NOT an odd positive integer.");
			
		}//else
		
	}//oddPositive()

	/*
	 * main method 
	 */
	public static void main(String[] args) {
		
		int value; //declare an int type called value to store input from user
		
		System.out.println("Please enter a random integer: "); //show on the screen asking user for the input 
		
		
		Scanner input = new Scanner(System.in); //create a scanner object for the input 
		
		
		try { //use try and catch for the exception, in case user enter an invalid data
			
			value=input.nextInt(); //obtain input as int type
			
			Odd a = new Odd (value); //creating an object 
			
			a.oddPositive(); //call method 
			
		}
		
		catch(Exception e) {
			
			System.out.println("Hey! Please enter an integer!");
			
		}
		
	}//main()

}//class()
