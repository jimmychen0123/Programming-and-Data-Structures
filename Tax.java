/**Yen Lung Chen/ Student No. 2971978
 * 
 *A tax calculation program 
 * 
 */
 
package Workbook01;

import java.text.DecimalFormat; //formatting the floating number to currency
import java.util.Scanner; //allow user for input

public class Tax {
	
	int[] salary = new int[2]; //attribute 

	/**
	 * constructor
	 */
	public Tax() {
		
	}

	public void inputSalary() { //method to input two salaries from user
		
		System.out.println("Please enter two salaries: ");
		
		/*
		 * Use for loop to assign two values.
		 *
		 */
		
		for(int i =0; i<salary.length;i++) {
			
			Scanner input= new Scanner(System.in); //create scanner object for input
			
			
			try { //use try and catch for exception
				
				int d=input.nextInt(); //input must be integers
				
				salary[i]=d;	//assign array
														
			}//try
			
			catch(Exception e) { //program restart when exception occurs 
				
				System.out.println("The amount entered is not valid, the program will be restart automatically. ");
				inputSalary();
				
			}//catch
					
		}//for
		
		result(); //call result method once the array is assigned 
		
		
	}//inputSalary()
	
	public void result() {
		
		
		int total=0; //total income
		double tax=0; //payable tax
		
		DecimalFormat totalFormatter = new DecimalFormat("€###,###.###"); //format of total
		DecimalFormat taxFormatter = new DecimalFormat("€###,###.###"); //format of tax
				
		for (int i=0;i<salary.length;i++) { //this for loop is to add up two salaries
			
			total +=salary[i];
			
		}//for
		
		
		String totalOutPut = totalFormatter.format(total); //create a string of total output
		
		System.out.println("Your total income as family are: "+totalOutPut);
		
		if(total<15000) { //income below €15,000
			
			tax=total*0; //tax rate
			String taxOutPut = taxFormatter.format(tax); //create a string of tax output
			System.out.println("You are paying tax: "+taxOutPut);
			
		}
		
		else if (total>=15000&&total<=19999) { //income between 15000 to 19999 
			
			tax=total*0.1;
			String taxOutPut = taxFormatter.format(tax);
			System.out.println("You are paying tax: "+taxOutPut);
			
		}
		
		else if(total>=20000&&total<=29999) { //income between 20000 to 29999
			
			tax=total*0.2;
			String taxOutPut = taxFormatter.format(tax);
			System.out.println("You are paying tax: "+taxOutPut);
		}
		
		else { //income over 29999
			
			tax=total*0.3;
			String taxOutPut = taxFormatter.format(tax);
			System.out.println("You are paying tax: "+taxOutPut);
			
			
		}
		
		/*
		 * the code below is asking user for further instruction 
		 */
		
		System.out.println("Enter End to finish the program or RESTART to caculate again. ");
		
		Scanner end = new Scanner(System.in);
		
		String s = end.next();
		
		if(s.equalsIgnoreCase("end")) {
			System.out.println("See you next time!");
			return;
		}
		
		if(s.equalsIgnoreCase("restart")) {
			inputSalary();
		}
		
		else {
			System.out.println("Invalid instruction from user, this program is closed!");
		}
		
	}//result()

	
	
	public static void main(String[] args) {
		
		Tax familyA = new Tax(); //create an object
		familyA.inputSalary(); //call method
		

	}//main()

	

}//class()
