import java.util.*;
import java.lang.*;
import java.io.*;

class Stack {
    private Node top;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(Object data) {
        Node temp = top;
        top = new Node(data);
        top.setNext(temp);
        size++;
    }

    public void pop() {
        if (top == null) {
            System.out.println("Cannot pop an empty stack");
            return;
        }
        System.out.println("Item " + top.getData() + "is popped");
        top = top.getNext();
        size--;
    }




}

class Node {
    private Object data;
    private Node next;


    Node(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public Object getData() {
        return this.data;
    }

    public void setData() {
        this.data = data;
    }

}

class StackTester {

    public static void main(String[] args) throws java.lang.Exception {
        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        stack.push(2.2);
        stack.push(2.4);
        stack.push("Imprfectluck");
        System.out.println(stack.size());
        stack.pop();
        System.out.println(stack.size());
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
