/**Name: Yen Lung Chen/ Student No. 2971978
 * 
 * Implement and test our naïve Queue approach. 
 * Create enqueue, dequeue, isEmpty, isFull methods, and test them in the main method.
 * 
 */
package workbook02;


public class NaiveQueue {
	
	Integer [] queue; //attribute 

	/**
	 * constructor
	 */
	public NaiveQueue(int n) {  //this constructor is the main constructor and will be fully tested after the whole coding is made.
		
		queue = new Integer [n];
		
	}
	
	public NaiveQueue(Integer [] test) { //this constructor can be used for test purpose before the whole program is finished
		
		queue = test;
		
	}
	
	public int findTail() { //The tail of the queue will always be the next available space
		
		int tail = 0;
		
		for (int i=0; i<queue.length; i++) { //use for loop to find the next position a value can be enqueued to
			
			if(queue[i]!=null) {
				
				tail = i+1; //tail is located after the last not null element in a queue
				
			}//if
		
		}//for
		
		return tail;
		
	}//findTail()
	
	public boolean isEmpty () { //To find whether a queue is empty 
		
		boolean e = false;
		
		if(findTail()==0) { //if tail is 0, the queue is empty
			
			e = true;
			
		}//if
		
		else {
			
			e = false;
		}

		return e;
		
	}//isEmpty()
	
	public boolean isFull() { //To find whether a queue is full
		
		boolean f = false;
		
		if(findTail()==queue.length) { //if the tail is outside of the array boundary means the queue is full
			
			f = true;
			
		}//if
		
		else {
			f = false;
		}//else
		return f;
	}//isFull()

	
	public void enqueue(int x) { //Enqueue items to the tail of the queue
		
		if(isFull()) {
			
			System.err.println("The queue is full, not able to enqueue, overflow.");
			
		}//if
		
		else {
			
			queue[findTail()] = x;
			
		}//else
		
	}//enqueue()
	
	public Integer dequeue() { //Each time an item is dequeued, move the other items up a space
		
		Integer temp = null;
		
		if(isEmpty()) {
			
			System.err.println("The queue is empty, nothing to pop, underflow.");
			 return temp;
			
		}
		
		else {
			
			temp = queue[0]; //store the value of dequeue
			
			for (int i=0; i<findTail()-1; i++) { //use for loop to shift every item left in the queue each time an item is dequeued.

				
				queue[i] = queue[i+1];
				
			}//for
			
		}//else
		
		return temp;
	}//dequeue
	
	public void display() {
		
		for(int i=0; i<queue.length; i++) {
			
			if(i==queue.length-1) {
				
				System.out.println(queue[i]+"\t");
					
			}//if
			
			else System.out.print(queue[i]+"\t");
		}//else
	}//display()

	
	public static void main(String[] args) {
		
		Integer [] test = {2,2,2,2};
		NaiveQueue testA = new NaiveQueue (test); //this object is just for test in the earlier stage 
		
		NaiveQueue a = new NaiveQueue(5);
		
		System.out.println(a.findTail());
		System.out.println(a.isEmpty());
		System.out.println(a.isFull());
		
		a.dequeue(); //test for error of underflow
		
		a.enqueue(2);
		a.enqueue(55);
		a.enqueue(44);
		a.enqueue(46);
		a.enqueue(77);
		
		a.display();
		
		System.out.println(a.isFull());
		
		
		a.enqueue(98); //test for error of overflow
		
		
	}

}
