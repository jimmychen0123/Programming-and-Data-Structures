/**Yen Lung Chen 2971978
 * 
 * Implement a java program in an iterative manner to calculate the Fibonacci of a value entered by the user
 *
 */
public class FibonacciIterative {

	public FibonacciIterative() {
		
	}//constructor
	
	public static long literFibo(long n) {
		
		long a = 0;
		long b = 1;
		long c;
		
		if(n == 0) b=a;
		for(int i = 0; i<n-1;i++) {
			
			//a + b = c each number is the sum of the two preceding ones
			//storing the previous two numbers(a and b) only because that is all we need to get the next Fibonacci number in series.
			c = a + b; 
			a = b; 
			b = c;	
				
		}//for
		
		return b;
		
	}//literFibo

}//class
