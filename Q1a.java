import java.util.*;

class Stack {
	
	int size = 50;									//Initialize the size of the stack
	int arr[]=new int[size];						//Initialize the stack array
	int top = -1;									//Initialize the top of the array
	
	void push(int a) 								//Method for Put an element on top of stack
	{
		 if(top < size)								//If top not reached to stack size,
		 {
			top++;									//top index will increase
			arr[top] = a;							//Assign new element as the top 
			System.out.println(a + " is pushed into stack");	//Output the update of top
		 }		 
		 else										//If top will reached to stack size,
		 {
			 System.out.println("stack over sized");		//Display a error message
		 }
	}
	 
	void pop()										//Method for reduce the top of stack
	 {
		 if (top >= 0)
		 {
			 System.out.println("the " + arr[top] + " is poped from stack"); //Output the update of top
			 top--;
		 }
		 else
		 {
			 System.out.println("Stack have no size");		//Display a error message
		 }		 
	 }
	 
	 void peek()									//Method for display the top of stack
	 {
		 if (top >= 0)
		 {
			 System.out.println("the top of the stack is :" + arr[top] );	//Display the top
			 
		 }
		 else
		 {
			 System.out.println("Stack have no size");		//Display a error message
		 }		 
	 }
	 
	 void isEmpty() 										//Method for check the emptiness of stack
	 {		
		 if (top < 0)
		 {
			 System.out.println("the stack is empty " );	//if stack is empty	 
		 }
		 else
		 {
			 System.out.println("the stack is not empty " );//if stack is not empty
		 }		 
	 }
	 
	 void isFull()											//Method for check that the stack is full
	 {
		  if (top == size)
		 {
			 System.out.println("the stack is max sized " );//if stack is full	 
		 }
		 else
		 {
			 System.out.println("the stack is not max sized " );//if stack is not full
		 }		 
	 }
	 
	 void display()										//Print the stack array
	 {
		 System.out.print("The stack Array is : {" );			
		 for(int i = top; i>= 0; i--)
		 {
			 System.out.print(" " + arr[i] );
		 }
		 System.out.print(" }" );		 
	 }	
}

class Q1a {	
    public static void main(String[] args) 
	{
			
		Stack st = new Stack();						//Create a new object in stack class			
		
		st.push(30);								//Put 30 on top of stack
		st.push(50);								//Put 50 on top of stack
		st.push(20);								//Put 20 on top of stack
		st.push(10);								//Put 10 on top of stack
		
		
		st.peek();									//Output the peek at top of stack
		st.pop();									//Take item from top of stack
		st.isEmpty();								//Check the stack is empty
		st.isFull();								//Check the stack is full
		st.display();								//Display the stack array
			
	
	}
}