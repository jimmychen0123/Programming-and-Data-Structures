/**Yen Lung Chen 2971978
 * Create an array of integer data and sort it using the insertion Sort algorithm
 */
package workbook04;

public class InsertionSort {
	
	static int[] myArray = {23,45,66,77,34,56,90,33,98,11}; //create and assign elements to an array

	public static void display(int [] myArray) { //display method for compare sorted and unsorted array 
		
		for(int i=0;i<myArray.length;i++) { //use for loop to traverse collection of elements.
			
			if(i==myArray.length-1) { //the last element is printed on its new line to  separate each array individually
				
				System.out.println(myArray[i]+"\t");
			}//if
			
			else { //the rest of elements are placed horizontally 
				System.out.print(myArray[i]+"\t");
				
			}//else
			
		}//for
		
	}//display()
	
	public static int[] insertionSort(int[] myArray) {
		/*In outer loop for each element we check from where it was towards the front until we found where it goes
		 *Ignore position 0 (one item is always sorted)
		 */
		for (int j=1; j<myArray.length;j++) { 

			int temp = myArray[j]; //store the value of the first element (card) from the most left except the element in index 0
			int i = j-1; //starting from position before the card(right to left) to compare the card

			
			while(i>=0&&myArray[i]>temp) { //this inner while loop is to shift any element towards to left
				
				myArray[i+1]=myArray[i];
				i--;
				
			}//while
			
			myArray[i+1]=temp;	//insert the value
			
		}//for
		
		return myArray;
	}

	
	public static void main(String[] args) {
		
		display(myArray); //display unsorted array
		display(insertionSort(myArray)); //display sorted array
		

	}//main()

}//class
