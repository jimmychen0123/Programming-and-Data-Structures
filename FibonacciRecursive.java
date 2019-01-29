/**Yen Lung Chen 2971978
 * 
 * Implement a java program in an recursive manner to calculate the Fibonacci of a value entered by the user
 *
 */
public class FibonacciRecursive {

	public FibonacciRecursive() {
		// TODO Auto-generated constructor stub
	}//constructor
	
	public static long recurFibo(long n) {
		
		if(n == 0 || n ==1) {
			return n;
		}//if
		
		else {
			return recurFibo(n-1) + recurFibo(n-2);
		}
	
	}//recurFibo

}//class



