/**Name: Yen Lung Chen/ Student No. 2971978
 * 
 *This program is to compare two integers, returns 1, if the first is greater than the second, and 0 otherwise. 
 * 
 */
 
package Workbook01;


public class GreaterThan {
	
	private int a; //attribute
	private int b; //attribute
	
	/**
	 * constructor
	 */
	public GreaterThan(int first, int second) {
		
		a = first;
		b = second;
		
	}//constructor
	
	public int getA() {
		return this.a; //this is a reference to the current object
	}//getA
	
	public int getB() {
		return this.b;//this is a reference to the current object
	}//getB
	
	private int greatThan(int j, int k) { //create a return method of int 
		
		int result=3; //declare an integer call result for return value
		
		if(j==k) { //if two arguments are the same, program will automatically finished
			
			System.out.println("Two integers entered are the same.");
			System.out.println("Please recreate another object of GreatThan and run the program again.");
			System.exit(0);
			
		}
		
		else if (j>k) { //if the first argument is greater than second, return 1 
			result=1;
		}
		
		else { //otherwise return 0
			result=0;
		}
		
		return result;
	}//greatThan

	
	public static void main(String[] args) {
		
		GreaterThan compare= new GreaterThan(3,25); // make a object with two arguments 
		
		System.out.println("The result is: "+compare.greatThan(compare.getA(),compare.getB())); 

	}//main	

}//class
