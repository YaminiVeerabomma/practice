package LinkedList;

public class AddNewNodeAtIndex {
	public static void InsertNewNode(Node head,int target,String newData) {
		Node newNode=new Node(newData);
		Node temp=head;
		for(int i=0;i<target-1;i++) {
			temp=temp.next;
			
		}
		Node nextNode=temp.next;
		temp.next=newNode;
		newNode.next=nextNode;
		
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
		int target=2;
		String newData="X";
		printLinkedList(head);
		InsertNewNode(head,target,newData);
		printLinkedList(head);
		
	}

}
