package LinkedList;
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Rotate_K_rightTym {

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        for (int i = 0; i < k; i++) {
            ListNode prev = null;
            ListNode curr = head;

            
            while (curr.next != null) {
                prev = curr;
                curr = curr.next;
            }

           
            prev.next = null;
            curr.next = head;
            head = curr;
        }

        return head;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = rotateRight(head, 2);
        printList(head);
    }
}