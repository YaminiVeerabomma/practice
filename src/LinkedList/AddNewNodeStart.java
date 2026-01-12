package LinkedList;

public class AddNewNodeStart {
	public static void printLinkedList(Node head) {
		
		  Node temp = head;
		   while (temp != null) {
		       System.out.print(temp.data + " -> ");
		       temp = temp.next;
		   }
		   System.out.print("null");
		   System.out.println();
		}
	
	public static Node AddNodeToStart(Node  head,String s) {
		Node newNode=new Node(s);
	newNode.next=head;
	return newNode;
	
		
		
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
		String s="Z";
		
		printLinkedList(head);
		
	
		head=AddNodeToStart(head,s);
		printLinkedList(head);

	}

}
