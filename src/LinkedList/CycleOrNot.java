package LinkedList;
public class CycleOrNot {

    public static boolean hasCycle(ListNode head) {
    	ListNode slow = head;
    	ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true; // cycle detected
            }
        }
        return false; // no cycle
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        // create cycle: 5 → 3
        node5.next = node3;

        System.out.println(hasCycle(node1)); // true
    }
}
