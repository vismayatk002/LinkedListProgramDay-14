package com.linkedlistprogram;

public class LinkedListMain 
{
    public static void main( String[] args )
    {
    	//creating object with DataType integer
        LinkedList<Integer> list = new LinkedList<>();

        list.add(70);
        list.add(30);
        list.add(56);
        System.out.println("Linked List : " + list.get(0) + "->" + list.get(1) + "->" + list.get(2));
//        System.out.println("Linked List : " + list.get(2));
    }
}
