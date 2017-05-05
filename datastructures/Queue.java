import java.util.*;
import java.lang.*;
import java.io.*;

class Queue {
	private Node head;
	private Node tail;
	private int size;
	
	public void enqueue(Object item){
		Node node = new Node(item);
		if(size == 0){
			tail = node;
			head = tail;
			return;
		}		
		tail.setNext(node);
		tail = node;
	}
	
	public void dequeue(){
		
	}
	
	public Node peek(){
		
		//Peek for node 
		return tail;
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
		System.out.println(this.data);
	}
}

/**
 * Testing Class
 */ 
class QueueTester {
    public static void main(String[] args) {
       
    }
}
