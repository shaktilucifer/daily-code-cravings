class DoublyLinkedList{
	private Node head;
	private int size;

	DoublyLinkedList(){
		this.head = new Node();
		this.size = 0;
	}

	public DoublyLinkedList append(Object data){
			Node node = new Node(data);
			Node temp = head;
			if(temp.getNext() == null){
				temp.setNext(node);
				node.setPrev(temp);
				size++;
				return this;
			}
			while(temp.getNext() != null){
				temp = temp.getNext();
			}
			temp.setNext(node);
			node.setPrev(temp);
			size++;
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

	public int size(){
		return size;
	}

	public void printList(){
		Node temp = head;
		while(temp.getNext() != null){
			temp = temp.getNext();
			temp.printNode();
		}
	}
}

class Node{
	private Object data;
	private Node next;
	private Node prev;

	Node(){
		this.data = null;
	}

	Node(Object data){
		this.data = data;
	}

	public void setNext(Node node){
		this.next = node;
	}

	public Node getNext(){
		return this.next;
	}

	public void setPrev(Node node){
		this.prev = node;
	}

	public Node getPrev(){
		return this.prev;
	}

	public Object getData(){
		return this.data;
	}

	public void setData(Object data){
		this.data = data;
	}

	public void printNode(){
		System.out.println(getData());
	}
}

class Test{

	public static void main(String[] args){


	}
}
