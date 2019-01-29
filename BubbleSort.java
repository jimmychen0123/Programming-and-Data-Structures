/**Yen Lung Chen 2971978
 * Create an array of integer data and sort it using the bubble Sort algorithm
 */
package workbook04;


public class BubbleSort {
	
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
	
	public static int[] bubbleSort(int[] myArray) {
		
		for(int i=0;i<myArray.length-1;i++) { //outer for loop is making each elements except the last one to have chance to move towards the back
			for(int j=0;j<myArray.length-i-1;j++) { //inner for loop is to compare but excluding those positions have been done at the back 
				
				if(myArray[j]>myArray[j+1]) {
					
					int temp = myArray[j]; //store the value in temp for swap
					myArray[j]=myArray[j+1]; 
					myArray[j+1]=temp;
					
				}//if
			}//inner for
		}//outer for
		
		return myArray;
		
	}//bubbleSort()

	public static void main(String[] args) {
		
		display(myArray); //display unsorted array
		display(bubbleSort(myArray)); //display sorted array

	}

}
