import java.util.*;
import java.lang.*;
import java.io.*;

class ListLinked {
    Node head;
    int size;

    ListLinked() {
        head = new Node();
    }

    //Returns if the list is empty or not
    public boolean isEmpty() {
        return head.getNext() == null;
    }

    public int size() {
        return size;
    }

    /*
    * Adds an element to the end of the list
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

    public Node find(Object data) {
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            if (currentNode.getNext().data.equals(data)) {
                return currentNode;
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }

    public void printList() {
        Node currentNode = head;
        if (this.isEmpty()) {
            System.out.println("The List is empty!");
            return;
        }
        while (currentNode.getNext() != null) {
            System.out.println(currentNode.getNext().data);
            currentNode = currentNode.getNext();
            System.out.println();
        }
    }

}

class Node {
    public Object data;
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


}

class ListLinkedTester {
    public static void main(String[] args) {
        ListLinked list = new ListLinked();
        System.out.println(list.isEmpty());
        list.addNode("testString");
        list.addNode("TestString2");
        list.addNode(2.2);
        System.out.println(list.isEmpty());
        list.printList();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        //Test for finding an element in the list
        Node node = list.find(2.2);
        if (node == null) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element is found");
        }
    }
}