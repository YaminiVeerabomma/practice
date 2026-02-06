package LinkedList;

import java.util.ArrayList;



public class RemoveLastOccurrence {

    static ListNode removeLast(ListNode head, int value) {
        if (head == null) return null;

        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;

        // store nodes
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        // find last occurrence
        int index = -1;
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).val == value) {
                index = i;
                break;
            }
        }

        // value not found
        if (index == -1) return head;

        // remove node
        if (index == 0) {
            head = head.next;
        } else {
            list.get(index - 1).next = list.get(index).next;
        }

        return head;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(4);

        head = removeLast(head, 2);
        printList(head);
        
    }
}