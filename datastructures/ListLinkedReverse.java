import java.util.*;
import java.lang.*;
import java.io.*;

class ListLinked {
    private Node head;
    private int size;

    ListLinked() {
        head = new Node();
    }

    /**
     * Returns if the list is empty or not
     */
    public boolean isEmpty() {
        return head.getNext() == null;
    }
	
	/**
	 * Returns size of the list  
	 */
    public int size() {
        return size;
    }

   /**
    * Adds an element to the end of the listx`
    */
    public void addNode(Object data) {
        Node nodeToAdd = new Node(data);
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(nodeToAdd);
        this.size++;
    }
    
  	/**
  	 * Delete element from the List 
  	 */
    public void delete(Object data){
        Node currentNode = head.getNext();
        Node prevNode = head;
        while(currentNode != null){
            if(currentNode.getData().equals(data)){
                prevNode.setNext(currentNode.getNext());
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }
    
    /**
     * Delete first element from the list
     */ 
    public void deleteFirst(){
    	 Node currentNode = head.getNext();
    	 head.setNext(currentNode.getNext());
    	 return;
    }
    
    /**
     * Insert element in index 0
     */ 
    public void insertFirst(Object data){
		Node insertNode = new Node(data);
		Node firstNode = head.getNext();
		head.setNext(insertNode);
		insertNode.setNext(firstNode);
    }
	
	/**
	 * Find element in the list
	 */
    public Node find(Object data) {
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            if (currentNode.getNext().getData().equals(data)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

	/**
	 * Print the list of elements
	 */ 
    public void printList() {
        Node currentNode = head;
        if (this.isEmpty()) {
            System.out.println("The List is empty!");
            return;
        }
        while (currentNode.getNext() != null) {
	        currentNode.getNext().printNode();
            currentNode = currentNode.getNext();
        }
    }

    /**
     * Print elements in reverse order using recursion
     */
    public void printInReverse(){
        Node tempNode = head;
        if (this.isEmpty()) {
            System.out.println("The List is empty!");
            return;
        }
        printInReverseUsingRecursion(tempNode);
    }

    private void printInReverseUsingRecursion(Node temp){
        if(temp.getNext() != null){
            printInReverseUsingRecursion(temp.getNext());
        }   
        System.out.print(temp.getData() + "->");
    }

}

/**
 * Node Class
 */ 
class Node {
    private Object data;
    private Node next;

    Node() {
        this.data = null;
        this.next = null;
    }

    Node(Object data) {
        this.data = data;
        this.next = null;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }
    
    public Object getData(){
    	return this.data;
    }
    
    public void setData(Object data){
    	this.data = data;
    }
    
    public void printNode(){
    	System.out.println(this.data);
    }


}

/**
 * Testing Class
 */ 
class ListLinkedReverse {
    public static void main(String[] args) {
        ListLinked list = new ListLinked();
    

        list.addNode("testString");
        list.addNode("TestString2");
        list.addNode(2.2);
        list.printList();
        list.printInReverse();

    }
}