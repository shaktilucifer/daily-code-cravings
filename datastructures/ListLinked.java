import java.util.*;
import java.lang.*;
import java.io.*;

class ListLinked {
    Node head;
    int size;


}

class Node {
    private Object data;
    private Node next;

    Node() {
        this.data = null;
        this.next = null;
    }

    Node(Object data) {
        this.data = data;
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

    }
}