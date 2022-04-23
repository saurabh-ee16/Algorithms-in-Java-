package queue;

public interface Queue {

	public int getFront();

	public int getRear();

	public void enqueue(int x);

	public void dequeue();

	public boolean isFull();

	public boolean isEmpty();

}
