/**Name: Yen Lung Chen/ Student No. 2971978
 * 
 * Implement and test our Circular Queue approach, also discussed 
 * Create enqueue, dequeue, isEmpty, isFull methods, and test them in the main method
 * 
 */
package workbook02;


public class CircularQueue {
	
	Integer [] queue; //attribute

	/**
	 * constructor
	 */
	public CircularQueue(int n) { //this constructor is the main constructor and will be fully tested after the whole coding is made.
		
		queue = new Integer [n];
		
	}//constructor
	
	public CircularQueue(Integer[] test) { //this constructor can be used for test purpose before the whole program is finished
		
		queue = test;
		
	}//constructor
	
	public int head() { //To find the location of head 
		
		int head = 0;
		
		if(queue[0]!=null&&queue[queue.length-1]!=null) { //In wrap around condition to find head
			
			for (int i=0; i<queue.length;i++) {
				
				if(queue[i]==null) { //head will be after the last null element
					
					head = i+1;
									
				}//if
				
			}//for		
			
		}//if
		
		else { //without wrap around condition to find head
			
			for (int i=0; i<queue.length;i++) {
				
				if(queue[i]!=null) { //once the first not null element is found, exit the method
					
					head = i;
					return head;
					
				}//if
				
			}//for
			
		}//else
			
		return head;
		
	}//head()
	
	public int tail() { //To find the location of tail
		
		int tail = 0;
		
		if(queue[0]!=null&&queue[queue.length-1]!=null) { //In wrap around condition to find tail
			
			for (int i=0; i<queue.length;i++) {
				
				if(queue[i]==null) { //the tail will be the first null element then exit the method immediately
					
					tail = i;
					return tail;
									
				}//if
				
			}//for		
			
		}
		
		else { //without wrap around condition to find tail
			
			for (int i=0; i<queue.length;i++) {
				
				if(queue[i]!=null) { //use for loop to search the last not null element
					
					tail = i+1;
					
					if(tail==queue.length) { //wrap the tail to head
						
						tail = 0;
					}//if
					
				}//if
				
			}//for
			
		}//else
			
		return tail;
	}//tail()
	
	public boolean isEmpty() {
		
		boolean e = false;
		
		if(head()==tail()) {
			e = true;
		}
		return e;
		
	}//empty()
	
	public boolean isFull() {
		boolean f = false;
		
		if(head()==0&&tail()==queue.length-1) { //first condition of full
			f = true;
		}
		
		if(head()==tail()+1) { //second condition of full
			f = true;
		}
		
		return f;
	}//isFull()
	
	public void enqueue(int x) {
		
		if(isFull()) {
			
			System.err.println("The queue is full, not able to enqueue, overflow.");
		}//if
		
		else {
			queue[tail()]=x;
		}
		
	}//enqueue()
	
	public Integer dequeue() {
		
		Integer temp = null;
		
		if(isEmpty()) {
			
			System.err.println("The queue is empty, nothing to pop, underflow.");
			 return temp;
			
		}
		
		else {
			
			temp=queue[head()];
			queue[head()]=null;
			
		}
		
		return temp;
		
	}//dequeue()
	
	public void display() {
		
		for(int i=0; i<queue.length; i++) {
			
			if(i==queue.length-1) {
				
				System.out.println(queue[i]+"\t");
					
			}//if
			
			else System.out.print(queue[i]+"\t");
		}//else
	}//display()
	
	
	public static void main(String[] args) {
		
		Integer [] test = {2,3,null,5,6};
		CircularQueue testA = new CircularQueue (test); //this object is just for test in the earlier stage 
		
		//System.out.println(testA.head());
		//System.out.println(testA.tail());
		//System.out.println(testA.isEmpty());
		//System.out.println(testA.isFull());
		
		CircularQueue a = new CircularQueue(5);
		
		a.enqueue(1);
		a.enqueue(2);
		a.enqueue(3);
		a.enqueue(4);
		
		a.display();
		System.out.println(a.isFull());
		
		a.dequeue();
		a.dequeue();
		
		a.display();
		
		a.enqueue(5);
		a.enqueue(6);
		
		a.display();
		
		a.dequeue();
		
		//System.out.println(a.head());
		//System.out.println(a.tail());
	
		a.display();
		
	}//main()

}//class()
