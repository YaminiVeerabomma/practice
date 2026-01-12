package LinkedList;



public class RemoveDuplictValue {

 // Function to delete all duplicate nodes
 public static ListNode deleteDuplicates(ListNode head) {

     // Dummy node to handle edge cases
     ListNode dummy = new ListNode(0);//create empty dummy node
     dummy.next = head;

     ListNode prev = dummy;

     while (head != null) {

         // If duplicate found
         if (head.next != null && head.val == head.next.val) {

             // Skip all nodes with same value
             while (head.next != null && head.val == head.next.val) {
                 head = head.next;
             }

             // Remove duplicates
             prev.next = head.next;
         } else {
             // Move prev if no duplicate
             prev = prev.next;
         }

         head = head.next;
     }

     return dummy.next;
 }

 // Function to print linked list
 public static void printList(ListNode head) {
     ListNode temp = head;
     while (temp != null) {
         System.out.print(temp.val + " -> ");
         temp = temp.next;
     }
     System.out.println("null");
 }

 // Main method
 public static void main(String[] args) {

     // Creating linked list
     // 1 → 2 → 3 → 3 → 4 → 4 → 5
     ListNode head = new ListNode(1);
     head.next = new ListNode(2);
     head.next.next = new ListNode(3);
     head.next.next.next = new ListNode(3);
     head.next.next.next.next = new ListNode(4);
     head.next.next.next.next.next = new ListNode(4);
     head.next.next.next.next.next.next = new ListNode(5);

     System.out.println("Original List:");
     printList(head);

     head = deleteDuplicates(head);

     System.out.println("After Removing Duplicates:");
     printList(head);
 }
}
