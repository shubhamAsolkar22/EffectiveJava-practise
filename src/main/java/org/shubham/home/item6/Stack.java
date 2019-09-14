package org.shubham.home.item6;

import java.util.Arrays;
import java.util.EmptyStackException;

//Can you spot the "memory leak"?
public class Stack {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		return elements[--size];
	}

	/*
	 * The fix for this sort of problem is simple: null out references once they
become obsolete. In the case of our Stack class, the reference to an item becomes
obsolete as soon as it’s popped off the stack. The corrected version of the pop
method looks like this:
	
	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null; // Eliminate obsolete reference
		return result;
	}
	
An added benefit of nulling out obsolete references is that, if they are subsequently
dereferenced by mistake, the program will immediately fail with a
NullPointerException, rather than quietly doing the wrong thing. It is always
beneficial to detect programming errors as quickly as possible.
	 */
	/**
	 * Ensure space for at least one more element, roughly doubling the capacity
	 * each time the array needs to grow.
	 */
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
	
	/**
	 *
	So where is the memory leak? If a stack grows and then shrinks, the objects
that were popped off the stack will not be garbage collected, even if the program
using the stack has no more references to them. This is because the stack maintains
obsolete references to these objects. An obsolete reference is simply a reference
that will never be dereferenced again. In this case, any references outside of
the “active portion” of the element array are obsolete. The active portion consists
of the elements whose index is less than size.
	 */
}