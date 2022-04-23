package linkedlist;

import java.util.Optional;

public class LinkedListImpl {

	public static void main(String[] args) {
		Node head = new Node(10);
		Node temp1 = new Node(20);
		Node temp2 = new Node(30);
		Node temp3= new Node(40);
		head.setNext(temp1);
		temp1.setNext(temp2);
		temp2.setNext(temp3);
		temp3.setNext(null);

		printLinkedList(head);

	}

	private static void printLinkedList(Node head) {
		Node curr = head;
		while (curr!= null) {

			System.out.printf("{Node data = %d , Node next address=%s} \n", curr.getData(), curr.getNext());
			curr=curr.getNext();
		}

	}

}

class Node {
	private int data;
	private Node next;

	Node(int data) {
		this.data = data;
		this.next=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}