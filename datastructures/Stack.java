import java.util.*;
import java.lang.*;
import java.io.*;

class Stack
{
	private Node top;
	private int size;
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public int size(){
		return size;
	}
	
	public void push(Object data){
		Node temp = top;
		top = new Node(data);
		top.setNext(temp);
		size++;
	}
	
	


}

class Node{
	private Object data;
	private Node next;

	
	Node(Object data){
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
	
	public void setData(){
		this.data = data;
	}
	
}

class StackTester{
		
	public static void main (String[] args) throws java.lang.Exception
	{

}
}
