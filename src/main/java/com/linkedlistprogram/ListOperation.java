package com.linkedlistprogram;

public interface ListOperation<T> {

	void add(T data);
	T get(int index);
	T pop();
	T popLast();
	boolean isEmpty();
}
