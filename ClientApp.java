package stackExercises;

public class ClientApp {
	public static void main(String[] args)
	{
	Stack myStack = new Stack(5);
	myStack.push("");
	System.out.println(myStack.peek());
	myStack.pop();
	myStack.push("");
	System.out.println(myStack.peek());
	myStack.push("");
	System.out.println(myStack.peek());
	myStack.push("");
	System.out.println(myStack.peek());
	myStack.push("");
	System.out.println(myStack.peek());
	myStack.push("");
	System.out.println(myStack.peek());
	}
}
