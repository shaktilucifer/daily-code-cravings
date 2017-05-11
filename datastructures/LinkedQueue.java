
import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedQueue{



	
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
