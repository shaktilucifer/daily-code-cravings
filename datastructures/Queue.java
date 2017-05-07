import java.util.*;
import java.lang.*;
import java.io.*;

class Queue {
	private Node head;
	private Node tail;
	private int size;
	
	public void enqueue(Object item){
		Node temp = tail;
		tail = new Node(item);
		if(size == 0){
			head = tail;
			size++;
			return;
		}
		temp.setNext(tail);
		size++;
	}
	
	public void dequeue(){
		if(size == 0){
			head = null;
			tail = null;
			size--;
			return;
		}
		 head = head.getNext();
	}
	
	public Node peek(){
		
		//Peek for node 
		return tail;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int size(){
		return size;
	}
}

class Node{
	private Node next;
	private Object item;
	
	Node(){
		this.next = null;
	}
	
	Node(Object item){
		this.next = null;
		this.item = item;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public void setNext(Node node){
		this.next = node;
	}
	
	public Object getItem(){
		return this.item;
	}
	
	public void setItem(Object item){
		this.item = item;
	}
	
	public void printNode(){
		System.out.println(this.item);
	}
}

/**
 * Testing Class
 */ 
class QueueTester {
    public static void main(String[] args) {
       Queue que = new Queue();
       System.out.println("Enqueue");
       que.enqueue(2.2);
       que.enqueue(2.4);
    }
}
