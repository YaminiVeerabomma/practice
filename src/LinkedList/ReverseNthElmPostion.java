package LinkedList;


public class ReverseNthElmPostion {

    static  ListNode reverseKGroup( ListNode head, int k) {

    	 ListNode curr = head;
    	 ListNode prev = null;
    	 ListNode next = null;
        int count = 0;

        // STEP 1: Reverse first K nodes
        while (curr != null && count < k) {
            next = curr.next;   // save next node
            curr.next = prev;   // reverse link
            prev = curr;        // move prev forward
            curr = next;        // move curr forward
            count++;
        }

        // STEP 2: Recursively reverse remaining list
        if (next != null) {
            head.next = reverseKGroup(next, k);
        }

        // STEP 3: Return new head of this group
        return prev;
    }

    static void printList( ListNode head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

    	 ListNode head = new  ListNode(1);
        head.next = new  ListNode(2);
        head.next.next = new  ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new  ListNode(5);

        int k = 2;

        head = reverseKGroup(head, k);
        printList(head);
    }
}
