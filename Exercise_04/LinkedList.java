
public class LinkedList {
	private int size;
	  private Node head;

	public LinkedList() {
		this.size = 0;
		this.head = null;
	}
	
	//Inserting
	
	public void insertNode(String item) {
		Node node = new Node();
		node.item = item;
		Node current = this.head;

		if (this.head == null) {
			this.head = node;
			this.head.next = null;
			this.size = 1;
			System.out.println(this.head.toString());
		} else {

			while (current.next != null) {
				current = current.next;
			}
			current.next = node;
			node.next = null;
			this.size += 1;
		}
	}
	
	//Adding at First location
	
	public void insertFirst(String item){
		Node node = new Node();
		node.item = item;
		node.next = this.head;
		this.head = node;
		this.size++;
	}
	//Add at last
	public void insertLast(String item) {
		Node node =new Node();
		node.item=item;
		node.next = this.head;
		Node current = this.head;
		if(this.head==null) {
			this.head=node;
			this.size++;
		}
		else {
			for(int i =1;i<this.size-1;i++) {
				current=current.next;	
			}
			node.next=current.next;
			current.next=node;
		}
	}
	
	//Adding at nth position
	
	public void insertNth(String item, int position) {
		Node node = new Node();
		node.item = item;
		Node current = this.head;
		if (this.head != null && position <= this.size) {
			for (int i = 1; i < position; i++) {
				current = current.next;
			}
			node.next = current.next;
			current.next = node;
			this.size += 1;
		}
		else{
			System.out.println("Exceeded the linked list size. Current Size: "+size+" please enter between 0 and "  +size);
		}
	}
	
	//Deleting first node 
	
	public void deleteFirstNode() {
		if(head != null){
			this.head = this.head.next;
			this.size--;
		}
		else{
			System.out.println("Linked list is empty");
		}
	}
	
	
	//Del Last node
	
	public void deleteLastNode() {
		Node currentNode = this.head;
		if(size == 1){
			head = null;
			size = 0;
		}
		else{
			Node prevNode = null;
			while (currentNode.next != null) {
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
			prevNode.next = null;
			this.size--;
		}
	}
	
	//Delete nth node
	
	public void deleteNthNode(int position) {
		if (position <= this.size && this.head != null) {
			Node currentNode = this.head;
			Node prevNode = null;
			for (int i = 0; i < position; i++) {
				prevNode = currentNode;
				currentNode = currentNode.next;
			}
			prevNode.next = currentNode.next;
			this.size--;
		}else{
			System.out.println("No node exist at location: "+position);
		}
	}

	
	//Print all items
	
	public void printNodes() {
		if (this.size < 1)
			System.out.println("There are no nodes in the linked list");
		else {
			Node current = this.head;
			for (int i = 0; i < this.size; i++) {
				System.out.println("Node " + current.item + " is at location " + i);
				current = current.next;
			}
		}
	}
	
	//current Size
	public int getListSize(){
		return size;
	}

}
