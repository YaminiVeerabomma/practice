package LinkedList;



public class RemoveKthElm {

    public static ListNode removeKthFromStart(ListNode head, int k) {

        if (k == 1) {
            return head.next;
        }

        ListNode current = head;

      
        for (int i = 1; i < k - 1 ; i++) {
            current = current.next;
        }

     
        if (current != null && current.next != null) {
            current.next = current.next.next;
        }

        return head;
    }

    public static void main(String[] args) {

        // Create list: 10 → 20 → 30 → 40 → 50
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        int k = 3;

        head = removeKthFromStart(head, k);

        // Print result
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " → ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
