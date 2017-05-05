import java.util.*;
import java.lang.*;
import java.io.*;

class Queue {
	private Node head;
	private Node tail;
	private int size;
	
	Queue(){
		head = null;
		tail = head;
	}
	
	public void enqueue(Object item){
	
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
}

/**
 * Testing Class
 */ 
class QueueTester {
    public static void main(String[] args) {
       
    }
}
