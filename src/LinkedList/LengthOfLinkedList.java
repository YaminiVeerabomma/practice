package LinkedList;



public class LengthOfLinkedList {

    // function to find length
    int length(Node head) {
        int count = 0;
        Node temp = head;

        while (temp != null) {   
            count++;
            temp = temp.next;
        }
        return count;            
    }

    public static void main(String[] args) {

        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");

        node1.next = node2;
        node2.next = node3;

        Node head = node1;

        // create object and call method
        LengthOfLinkedList list = new LengthOfLinkedList();
        int result = list.length(head);

        System.out.println("Length of Linked List: " + result);
    }
}
