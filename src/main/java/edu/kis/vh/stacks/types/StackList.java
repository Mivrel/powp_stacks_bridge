package edu.kis.vh.stacks.types;

import edu.kis.vh.stacks.StackInterface;

public class StackList implements StackInterface {

	Node last;
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return emptyStack;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return emptyStack;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
