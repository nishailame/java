package name.abhijitsarkar.codinginterview.datastructure.impl;

import java.util.Collection;

import name.abhijitsarkar.codinginterview.datastructure.LinkedList;
import name.abhijitsarkar.codinginterview.datastructure.Stack;

public class StackImpl<E> implements Stack<E> {
	private LinkedList<E> stack = null;

	public StackImpl() {
		stack = new LinkedListImpl<E>();
	}

	public StackImpl(Collection<E> elements) {
		stack = new LinkedListImpl<E>(elements);
	}

	@Override
	public E push(E element) {
		if (stack.add(0, element)) {
			return element;
		}

		return null;
	}

	@Override
	public E pop() {
		return stack.remove(0);
	}

	@Override
	public E peek() {
		return stack.peek();
	}

	@Override
	public boolean isEmpty() {
		return stack.size() == 0;
	}

	@Override
	public String toString() {
		return "StackImpl [stack=" + stack + "]";
	}
}