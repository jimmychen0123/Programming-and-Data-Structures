/**Yen Lung Chen 2971978
 * 
 * Implement a java program in an iterative manner to calculate the factorial of a value entered by the user
 *
 */
public class FactorialIterative {

	public FactorialIterative() {
		
	}//constructor
	
	public static long literFact(long n) {
		
		long result = 1; //set the result as 1 since 0!=1	
		
		for(int i=1; i<=n;i++) { //note the i start at 1 instead of 0 due to the formula of factorial
			
			/*
			 * instead of working like n*(n-1)*(n-2)...1
			 * the for loop work like 1*2*3*...*(n-1)*n
			 */
			
			result=result*i; 
			
		}//for
		
		return result;
		
	}//literFact()
	
	
	
}//class()
