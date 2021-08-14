package com.linkedlistprogram;


public class SortedLinkedList<T extends Comparable<T>> {
	
	//declare data and tail
    Node<T> head,tail;
    int index = 0;
    int size = 0;
    //define a default constructor 
    SortedLinkedList(){
        //initially head and tail points to null
        head = tail = null;
    }
	public void add(T data) {
		reccursiveAdd(null,head,data);
	}
	private void reccursiveAdd(Node<T> preNode, Node<T> currentNode ,T data) {
		
		if(head == null) {
			head = tail = new Node<T>(data);
			return;
		}
				
		if(data.compareTo(currentNode.data) < 0) {
			
			if(preNode == null) {
				Node<T> newNode = new Node<T>(data);
				newNode.next = currentNode;
				head = newNode;
				return;
			}
			else {
				Node<T> newNode = new Node<T>(data);
				preNode.next = newNode;
				newNode.next = currentNode;
			}
		}else {		
			if(currentNode.next == null) {
				Node<T> newNode = new Node<T>(data);
				currentNode.next = newNode;
				tail = newNode;
				return;
			}
			reccursiveAdd(currentNode,currentNode.next,data);
		}
		
	}	
	public T get(int index){

        if(index < 0 && index > size){

            System.out.println("invalid index");
            return null;
        }
        else if(head == null){
            System.out.println("Linked list is empty");
            return null;
        }
        //declaration of temporary object
        Node<T> temp = head;
        while(temp != null && index != 0){
            temp = temp.next;
            index--;
        }
        return temp.data;
    }
	
	private class Node<T>{

        T data;
        Node next;
        //Initializing node using constructor
        Node(T data){
            this.data = data;
            //points to the next node default that keep it as null
            this.next = null;
        }
    }
}
