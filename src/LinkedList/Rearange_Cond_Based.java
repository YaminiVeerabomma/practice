package LinkedList;

public class Rearange_Cond_Based {
	
	public static ListNode partition(ListNode head, int x) {

        // Dummy nodes for two lists
        ListNode lessHead = new ListNode(0);
        ListNode greaterHead = new ListNode(0);

        ListNode less = lessHead;
        ListNode greater = greaterHead;
        while (head != null) {

            if (head.val < x) {
                less.next = head;
                less = less.next;
            } else {
                greater.next = head;
                greater = greater.next;
            }

            head = head.next;
        }
        greater.next = null;

        // Connect both lists
        less.next = greaterHead.next;

        return lessHead.next;
	}

	public static void PrintList(ListNode head) {
		ListNode temp=head;
		if(temp!=null) {
			System.out.print(temp.val+ " -> ");
			temp=temp.next;
		}
		 System.out.println("null");
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(2);
		head.next.next.next=new ListNode(2);
		head.next.next.next.next=new ListNode(2);
		int x=3;
		PrintList(head);
		
		
	}

}
