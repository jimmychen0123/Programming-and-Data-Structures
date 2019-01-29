/**Yen Lung Chen 2971978
 * 
 * PDS Workbook 3
 * Linear search
 */
package workbook03;


public class LinearSearch {
	
	private int [] myList = {23,45,66,77,34,56,90,33,98,11}; //declare and assign a private integer array 

	/**
	 * constructor
	 */
	public LinearSearch() {
		
		
	}//constructor
	
	public int[] getMyList() { //the getter of the data in the array
		
		return myList;
		
	}//getMyList()
	
	/*
	 *If you print any object, java compiler internally invokes the toString() method on the object.
	 *So overriding the toString() method, returns the desired output, 
	 *it can be the state of an object etc. depends on your implementation.
	 */
	public String toString() {
		
		StringBuffer sb = new StringBuffer(); //create a string buffer 
		
		for(int i :this.myList) { //enhanced for loop to iterate through the elements of a collection or array
			
			sb.append(i).append(" "); //append each elements in sequence with space
			
		}
			
		return sb.toString(); //return the string

	}//toString()
	
	public int search(int x) { //search algorithm
		
		int i = 0; //initiate a variable
		
		/*
		 * The condition in the while loop is to filter out the value to be found
		 */
		while(i<myList.length&&myList[i]!=x) { 
			
			i++;
			
		}//while()
		
		if(i==myList.length) { //The condition indicate that the argument is not found in the array 
			
			System.out.println("The value: "+x+" is NOT found in the array with value: "+toString());
			
			return i=-1; //return value -1, an invalid index in a array
		}
		
		else { //The condition indicate that the argument is found in the array
			
			System.out.println("The value: "+x+" is found in the array with value: "+toString());
			System.out.println(x+" is located in the index of "+i );
			
			return i;
		}
		
	}//search()
	

	
	public static void main(String[] args) {
		
		LinearSearch a = new LinearSearch();
		a.search(2);
		a.search(66);
		
		LinearSearch b = new LinearSearch();
		b.search(90);
		b.search(23);

	}//main()

}//class()
