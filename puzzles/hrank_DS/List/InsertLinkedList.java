/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
  Just a blackbox function without class for reuse
*/
Node Insert(Node head,int data) {
    Node temp = head;
    Node nodeToInsert = new Node();
    nodeToInsert.data = data;
    if(head == null){
        head = nodeToInsert;
        return head;
    }
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = nodeToInsert;
    return head;
  
}
