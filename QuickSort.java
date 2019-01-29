/**Yen Lung Chen 2971978
 * 
 * Research QuickSort and implement it
 * 
 * Concept of QuickSort:
 * 1. Bring the pivot(pick last element as pivot in this implementation) to its appropriate position 
 *    such that left of pivot is smaller and right is greater
 * 2. Quick sort the left part
 * 3. Quick sort the right part
 * 
 * Pseudo code for quickSort()
low  --> Starting index,  high  --> Ending index 
quickSort(arr[], low, high)
{
    if (low < high)
    {
        /pi is partitioning index, arr[p] is now
           at right place 
        pi = partition(arr, low, high);

        quickSort(arr, low, pi - 1);  // Before pi
        quickSort(arr, pi + 1, high); // After pi
    }
}
 * 
 * 
 * Pseudo code for partition()
partition (arr[], low, high)
{
    // pivot (Element to be placed at right position)
    pivot = arr[high];  
 
    i = (low - 1)  // Index of smaller element

    for (j = low; j <= high- 1; j++)
    {
        // If current element is smaller than or
        // equal to pivot
        if (arr[j] <= pivot)
        {
            i++;    // increment index of smaller element
            swap arr[i] and arr[j]
        }
    }
    swap arr[i + 1] and arr[high])
    return (i + 1)
}
 */


public class QuickSort {

	
 
	
	public static void printArray(int [] list) { //method for display array 
		
		for(int i : list) {
			
			System.out.print(i+"\t"); //print elements in the array horizontally 
				
		}//for
		
		System.out.println(" ");  //print each array vertically
		
	}//printArray
	
	public static int partition(int [] list, int startIndex, int endIndex) { //partition method is to put pivot to its appropriate index
		
		 int pivot = list[endIndex]; //pick last element as pivot in this implementation
		 
	     int i = (startIndex-1); // index of smaller element 

	     /*
	      * The purpose for this for loop is to sort the elements except pivot into two blocks
	      * one block with the value less than pivot
	      * the other block with the value greater than pivot
	      */
	     for (int j=startIndex; j<endIndex; j++) { 
	    	 
	    	 if (list[j] <= pivot) { 
	    		 
	    		 i++; 
	  
	    		 // swap list[i] and list[j] 
	             int temp = list[i]; 
	             list[i] = list[j]; 
	             list[j] = temp; 
	             
	         }//if
	    	 
	      } //for
	  
	        /*
	         * swap list[i+1] and pivot 
	         * this is to insert the pivot into the array where two blocks are divided
	         */
	     	
	        int temp = list[i+1]; 
	        list[i+1] = list[endIndex]; 
	        list[endIndex] = temp; 
	  
	        return i+1; 
		
	}//partition
	
	 static void quickSort(int list[], int startIndex, int endIndex) { 
		 
	     if (startIndex < endIndex) { //this if condition is to indicate whether there is any elements to be sorted
	    	 
	    	 int pivotIndex = partition(list, startIndex, endIndex); //this method is to put pivot in an appropriate index and return its index
	    	 //Sort the array at the right and left(recursive)
	         quickSort(list, startIndex, pivotIndex-1); 
	         quickSort(list, pivotIndex+1, endIndex); 
	         
	     } //if
	 } //sort
	
	public static void main(String[] args) {
		
		int[] testArray = {35,33,42,10,19}; //create and declare an array for test
		int[] test2 ={1, 4, 2, 4, 2, 4, 1, 2, 4, 1, 2, 2, 2, 2, 4, 1, 4, 4, 4};
		
		quickSort(testArray, 0 ,testArray.length-1);
		
		printArray(testArray);
		
		quickSort(test2, 0 ,test2.length-1);
		
		printArray(test2);
		
		

	}//main

}//class()
