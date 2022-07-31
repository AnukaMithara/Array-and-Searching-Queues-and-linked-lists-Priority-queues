import java.util.*;

class Stack {
	
	int size = 50;							//Initialize the size of the stack
	char arr[]=new char[size];				//Initialize the stack array
	int top = -1;							//Initialize the top of the array
	
	void push(char a) 						//Method for Put an element on top of stack
	{
		 if(top < size)						//If top not reached to stack size,
		 {
			top++;							//top index will increase
			arr[top] = a;					//Assign new element as the top			
		 }		 
		 else
		 {
			 System.out.println("stack over sized");	//Display a error message
		 }
	}
	 
	void pop()								//Method for reduce the top of stack
	 {
		 if (top >= 0)
		 {
			 System.out.print(arr[top]);	//Output the update of top
			 top--;
		 }
		 else
		 {
			 System.out.println("Stack have no size");	//Display a error message
		 }		 
	 }
}


class Q1bReverseWord {	
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);			//Create a new object in Scanner class	
		Stack st = new Stack();							//Create a new object in stack class
			
		System.out.print("Type your word : " );
		String word = sc.nextLine();					//Get a userinput for the word
		
		char[] charArray=  word.toCharArray();			//Convert string to char array
		for(int i = 0;i < word.length(); i++)			//Push characters one by one to stack
		{
			st.push(charArray[i]); 
		}
		System.out.print("The reverse word is : " );	
		for(int i = 0;i < word.length(); i++)			//for output the reverse word, 
		{
			st.pop(); 									//pop charactes one by one
		}
		System.out.println( );		
			
	}
}