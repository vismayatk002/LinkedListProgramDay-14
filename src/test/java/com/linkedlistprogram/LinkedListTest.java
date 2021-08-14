package com.linkedlistprogram;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LinkedListTest {

	@Test
    public void searchTest1()
    {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(56);
		list.add(30);
        list.add(70);
		int SearchValue = 30;
		Assertions.assertEquals(true, list.searchNode(SearchValue));
    }
	@Test
    public void searchTest2()
    {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(56);
		list.add(30);
        list.add(70);
		int SearchValue = 35;
		Assertions.assertEquals(false, list.searchNode(SearchValue));
    }
}
