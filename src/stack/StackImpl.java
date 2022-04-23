package stack;


//Array implementation of stack
public class StackImpl {

	public static void main(String[] args) {
		Stack stack= new Stack(5);
		
		stack.push(5);
		stack.push(25);
		System.out.println("stack pop: "+stack.pop());
		stack.push(30);
		System.out.println("stack peek: "+stack.peek());
		System.out.println("stack size:"+stack.size() + "\nstack isEmpty: "+stack.isEmpty());
	}

}

class Stack {
	private int arr[];
	private int capacity;
	private int top;

	Stack(int capacity) {
		top = -1;
		this.capacity = capacity;
		this.arr = new int[capacity];
	}

	/*
	 * public int[] getArr() { return arr; }
	 * 
	 * public void setArr(int[] arr) { this.arr = arr; }
	 * 
	 * public int getCapacity() { return capacity; }
	 * 
	 * public void setCapacity(int capacity) { this.capacity = capacity; }
	 * 
	 * public int getTop() { return top; }
	 * 
	 * public void setTop(int top) { this.top = top; }
	 * 
	 */
	void push(int data) {
		top++;
		arr[top] = data;
	}

	int pop() {
		int res = arr[top];
		top--;
		return res;
	}

	int peek() {
		return arr[top];
	}

	int size() {
		return top + 1;
	}

	boolean isEmpty() {
		return top == -1 ? true : false;
	}

}