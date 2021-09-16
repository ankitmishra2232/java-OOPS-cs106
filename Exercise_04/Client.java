
public class Client {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		System.out.println("Current Size of the list is: "+list.getListSize());
		
		list.insertNode("12");
		list.insertNode("Ram");
		list.insertNode("lkf");
		list.insertNode("ccc");
		list.insertNode("555");
		System.out.println("\nCurrent Size of the list is: "+list.getListSize());
		
		
		System.out.println("Adding 'l1st' at start of the Node");
		list.insertFirst("l1st");
		list.printNodes();
		System.out.println("=========================================================");
		System.out.println("Adding 'nice' at last of Node");
		list.insertNth("nice", 6);
		list.printNodes();
		System.out.println("=========================================================");
		System.out.println("Adding 'pop' at last");
		list.insertLast("pop");
		list.printNodes();
		System.out.println("=========================================================");
		System.out.println("Del 1st node");
		list.deleteFirstNode();
		list.printNodes();
		System.out.println("=========================================================");
		System.out.println("del Last node");
		list.deleteLastNode();
		list.printNodes();
		System.out.println("=========================================================");
		System.out.println("del 3rd node");
		list.deleteNthNode(3);
		list.printNodes();
		System.out.println("=========================================================");
		
	}

}
