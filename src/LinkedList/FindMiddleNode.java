package LinkedList;



public class FindMiddleNode {

    
    int length(ListNode head) {
        int count = 0;
        ListNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

 
    int middlePosition(int length) {
        return (length / 2) + 1;
    }

    int middleValue(ListNode head, int pos) {
        ListNode temp = head;

        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    public static void main(String[] args) {

        // List: 1 → 2 → 3 → 4 → 5 → 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        FindMiddleNode list = new FindMiddleNode();

        int len = list.length(head);
        int pos = list.middlePosition(len);
        int value = list.middleValue(head, pos);

        System.out.println("Length of Linked List: " + len);
        System.out.println("Mdle Pos: " + pos);
        System.out.println("Mdle Value: " + value);
    }
}
