package linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

// reverse a linked list using stack
public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		System.out.println("List before reverse: " + list);
		solution(list);
		System.out.println("List after reverse: " + list);

	}

	private static void solution(LinkedList<Integer> list) {
		Stack<Integer> stack = new Stack<Integer>();
		list.forEach(x -> {
			stack.push(x);
		});

		for (int num : list) {
			if (!stack.isEmpty())
				num = stack.pop();
		}

		System.out.println(list);
	}

}
