import java.util.*;

class Node
{
	int data;							//Node value
	Node nextAddr;						//Next Node address
		
}

class LinkedList
{
	Node top;							//Create a object for first value
	
	void insert(int a)					//Method for insert a value
	{
		Node nd = new Node();			//Create new object in node class
		
		nd.data = a;					//Assign the input data value to created object
		nd.nextAddr = null;				//New object next address asign as the null value
		
		if(top == null)					//If only exsist top/1 value
		{
			top = nd;					//top object change
		}
		else
		{
			Node b = top;				//b object assign as top object
			while (b.nextAddr != null)	//loop untill address comming null value
			{
				b = b.nextAddr;			//Update to the next object
				
			}
			b.nextAddr = nd;
			
		}		
	}
	
	void insertFirst(int a)				//Method for insert a value to the first
	{
		Node nd = new Node();			//Create new object in node class
		
		nd.data = a;					//New node data assign				
		nd.nextAddr = top;				//New node address assign as current top address
		top = nd;						//top update to new data
	
	}
	
	void deleteFirst()					//Method for insert a value to the first
	{
		System.out.print("\nThe start value " + top.data + " deleted");
		top = top.nextAddr;				//top address update to next Address
			
	}
	
		
	void delete(int index)				//Method for delete a value	
	{
		if(index == 0)					//If it is first value
		{
			deleteFirst();
		}
		else
		{
			Node b = top;				//b object assign as top object
			Node c = null;				//create c object
			for(int i = 0;i<index - 1;i++)
			{
				b = b.nextAddr;					//Update to the next object
			}
			System.out.print("\nThe value of " + b.data + " in index "+index+ " deleted");	
			c = b.nextAddr;						
			b.nextAddr = c.nextAddr;		
		}
	}
	
	void find(int val)
	{
		Node b = top;					//b object assign as top object
		int count = 0;
		while(true)
		{	
			if((b.nextAddr == null) ||(b.data == val))	/*if counting address is null or 
															object data value equal to user find value*/
			{
				System.out.println("\nIndex of the " + val + " is : "+ count);
				break;
			}
			
			
			b = b.nextAddr;								//Update to the next object
			count++;		
		}
	}	
		
	
	
	void display()									//Method for display the Link list
	{			Node b = top;						//b object assign as top object
	System.out.print("\nThe Linked list is : {" );
		while (true)
			{
				System.out.print(b.data + " ");		//Objects data
				
				if(b.nextAddr == null)				//If object reached to top
				{
					break;
				}
				b = b.nextAddr;						//Update to the next object
			}
			System.out.print(" }" );
	}
	
	
	
		
}
	 


class Q3{	
    public static void main(String[] args) 
	{			
		LinkedList ll = new LinkedList();		//Create a new object in Queue class			
		
		ll.insert(3);				//Put 30 into Link list
		ll.insert(-1);				//Put -1 into Link list
		ll.insert(20);				//Put 20 into Link list
		ll.insert(10);				//Put 10 into Link list
		ll.insert(5);				//Put 5 into Link listeue
		ll.insert(-5);				//Put -5 into Link list
		ll.insert(100);				//Put 100 into Link list	
		
		ll.insertFirst(55);		//Insert 55 as the first value
		ll.display();			//display the updated Link list
		ll.deleteFirst();		//delete the first value
		ll.display();			//display the updated Link list
		ll.delete(3);			//delete the 3rd index value
		ll.display();			//display the updated Link list	
		ll.find(100);			//find the index of 100
		
	}
}


