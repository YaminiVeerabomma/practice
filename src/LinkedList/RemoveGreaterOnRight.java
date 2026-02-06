package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveGreaterOnRight {


    static ListNode removeNodesWithGreaterValueOnRight(ListNode head) {

        // Dummy node to handle head deletion
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            boolean shouldDelete = false;

            // Check all nodes on right side
            ListNode temp = curr.next;
            while (temp != null) {
                if (temp.val > curr.val) {
                    shouldDelete = true;
                    break;
                }
                temp = temp.next;
            }

            // Delete current node if needed
            if (shouldDelete) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }

            curr = curr.next;
        }

        return dummy.next;
    }


    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(12);
        head.next = new ListNode(15);
        head.next.next = new ListNode(10);
        head.next.next.next = new ListNode(11);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(3);

        System.out.println("Original List:");
        printList(head);

        head = removeNodesWithGreaterValueOnRight(head);

        System.out.println("After Removing Nodes:");
        printList(head);
    }
}
