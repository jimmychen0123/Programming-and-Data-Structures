/**Name: Yen Lung Chen/ Student No. 2971978
 * 
 * This program is to guess an assigned number 
 */

package Workbook01;

import java.util.Scanner; //allow input from user

public class Guessing {

	private static int answer = 65; // Assign a integer at the top of program
	
	private static int[] guessArray = new int[5]; //attribute 

	/**
	 * No constructor needed in this program
	 */
	public Guessing() {

	}// constructor()

	public void askInput() {
		
		int c=4; //will be used for the print out
		
		System.out.println("You have five times to guess. Please enter the numbers."); //ask for input from user
		
		System.out.println("Hint: An integer betwwen 0-100, Good luck!");
		
		/*
		 * use try and catch in case user enters invalid input.
		 * If exception occurs the method will be called again
		 * Otherwise the result method is called
		 */
		
		try { 
			
			for (int i = 0; i < 5; i++) {
				
				Scanner input = new Scanner(System.in); // create Scanner object for input

				int guess = input.nextInt(); // obtain input as integer

				guessArray[i] = guess; // assign the guess number into array
				
				System.out.println("->" +"You just entered: "+guess+". "+c+" more guesses remaining.");
				
				c--;
			} // for
			
			result(); //call method for the result
			
		}//try
		
		catch(Exception e) {
			
			System.out.println("Oh! You have to enter number only! Let's try again.");
			
			askInput();
			
		}
		
		

	}// askInput()

	public void result() {

		for (int j = 0; j < 5; j++) { //use for loop to check each index

			if (guessArray[j] == answer) {

				System.out.println("Genius! The answer is: "+ answer);
				System.out.println("See ya next time!");
				System.out.println("Enter Restart to play again or End for exit:");
				break;

			} //if

			else if (j == 4)  { //in the last loop, if the result is not matched
				
				System.out.println("Bad Luck! Enter Restart to try again or End for exit");
			
			}//else

		} // for
		
			/*
			 * The code below is to ask user for input to either restart the program or finish it.
			 */
		
			Scanner input = new Scanner(System.in);
			
			String nextToken =input.next();
			
			if(nextToken.equalsIgnoreCase("Restart")) {
				
				askInput();
				
			}//if
			else if(nextToken.equalsIgnoreCase("End")) {
				return;
			}// else if
			
			else {
				System.out.println("You are giving me invalid instruction, the program will automatically restart.");
				askInput();

			}//else

			
		
		
		
	}// result()

	public static void main(String[] args) {

		Guessing g = new Guessing(); //create a guessing object

		g.askInput(); //call the method

		

	}// main()

}// class()
