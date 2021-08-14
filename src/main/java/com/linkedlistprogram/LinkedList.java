package com.linkedlistprogram;

public class LinkedList<T> implements ListOperation<T> {

	//declare data and tail
    Node<T> head,tail;
    int index = 0;
    int size = 0;
    //define a default constructor 
    LinkedList(){
        //initially head and tail points to null
        head = null;
    }
    
    @Override
    public void add(T data){

        if(head == null){
            //head and tail points to new node
            head = tail = new Node<T>(data);
        }
        //currently tail.next is null then 
        else {
        	tail.next = new Node<T>(data);
            tail = tail.next; 
        }
        size++;
    }
    @Override
    //get data from a particular index
    public T get(int index){

        if(index < 0 && index > size){

            System.out.println("invalid index");
            return null;
        }
        else if(isEmpty()){
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
    @Override
    public T pop() {
    	  
        if(isEmpty()){
            System.out.println("Linked list is empty");
            return null;
        }
        else{
        	Node<T> temp = head; 
        	head = head.next;
        	return temp.data;
        } 
	}
    
    @Override
    public T popLast() {
  
        if(isEmpty()){
            System.out.println("Linked list is empty");
            return null;
        }
        else{
        	Node<T> tmp = null;
        	Node<T> temp = head;
        	while(temp != tail) {
        		
        		tmp = temp;
            	temp = temp.next;
        	}
        	tail = tmp;
        	tail.next = null;
            return temp.data;
        } 
   	}
    
    @Override
    public int searchNode(T data) {
    	Node<T> temp = head;
    	int i = 0;
    	while(temp != tail) {
    		if(temp.data == data) {
    			return i;
    		}
    		temp =temp.next;
    		i++;
    	}
    	return -1;
    }
    
    @Override
    public void addInBetween(int index, T data){

        if(index < 0 && index > size){

            System.out.println("invalid index");
            return;
        }
        else if(isEmpty()){
            System.out.println("Linked list is empty");
            
        }
        //declaration of temporary object
        Node<T> currentNode = head;
        Node<T> prevNode = null;
        
        while(currentNode != null && index != 0){
        	prevNode = currentNode;
        	currentNode = currentNode.next;
            index--;
        }
        Node<T> newNode = new Node<T>(data);
        newNode.next = currentNode;
        currentNode = newNode;
        if(prevNode != null) {
        	prevNode.next = newNode;
        }
    }
    
    @Override
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }
    private class Node<T>{

        T data;
        Node next;
        //Initialicing node using constructor
        Node(T data){
            this.data = data;
            //points to the next node default that keep it as null
            this.next = null;
        }
    }
}
