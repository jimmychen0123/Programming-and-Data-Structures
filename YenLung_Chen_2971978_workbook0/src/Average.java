/*Name: Yen Lung Chen/ Student No. 2971978
 * 
 */

//Create a class 
public class Average {
	
	
//What is the differences between putting static or not
//Creating the attribute for Average class
	 static int [] marks = new int[20];
	
    //Creating a constructor of Average
	public Average(int[] array) {
			
			this.marks=array;
							
	}//constructor()
	
	//Creating a method to have average from a array
	public void average(int []marks) {
		
		double sum = 0;
		double average=0;
		for(int i = 0 ; i<marks.length; i++) {
			sum +=marks[i];
			average = sum/ marks.length;
			
		}//for()
		
		System.out.println(average);
		
	}//average()
	
	
	public static void main(String[] args) {
		
		//creating, declaring, assigning an array in one statement 
		int [] aMarks = {100, 95, 90, 85, 80, 75, 70, 65, 60, 55, 50, 45, 40, 35, 30, 35, 40, 45, 50, 55};
		
		//creating an object of Average(an array)
		Average a = new Average(aMarks);
		//call the method to get average
		a.average(marks);
		
		//creating, declaring, assigning an array in one statement 
		int [] bMarks = {90, 95, 90, 85, 80, 75, 70, 65, 60, 55, 50, 45, 40, 35, 30, 35, 40, 45, 50, 55};
		//creating an object of Average(an array)
		Average b = new Average(bMarks);
		//call the method to get average
		b.average(marks);
		
	}//main 

}//class()
