/**Name: Yen Lung Chen/ Student No. 2971978
 * 
 * This program is to tell if user input two initials in alphabetical order
 */
 
package Workbook01;

import java.util.Scanner; //allow user to input


public class Initials {

	static char ch1; //attribute
	static char ch2; //attribute
	
	public Initials(char c1, char c2) { //constructor
		
		ch1=c1;
		ch2=c2;
		
	}//constructor
	
	public Initials() {
		
	}//constructor
	
	public void setInitials() { //create a method for user to input two letters 
		
		System.out.println("Enter your first initials: ");
		Scanner input = new Scanner(System.in); //create a scanner object for input
		String userInput = input.next(); //take the object as string
		
		if(userInput.equalsIgnoreCase("x")) { //if user enter x, will return to main method, thus the program finish.
			return;
		}
		
		if(userInput.matches("[a-z]*[A-Z]*")) { //regex * Occurs zero or more times of characters a-z or A-Z
			
			char a=userInput.charAt(0); //returns the character located at the String's specified index
			ch1 = Character.toUpperCase(a); //convert the character to upper case
			
		}//if
		else { //restart method if the invalid input occurs
			
			System.out.println("Please only enter letters. This program will restart or type X for exit.");
			setInitials();
			return;
			
		}//else
		
		System.out.println("Then enter the second initials: ");
		
		Scanner input1 = new Scanner(System.in); //create another scanner object for second input
		String userInput1 = input.next(); //take input as string
		
		if(userInput1.matches("[a-z]*[A-Z]*")) { //regex * Occurs zero or more times of characters a-z or A-Z
			
			char b=userInput1.charAt(0); //returns the character located at the String's specified index
			ch2 = Character.toUpperCase(b); //convert the character to upper case
			/*
			 * only call the result method as two attributes are characters 
			 */
			result();	
			
		}//if
		else { //restart method if the invalid input occurs
			System.out.println("Please only enter letters. This program will restart or type X for exit.");
			setInitials();
			
		}//else
		
		
		
	}//setInitials
	
	public void result() { //method to show the result
		
		if(ch1==ch2) {
			System.out.println("You entered the same letter: "+ch1);
		}//if
		
		if(ch1<ch2) {
			System.out.println("The fisrt initial "+ch1+" and second "+ch2+" are entered in order alphabatically");
		}//if
		
		else {
			
			System.out.println("The fisrt initial "+ch1+" and second "+ch2+" are NOT entered in order alphabatically");
			
		}//else
		

	}//result()
	
	
	
	public static void main(String[] args) {
		
		Initials letters = new Initials(); //creating the object
		letters.setInitials(); //call the method 

	}//main()

}//class
