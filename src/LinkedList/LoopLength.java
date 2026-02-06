package LinkedList;



public class LoopLength {

    public static int findLoopLength(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
               
                int count = 1;
                ListNode temp = slow.next;

                while (temp != slow) {
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }
        return 0; 
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        head.next.next.next.next.next = head.next.next;

        System.out.println(findLoopLength(head)); 
    }
}