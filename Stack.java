package stackExercises;

public class Stack 
{
	private int maximumSize;
	private int topOfArray;
	private String myArray[];
	
	public Stack(int size)
	{
		maximumSize = size;
		myArray = new String[maximumSize];
		topOfArray = 0;
	}
	
	public boolean isEmpty()
	{
		if(topOfArray == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void push(String s)
	{
		if(topOfArray < maximumSize)
		{
			int temp = topOfArray;
			myArray[topOfArray] = s;
			topOfArray++;
			System.out.printf("element %d was added", temp);
		}
		else
		{
			System.out.println("Stack has Overflown");
		}
	}
	
	public String pop()
	{
		if(!this.isEmpty())
		{
			String temporary = this.peek();
			myArray[topOfArray - 1] = null;
			topOfArray--;
			System.out.printf("element %s was removed%n", temporary);
			return temporary;
			
		}
		else
		{
			return null;
		}
	}
	
	public String peek()
	{
		if(!this.isEmpty()) 
		{
			return myArray[topOfArray - 1];
		}
		else
		{
			return null;
		}
	}
	
}
