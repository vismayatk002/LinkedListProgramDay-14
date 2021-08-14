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
        System.out.println("Size of Linked list : " + list.size());

        list.addInBetween(1, 30);
        System.out.println("Linked List : " + list.get(0) + "->" + list.get(1) + "->" + list.get(2));
        int SearchValue = 30;
        int position = list.searchNode(SearchValue);
        if(position >= 0) {
        	list.addInBetween(position+1, 40);
        	System.out.println("Element inserted");
        	System.out.println("Linked List : " + list.get(0) + "->" + list.get(1) + "->" + list.get(2)+ "->" + list.get(3));
        	System.out.println("Size of Linked list : " + list.size());
        }
        else {
        	System.out.println(SearchValue + "Not Found in Linked list");
        }
        int deleteValue = 40;
        position = list.searchNode(deleteValue);
        if(position >= 0) {
        	list.deleteInBetween(position, deleteValue);
        	System.out.println("Element deleted");
        	System.out.println("Linked List : " + list.get(0) + "->" + list.get(1) + "->" + list.get(2));
        }
        else {
        	System.out.println(SearchValue + "Not Found in Linked list");
        }
        System.out.println("Size of Linked list : " + list.size());
        
        // Sorted List    
        
        SortedLinkedList<Integer> sortedList = new SortedLinkedList<>();
        sortedList.add(56);
    	System.out.println("Linked List : " + sortedList.get(0));
    	sortedList.add(30);
    	System.out.println("Linked List : " + sortedList.get(0) + "->" + sortedList.get(1));
    	sortedList.add(40);
    	System.out.println("Linked List : " + sortedList.get(0) + "->" + sortedList.get(1) + "->" + sortedList.get(2));
    	sortedList.add(70);
    	System.out.println("Linked List : " + sortedList.get(0) + "->" + sortedList.get(1) + "->" + sortedList.get(2)+ "->" + sortedList.get(3));
    	sortedList.add(35);
    	System.out.println("Linked List : " + sortedList.get(0) + "->" + sortedList.get(1) + "->" + sortedList.get(2)+ "->" + sortedList.get(3)+ "->" + sortedList.get(4));
    }
}
