/*Name: Yen Lung Chen/ Student No. 2971978
 * 
 */

//allow user to input
import java.util.Scanner; 

//creating a subclass called Insert
public class Insert extends Average{
	
	//constructor of Insert by using super() method
	public Insert(int[] array) {
		super(array);
		

	}//constructor()
	
	//creating method for inserting elements
	public void insert(int [] array) {
		
		//declare the value entered and the specific location
		int pos;
		int value;
		//creating object of Scanner from user
		Scanner input = new Scanner(System.in);
				
		//use for loop to limit the number times of insert based on the length of array	
		for  (int i=0; i<array.length;i++) {
			
			System.out.println("Enter the value you wish to insert: "+"\t");
			value=input.nextInt();
			
			System.out.println("Please specify the location in the array for the value: "+"\t");
			pos= input.nextInt();
			//shifting array
			for(int k= array.length-2;k>=pos;k--) {
				
				array[k+1]=array[k];
				
			}//for loop
			
			//assign the value in the specific location
			array[pos]=value;
			
			//print array
			for (int j=0; j<array.length; j++) {
				
				
				System.out.print(array[j]+" ");
				
			}//for loop
			
			
			System.out.println();
			
		}
		
		
		
	}//insert()
	

	public static void main(String[] args) {
		
		//creating an empty object arry of Insert class
		int [] insertA = new int [20];
		Insert a = new Insert(insertA);
		//call the method for insert 
		a.insert(insertA);

	}//main()

}//class()
