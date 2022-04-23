package queue;

import java.util.Arrays;

public class CircularArrayImplQueue {

	public static void main(String[] args) {
		CircularQueue queue = new CircularQueue(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(40);
		System.out.printf("Rear=%d , Front=%d, Size=%d\n", queue.getRear(), queue.getFront(), queue.getSize());
		System.out.println("Queue="+Arrays.toString(queue.getQueue()));
	}
}

/*
 * circular array implementation of Queue data structure. This Impl is efficient
 * than simple array Impl
 */
class CircularQueue implements Queue {
	int capacity;
	int size;
	int[] arr;
	int front;
	int rear;

	CircularQueue(int c) {
		this.capacity = c;
		this.size = 0;
		this.arr = new int[capacity];
		this.front = -1;
		this.rear = size - 1;
	}

	// inserting at rear
	@Override
	public void enqueue(int x) {
		if (isFull())
			return;
		else {
			int rear = getRear();
			rear = (rear + 1) % capacity;
			arr[rear] = x;
			size++;
		}
	}

	// removing from front
	@Override
	public void dequeue() {
		if (isEmpty())
			return;

		front = (front + 1) % capacity;
		size--;

	}

	@Override
	public int getFront() {
		if (isEmpty())
			return -1;
		return front;
	}

	@Override
	public int getRear() {
		if (isEmpty())
			return -1;
		return front+size-1;

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

	public int getSize() {
		return size;
	}
	
	public int[] getQueue() {
		return arr;
	}

}
