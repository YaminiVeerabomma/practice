package LinkedList;

import java.util.*;

public class Merge_two_list_in_sort {
    static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;

        ListNode temp = l1;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = l2;  
        return l1;
    }
    static ListNode sortList(ListNode head) {
        List<Integer> list = new ArrayList<>();

        // 1️⃣ Copy data from linked list to array
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        // 2️⃣ Sort the array
        Collections.sort(list);

        // 3️⃣ Put sorted data back into linked list
        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = list.get(i++);
            temp = temp.next;
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
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(3);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(5);
        ListNode merged = merge(l1, l2);
        merged = sortList(merged);

        printList(merged);

	}
	

}
