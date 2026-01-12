package LinkedList;

import java.util.*;

public class PalindromeOrNot {
	static Boolean isPalindrome(ListNode head) {
		List<Integer> l= new ArrayList<>();
		ListNode temp=head;
		
		while(temp!=null) {
			l.add(temp.val);
			temp=temp.next;
		}
		int start=0;
		int end=l.size()-1;
		while(start<end){
			if(l.get(start)!=l.get(end)) {
				return false;
			}
			start++;
			end--;
			
		}
		
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ListNode head = new ListNode(1);
		 head.next=new ListNode(2);
		 head.next.next=new ListNode(3);
		 head.next.next.next=new ListNode(2);
		 head.next.next.next.next=new ListNode(1);
	     System.out.println(isPalindrome(head)); // true
		 

	}

}
