import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedQueue{
	private Node head;
	private Node tail;
	private int size;
	
	LinkedQueue(){
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int size(){
		return size;
	}
	
	public void push(Object data){
		Node newNode = new Node(data);
		if(size() == 0){
			head.setNext(newNode);
			tail = newNode;
			return;
		}
		newNode.setNext(tail);
		tail = newNode;
		size++;
	}
	
	public void pop(){
		Node temp = head.getNext();
		if(temp == null){
			System.out.println("cannot pop empty stack");
		}
		head.setNext(temp.getNext());
		size--;
	}
}

class Node{
	private Object data;
	private Node next;
	
	Node(){
		this.next = null;
	}
	Node(Object data){
		this.next = null;
		this.data = data;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public void setNext(Node node){
		this.next = node;
	}
	
	public Object getData(){
		return this.data;
	}
	
	public void setData(Object data){
		this.data = data;
	}
}

class LinkedQueueTester
{
	public static void main (String[] args) throws java.lang.Exception
	{
	}
}
