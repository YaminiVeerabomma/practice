package LinkedList;




class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveNthNodeFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        // 1️⃣ Find length of list
        int length = 0;
        ListNode temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }
        System.out.println(length);
        // 2️⃣ If first node needs to be deleted
        if (n == length) {
            return head.next;
        }

        // 3️⃣ Go to node before the one to delete
        int deletePos = length - n;
        temp = head;

        for (int i = 1; i < deletePos; i++) {
            temp = temp.next;
        }

        // 4️⃣ Delete node
        temp.next = temp.next.next;

        return head;
    }

    // Print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " → ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // List: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        head = removeNthFromEnd(head, n);
        printList(head);
    }
}

