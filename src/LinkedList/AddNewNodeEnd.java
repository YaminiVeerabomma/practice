package LinkedList;

public class AddNewNodeEnd {
	public static void AddNodeToEnd(Node head,String e) {
		Node newNode=new Node(e);
		
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		
	}
	public static void printLinkedList(Node head) {
	
	  Node temp = head;
	   while (temp != null) {
	       System.out.print(temp.data + " -> ");
	       temp = temp.next;
	   }
	   System.out.print("null");
	   System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1=new Node("A");
		Node node2=new Node("B");
		Node node3=new Node("C");
		Node node4=new Node("D");
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		Node head=node1;
		String e="E";
		printLinkedList(head);
		AddNodeToEnd(head,e);
		printLinkedList(head);
		

	}

}
