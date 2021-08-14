package com.linkedlistprogram;

public interface ListOperation<T> {

	void add(T data);
	T get(int index);
	T pop();
	T popLast();
	boolean isEmpty();
	void addInBetween(int index, T data);
	void deleteInBetween(int index, T data);
	int searchNode(T data);
	int size();
}
