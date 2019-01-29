/**Yen Lung Chen 2971978
 * 
 * PDS Workbook3 
 * Binarysearch
 */
package workbook03;

import java.util.Arrays; //To use sort array method

public class Binarysearch {
	
	private int [] myList = {23,45,66,77,34,56,90,33,98,11}; //declare and assign a private integer array

	public Binarysearch() {
		
	}
	
	public int [] getMyList() { //the getter of the data in the array
		
		return myList;
		
	}//getMyList()
	
	/*
	 *If you print any object, java compiler internally invokes the toString() method on the object.
	 *So overriding the toString() method, returns the desired output, 
	 *it can be the state of an object etc. depends on your implementation.
	 */
	public String toString() {
		
		StringBuffer sb = new StringBuffer(); //create a string buffer 
		
		for(int i:this.myList) {  //enhanced for loop to iterate through the elements of a collection or array
		
		sb.append(i).append(" "); //append each elements in sequence with space
		
		}//for
	
	return sb.toString();
	
		
	}//toString()
	
	public void sort() { 
		
		Arrays.sort(myList); //sorting method from java class
		
		System.out.println("The array is sorted as: "+toString()); //print out the sorted array
		
	}//sort()
	
	public int binarysearch(int x) {
		
		int start = 0; //Start set to 0
		int end = myList.length - 1; //End to last position in the array
		int mid = (start + end)/2;
		int loc;
		
		while(start<=end&&myList[start]!=x) { // The condition of the while loop is to filter out the value to be found
			
			if(x<myList[mid]) { //if x is less than the middle element, continue search in lower half

				
				end = mid - 1;
				
			}//if
			
			else {  //If x is greater than the middle element, search in upper half

				
				start = mid + 1;
				
			}//else
			
			mid = (start + end)/2; //Check if an item is at midpoint
	
		}//while
		
		if(myList[mid]==x) { //value found in array
			
			loc = mid;
			System.out.println("The value: "+x+" is found in the array at location "+loc);
			
		}
		
		else { //no value found in the array
			
			System.out.println("The value: "+x+" is NOT found.");
			loc = -1;
			
		}
		
		return loc;
		
	}//binarysearch()
	
	public static void main(String[] args) {
		
		Binarysearch a = new Binarysearch();
		a.sort();
		a.binarysearch(34);
		a.binarysearch(99);
		
		
		
		

	}//main()
	
}//class()
