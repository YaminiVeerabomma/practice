package LinkedList;

public class OddEvenPostRearrange {
	public static ListNode rearrange (ListNode head) {
		if((head==null) && (head.next==null)){
			return head;
		}
		ListNode odd=head;
		ListNode even=head.next;
		ListNode evenHead=even;
		

	        while (even != null && even.next != null) {
	            odd.next = even.next;
	            odd = odd.next;

	            even.next = odd.next;
	            even = even.next;
	        }

	        odd.next = evenHead;
	        return head;
	    }
		
		
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);	
		head.next.next.next.next=new ListNode(5);
		 head = rearrange(head);

	        // Print result
	        ListNode temp = head;
	        while (temp != null) {
	            System.out.print(temp.val + "-> ");
	            
	            temp = temp.next;
	        }
	        System.out.print("null");
		
				

	}

}
