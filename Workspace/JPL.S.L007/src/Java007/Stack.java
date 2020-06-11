package Java007;

public class Stack <E>{
	private final int size;
	private int top;
	private E[] elements;
	
	
	public Stack() {
		size = 10;
	}
	
	public Stack(int size) {
		this.size =size;
		top =-1;
		elements = (E[]) new Object[size];
		
	}
	public void push(E pushValue) throws Exception{
		if(top==size -1) {
			throw new Exception(String.format("Stack is full cannot push %s", pushValue.toString()));
		}
		elements[++top] = pushValue;
	}
	
	public E pop() throws Exception{
		if(top==-1) {
			throw new Exception("Stack is empty, cannot pop");
		}
		return elements[top--];
	}

}
