/**Yen Lung Chen 2971978
 * 
 * PDS workbook 04
 * Create an array of integer data and sort it using the Selection Sort algorithm
 */
package workbook04;

public class selectionSort {

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
	
	public static int[] selectionSort(int[] myArray) {
		
		for(int i = 0; i<myArray.length-1;i++) { //The outer loop makes sure all items are sorted(sorted block)

			
			int smallestplace = i; //the first index of unsorted elements(unsorted block)
			int temp; //for swap purpose
			
			for(int j = i+1;j<myArray.length;j++) { //The inner loop sorts one element(unsorted block)

				
				if (myArray[j]<myArray[smallestplace]) { //this if condition is to indicate which index contains the smallest element
					
					smallestplace = j;
					
				}//if
				
			}//inner for
			
			/*
			 * swap algorithm
			 * Please note every elements will not be moved unless the if statement above is true
			 */
			temp = myArray[i]; //store the value of the first element in unsorted block
			
			myArray[i]=myArray[smallestplace]; //assign the value of the index where contains the smallest element to the first index in the unsorted block
			
			myArray[smallestplace]=temp;	 //assign the first element in unsorted block to the index where contains the smallest element
			
		}//for()
		
		return myArray;
		
	}//selectionSort();
	
	public static void main(String[] args) {
		
		display(myArray); //display unsorted array
		display(selectionSort(myArray)); //display sorted array

	}//main()

}//class()
