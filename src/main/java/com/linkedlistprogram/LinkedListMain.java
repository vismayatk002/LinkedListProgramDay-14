package com.linkedlistprogram;

public class LinkedListMain 
{
    public static void main( String[] args )
    {
    	//creating object with DataType integer
        LinkedList<Integer> list = new LinkedList<>();

        list.add(56);
        list.add(70);
        System.out.println("Linked List : " + list.get(0) + "->" + list.get(1));
        list.addInBetween(1, 30);
        System.out.println("Linked List : " + list.get(0) + "->" + list.get(1) + "->" + list.get(2));
        int SearchValue = 30;
        int position = list.searchNode(SearchValue);
        if(position >= 0) {
        	list.addInBetween(position+1, 40);
        	System.out.println("Linked List : " + list.get(0) + "->" + list.get(1) + "->" + list.get(2)+ "->" + list.get(3));
        }
        else {
        	System.out.println(SearchValue + "Not Found in Linked list");
        }
    }
}
