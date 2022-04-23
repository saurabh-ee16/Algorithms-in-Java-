package queue;

public class ArrayImplQueue {

	public static void main(String[] args) {

		Queue queue = new ArrayQueue(5);
	}

}

/*
 * simple array implementation of Queue
 */
class ArrayQueue implements Queue {
	int capacity;
	int size;
	int[] arr;

	ArrayQueue(int c) {
		capacity = c;
		size = 0;
		arr = new int[capacity];
	}

	@Override
	// inserting at rear
	public void enqueue(int x) {
		if (isFull())
			return;
		else {
			arr[size] = x;
			size++;
		}
	}

	@Override
	// removing from front
	public void dequeue() {
		if (isEmpty())
			return;
		for (int i = 0; i < size - 1; i++) {
			arr[i] = arr[i + 1];
		}
		size--;

	}

	@Override
	public int getFront() {
		if (isEmpty())
			return -1;
		return 0;
	}

	@Override
	public int getRear() {
		if (isEmpty())
			return -1;
		return size - 1;

	}

	@Override
	public boolean isFull() {
		if (size == capacity)
			return true;
		else
			return false;
	}

	@Override
	public boolean isEmpty() {
		if (size == 0)
			return true;
		else
			return false;
	}

}