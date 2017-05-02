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

    /*
    * Adds an element to the end of the list
    */
    public void addNode(Object data) {
        Node nodeToAdd = new Node(data);
        while (head.getNext() != null) {
            head = head.getNext();
        }
        head.setNext(nodeToAdd);
        this.size++;
    }

    public void printList() {
        if (this.isEmpty()) {
            System.out.println("The List is empty!");
            return;
        }
        while (head.getNext() != null) {
            System.out.println(head.getNext().data);
            head = head.getNext();
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
        System.out.println(list.isEmpty());
        list.printList();
    }
}