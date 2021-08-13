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
