/**Yen Lung Chen 2971978
 * 
 * get the execution time for 
 * Factorial Recursive, Factorial Iterative, 
 * Fibonacci Recursive, Fibonacci Iterative
 * 
 */

/* comment for the result:
 * Recursive always takes larger execution time than factorial
 * Only when n = 0, sometimes Fibonacci Iterative would run slightly longer than Fibonacci Recursive  
 * When n = 40 or above output of Factorial  become negative number due to  the maximum value of long primitive type is 9,223,372,036,854,775,807
 * Time complexity of Factorial Iterative is O(n). 
 * As the value of n increases, the time complexity of Fibonacci Recursive increases dramatically since the upper bound of Fibonacci recursive as O(2^n)
 * On the other hand, Time Complexity of Fibonacci iterative: O(n)
 */

import java.util.Scanner;

public class Timer {



	public static void main(String[] args) {
		
		//ask for imput
		System.out.println("Enter an inter number: ");
		
		Scanner input = new Scanner(System.in);
		
		long n = input.nextLong();
		
		//call methods
		
		timerFactRecur(n);
		timerFactIter(n);
		
		timerFiboRecur(n);
		timerFiboIter(n);
		

	}//main
	
	//the code below are the execution time method of each algorithm
	public static long timerFactIter(long n) {
		
		long startTime = System.nanoTime();
		
		FactorialIterative.literFact(n); 
		
		long endTime = System.nanoTime();
		
		long elapsedTime = endTime - startTime;
		
		System.out.println("Function: Factorial Iterative"+"\t"
							+"Input: "+n+"\t"
							+"Output: "+FactorialIterative.literFact(n)+"\t"
							+"Execution time in nanoseconds: "+elapsedTime+"\n");
		
		return elapsedTime;
		
	}//FactorialIterative timer()
	

	public static long timerFactRecur(long n) {
		
		long startTime = System.nanoTime();
		
		FactorialRecursive.recurFact(n);
		
		long endTime = System.nanoTime();
		
		long elapsedTime = endTime - startTime;
		
		System.out.println("Function: Factorial Recursive"+"\t"
				+"Input: "+n+"\t"
				+"Output: "+FactorialRecursive.recurFact(n)+"\t"
				+"Execution time in nanoseconds: "+elapsedTime+"\n");
		
		return elapsedTime;
		
	}//Factorial Recursive timer()
	

	public static long timerFiboRecur(long n) {
		
		long startTime = System.nanoTime();
		
		FibonacciRecursive.recurFibo(n);
		
		long endTime = System.nanoTime();
		
		long elapsedTime = endTime - startTime;
		
		System.out.println("Function: Fibonacci Recursive"+"\t"
				+"Input: "+n+"\t"
				+"Output: "+FibonacciRecursive.recurFibo(n)+"\t"
				+"Execution time in nanoseconds: "+elapsedTime+"\n");
		
		return elapsedTime;
		
	}//Fibonacci Recursive timer()
	

	public static long timerFiboIter(long n) {
		
		long startTime = System.nanoTime();
		
		FibonacciIterative.literFibo(n);
		
		long endTime = System.nanoTime();
		
		long elapsedTime = endTime - startTime;
		
		System.out.println("Function: Fibonacci Iterative"+"\t"
				+"Input: "+n+"\t"
				+"Output: "+FibonacciIterative.literFibo(n)+"\t"
				+"Execution time in nanoseconds: "+elapsedTime+"\n");
		
		return elapsedTime;
		
	}//FactorialIterative timer()

}//class()
