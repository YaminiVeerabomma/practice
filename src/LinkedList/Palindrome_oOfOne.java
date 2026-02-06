package LinkedList;

public class Palindrome_oOfOne {

	

	    static boolean isPalindrome(ListNode head) {
	        if (head == null || head.next == null) return true;

	        // Step 1: Find middle
	        ListNode slow = head;
	        ListNode fast = head;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        // Step 2: Reverse second half
	        ListNode secondHalf = reverse(slow);
	        ListNode firstHalf = head;

	        // Step 3: Compare both halves
	        while (secondHalf != null) {
	            if (firstHalf.val != secondHalf.val) {
	                return false;
	            }
	            firstHalf = firstHalf.next;
	            secondHalf = secondHalf.next;
	        }

	        return true;
	    }

	    // Reverse linked list
	    static ListNode reverse(ListNode head) {
	        ListNode prev = null;
	        ListNode curr = head;

	        while (curr != null) {
	            ListNode next = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = next;
	        }
	        return prev;
	    }

	    public static void main(String[] args) {
	        ListNode head = new ListNode(1);
	        head.next = new ListNode(2);
	        head.next.next = new ListNode(3);
	        head.next.next.next = new ListNode(2);
	        head.next.next.next.next = new ListNode(1);

	        System.out.println(isPalindrome(head)); // true
	    }
	}
//space complexty O(1)
