/**Name: Yen Lung Chen/ Student No. 2971978
 * 
 * Data structure_Stacks
 * Methods should be included: Push, Pop, isFull, isEmpty, top
 */
package workbook02;


public class Stack {
	
	
	Integer [] myList; //attribute

	/**
	 * constructor 
	 */
	public Stack (int n) { //this constructor is the main constructor and will be fully tested after the whole coding is made.
		
		myList=new Integer[n];
		for(int i = 0; i < myList.length; i++) {
			myList[i] = null;
		}
		
	}//constructor()
	
	public Stack(Integer[] test) { //this constructor can be used for test purpose before the whole program is finished 
		
		myList=test;
		
	}//constructor()
	
	public boolean isFull() { //To find whether a stack is full
		
		boolean f = false;
		
		if(size()==myList.length) { //if the top is outside of the array boundary means the stack is full
			
			f = true;
			
		}//if
		
		else {
			f = false;
		}//else
		
		return f;		
		
	}//isFull()
	
	public boolean isEmpty() { //To find whether a stack is empty 
		
		boolean e=false;
		
		if(size()==0) { //if top is 0, the stack is empty
			
			e = true;
			
		}//if
		
		else {
			e = false;
		}//else
				
		return e;
		
	}//isEmpty()
	
	public int size() { //this method is to find top
		
		int top=0; //initial top
				
		for(int i=0; i<myList.length;i++) { //use for loop to find the next position a value can be pushed to
				
			if(myList[i]!=null) { 
					
				top = i+1; //top is located after the last not null element in a stack
					
			}//if
			
		}//for
			
		
		return top;
		
	}//size()
	
	public void push(int n) { //insert operation into stack
				
		if(isFull()==true) { //check the stack if it is full before inserting
			
			System.err.println("The stack is full, not able to push, overflow.");
			
		}//if
		
		else {
			
			myList[size()] = n; //assign the value in top
			
		}//else
		
	}//push()
	
	
	public Integer pop () { //delete operation on a stack 
		
		Integer temp = null;
		
		if(isEmpty()==true) { //if the stack is empty then return null
			
			System.err.println("The stack is empty, nothing to pop, underflow.");
			
			return temp;
			
		}
		
		else {
			
			temp = myList[size()-1]; //store the value of the deletion 
			myList[size()-1]=null; //last in first out
			
		}
		
		return temp;
		
	}
	
	public void display() {
		
		for(int i=0; i<myList.length; i++) {
			
			if(i==myList.length-1) {
				
				System.out.println(myList[i]+"\t");
					
			}//if
			
			else System.out.print(myList[i]+"\t");
		}//else
	}//display()

	
	public static void main(String[] args) {
		
		Integer [] test= {1,2,null}; 
		Stack testA= new Stack(test); //this object is just for test in the earlier stage 
		
		Stack grade = new Stack(5); //creating a object for fully test
		
		
		System.out.println(grade.isEmpty());
		
		System.out.println(grade.isFull());
		
		//System.out.println(testA.size());
		
		grade.push(10);
		System.out.println(grade.size());
		
		grade.push(20);
		System.out.println(grade.size());
		
		grade.push(30);
		grade.push(45);
		grade.push(50);
		
		grade.display();
		
		grade.push(60); //to test if system would show error for overflow
		
		grade.pop();
		grade.pop();
		grade.pop();
		grade.pop();
		grade.pop();
		
		grade.display();
		
		grade.pop(); //to test if the system would show error for underflow		
		
	}//main()

}//class()
