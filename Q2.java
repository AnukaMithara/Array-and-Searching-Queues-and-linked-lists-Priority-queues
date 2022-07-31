import java.util.*;

class Queue {
	
	int size = 100;							//Initialize the size of the Queue
	int arr[]=new int[size];				//Initialize the Queue array
	int rear = -1;							//Initialize the rear of the Queue
	int front = 0;							//Initialize the front of the Queue
	
	void insert(int a) 						//Method for insert an element into Queue
	{
		 if(isFull())						//If rear not reached to Queue size,
		 {
			 System.out.println("the queue is max sized" );		//if Queue is full	 
				
		 }
			rear++;							//rear index will increase
			arr[rear] = a;					//Assign new element as the rear 
			System.out.println(a + " is insert into queue");	//Output the update of rear
			//return arr[rear];		
	}
	 
	void remove()							//Method for reduce the front of Queue
	 {
		 if (isEmpty())
		{		
			 System.out.println("the Queue is empty " );		//if Queue is empty	
		} 	
			System.out.println("the " + arr[front] + " is removed from Queue"); //Output the update of front
			front++;				
			//return arr[front-1];
	 }
	 
	 void peek()							//Method for display the frontof Queue
	 {
		 if (isEmpty())
		 {			 
			System.out.println("the Queue is empty " );		//if Queue is empty	
		 }	
		System.out.println("the peek of the Queue is :" + arr[front] );	//Display the peek
		 //return arr[rear];
	 }
	 
	 boolean isEmpty() 						//Method for check the emptiness of Queue
	 {		
		 if (rear < 0)
		 {
			 
			 return true;
		 }
		 else
		 {
			return false;
		 }		 
	 }
	 
	 boolean isFull()						//Method for check that the Queue is full
	 {
		  if (rear == size)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }		 
	 }
	 
	 void display()							//Print the Queue array
	 {
		 System.out.print("The Queue Array is : {" );			
		 for(int i = front; i<= rear; i++)
		 {
			 System.out.print(" " + arr[i] );
		 }
		 System.out.print(" }" );		 
	 }	
}

class Q2{	
    public static void main(String[] args) 
	{			
		Queue qe = new Queue();				//Create a new object in Queue class			
		
		qe.insert(3);						//Put 30 into Queue
		qe.insert(-1);						//Put 50 into Queue
		qe.insert(20);						//Put 20 into Queue
		qe.insert(10);						//Put 10 into Queue
		qe.insert(5);						//Put 10 into Queue
		qe.insert(-5);						//Put 10 into Queue
		qe.insert(100);						//Put 10 into Queue		
		
		qe.peek();							//Output the peek of Queue
		qe.remove();						//Remove the front of Queue
		qe.isEmpty();						//Check the Queue is empty
		qe.isFull();						//Check the Queue is full
		qe.display();						//Display the Queue array	
	}
}


