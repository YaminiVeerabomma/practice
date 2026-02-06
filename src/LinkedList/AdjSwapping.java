package LinkedList;

class ListNode {
    
	int val;
    ListNode next;
	

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class AdjSwapping {

    public static void swapPairs(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {

            // swap values
            int temp = current.val;
            current.val = current.next.val;
            current.next.val = temp;

            // move to next pair
            current = current.next.next;
        }
    }

    // print list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        swapPairs(head);
        printList(head);
    }
}
