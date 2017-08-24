import java.io.*;

class PrintLinkedList{
    void Print(Node head) {
    if (head == null) {} else {
        Node temp = head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

}
    public static void main(String[] args){
       PrintLinkedList p = new PrintLinkedList();
    }

}
