class DoublyLinkedList{
	private Node head;
	private int size;
	

}

class Node{
	private Object data;
	private Node next;
	private Node prev;

	public void setNext(Node node){
		this.next = node;
	}

	public Node getNext(Node node){
		return this.next;
	}

	public Object getData(){
		return this.data;
	}

	public void setData(Object data){
		this.data = data;
	}

	public printNode(Node node){
		System.out.println(node.getData());
	}
}

class Test{

	public static void main(String[] args){


	}
}
