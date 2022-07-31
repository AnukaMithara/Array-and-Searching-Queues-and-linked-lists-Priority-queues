import java.util.*;

class Stack {
	
	int size = 100;							//Initialize the size of the stack
	char arr[]=new char[size];				//Initialize the stack array
	int top = -1;							//Initialize the top of the array
	
	void pop()								//Method for reduce the top of stack
	 {
		 if (top >= 0)
		 {
			top--;							//reduce the top of stack
		 }
		 else
		 {
			 System.out.println("Stack have no size");		//Display a error message
		 }		 
	 }
	 
	void push(char x) 						//Customized pushed method for add delimiters to the stack
	{
		 if(top < size)
		 {
			if (x == ')' && arr[top] == '(')	//Pushed character compared with the top
			 {
				 pop();
			 }	
			if (x == '}' && arr[top] == '{')	//Pushed character compared with the top
			{
				 pop();
			}	
			if(x == ']' && arr[top] == '[')		//Pushed character compared with the top
			 {
				 pop();
			 }	
			 if( x == '(' || x == '[' || x == '{' )		//If not one of above, check if a delimiter
				 {	
					 top++;						//top index will increase
					arr[top] = x;				//Assign new character as the top 
				 }
		 }		 
	}	
	 
	 	void display()							/*Method for display the delimiters 
												that which could not be closed*/ 
	 { 
	 if(top > -1)
		{
		 System.out.print("Errors found : " );	
		 for(int i = top; i>= 0; i--)
		 {
			 System.out.print(" " + arr[i] );
		 }				 
		}	
	 }
}




class Q1bDelimitersMatching {	
    public static void main(String[] args) 				
	{
		Scanner sc = new Scanner(System.in);		//Create a new object in Scanner class
		Stack st = new Stack();						//Create a new object in stack class
			
		System.out.print("Enter your equation : " );	
		String word = sc.next();						//Get a user input for the equation
		
		char[] charArray=  word.toCharArray();		//Convert string to char array
		for(int i = 0;i < word.length(); i++)		//Push character by character to stack
		{
			st.push(charArray[i]); 						
		}		
			st.display();							//Display the delimiters that which could not be closed 
	}
}