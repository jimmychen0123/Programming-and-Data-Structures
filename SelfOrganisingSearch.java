/**Yen Lung Chen 2971978
 * 
 * PDS Workbook 3
 * Self organizing search
 */
package workbook03;


public class SelfOrganisingSearch {

	private int [] myList = {23,45,66,77,34,56,90,33,98,11}; //declare and assign a private integer array 
	
	public SelfOrganisingSearch() { //constructor
		
	}
	
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
		
		for(int i : this.myList) { //enhanced for loop to iterate through the elements of a collection or array
			
			sb.append(i).append(" "); //append each elements in sequence with space
			
		}//for
		
		return sb.toString(); //return the string
		
	}//toString()
	
	public int selfOrgaSearch(int x) { //search algorithm
		
		int loc = 0;
		
		/*
		 * The condition in the while loop is to filter out the value to be found
		 */
		while (loc < myList.length&&myList[loc]!=x) {
			
			loc++;
			
		}//while
		
		if(loc==myList.length) { //The condition indicate that the argument is not found in the array
			
			System.out.println("The value: "+x+" is NOT found.");
			System.out.println("The array is still remain as: "+toString());
			
			loc = -1; //return value -1, an invalid index in a array
			
		}//if
		
		else if(loc!=0) { //This condition indicate that the argument is found but not located in index 0
			
			int temp = myList[loc]; //store the front value of loc
			
			for (int i = loc; i>0; i--) { //in the for loop, move everything else back one space
				
				myList[i] = myList[i-1];
				
			}//for
			
			
			myList[0] = temp; //move the found value to index 0
			
			System.out.println("The value: "+x+" is found in the array at location "+loc);
			System.out.println("The array becomes: "+toString());
				
		}
		
		else { //This condition indicate that the argument is found and located in index 0
			
			System.out.println("The value: "+x+" is found in the array with value: "+toString());
			System.out.println(x+" is located in the index of "+loc );
			
		}
		
		return loc;
		
	}

	public static void main(String[] args) {
		
		SelfOrganisingSearch a = new SelfOrganisingSearch();
		a.selfOrgaSearch(66);
		a.selfOrgaSearch(5);
		a.selfOrgaSearch(66);
	

	}

}
