class DoublyLinkedList{
	private Node head;
	private int size;

	public DoublyLinkedList append(){
			return this;
	}

	public boolean isEmpty(){
		return size == 0;
	}

	public Object value_at(int index){
		return null;
	}

	public void push_front(Object data){

	}

	public Object front(){
		return null;	
	}

	public Object back(){
		return null;
	}

	public void insert(int index, Object value){

	}

	public void erase(int index){

	}

	public DoublyLinkedList reverse(){
		return null;
	}

	public void removeValue(Object value){

	}

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

	public void printNode(Node node){
		System.out.println(node.getData());
	}
}

class Test{

	public static void main(String[] args){


	}
}
