package LinkedList;

public class UpdateData {
	public static void UpdateNewData(Node head,String newValue,int index) {
		
		Node temp=head;
		for(int i=1;i<index;i++) {
			temp=temp.next;
		}
		temp.data=newValue;
		
	}
	
	
	
	public static void printList(Node head) {
		Node temp=head;
		while(temp!=null) {
		       System.out.print(temp.data + " -> ");

			temp=temp.next;
		}
	       System.out.print("null");
	       System.out.println();


		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub`
		Node node1=new Node("A");
		Node node2=new Node("B");
		Node node3=new Node("C");
		Node node4=new Node("E");
		Node node5=new Node("F");
		Node head=node1;
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		String newValue="X";
		int index=4;
		printList(head);
		UpdateNewData(head,newValue,index);
		printList(head);
		
		

	}

}
