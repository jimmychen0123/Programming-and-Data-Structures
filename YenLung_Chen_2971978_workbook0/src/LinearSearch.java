/*Name: Yen Lung Chen/ Student No. 2971978
 * 
 */
public class LinearSearch extends Average {
	//creating a subclass called LinearSearch
	public LinearSearch(int[] array) {
		//constructor of LinearSearch by using super() method
		super(array);	
	}
	//method to populate array
	public void populateArray(int[] array) {
		
		for (int i=0; i<array.length;i++) {
			//use random method to assign array 
			array[i]=(int)(Math.random()*100);
			System.out.print(array[i]+" ");
		}
		
	}
	//method to do linear search
	public int searchArray(int [] array, int key) {
		
		for(int j=0;j<array.length;j++) {
			
			if(key==array[j]) {
				
				return j;
			}//if
					
		}//for loop
		
		return -1;
		
	}//searchArray()
	
		
	public static void main (String[] args) {
		
		int [] searchA = new int [20];
		
		LinearSearch a = new LinearSearch(searchA);
		
		a.populateArray(searchA);
		a.searchArray(searchA, 50);
		
		System.out.println("\n"+"The result: "+a.searchArray(searchA, 50));
		
		
		
	}
	
	

}
