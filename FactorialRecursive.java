/**Yen Lung Chen 2971978
 * 
 * Implement a java program in an Recursive manner to calculate the factorial of a value entered by the user
 *
 */
public class FactorialRecursive {

	public FactorialRecursive() {
		
	}//constructor
	
	public static long recurFact(long n) {
		
		long result=1;
		
		if(n==1||n==0) { //1! and 0! both equals to 1
			return result;
		}//if
		
		else {
			
			result = n*recurFact(n-1);
			
		}
		
		return result;
		
	}

}//class
