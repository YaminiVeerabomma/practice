package LinkedList;


public class ReverseALinkedList {

    // Print linked list in reverse order (without modifying list)
    public static void printReverseOrderLL(Node head) {

        if (head == null) return;

        Node temp = head;

        // Step 1: Move temp to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Step 2: Print in reverse by finding previous node each time
        while (true) {
            System.out.print(temp.data+ " -> ");

            // Stop when head is printed
            if (temp == head) {
                break;
            }

            Node prev = head;
            while (prev.next != temp) {
                prev = prev.next;
            }
            temp = prev;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {

        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");

        node1.next = node2;
        node2.next = node3;

        Node head = node1;

        // Normal print
        System.out.println("---- Normal Order ----");
        System.out.print(head.data + " -> ");
        System.out.print(head.next.data + " -> ");
        System.out.print(head.next.next.data + " -> ");
        System.out.println("null");

        // Reverse print
        System.out.println("---- Reverse Order ----");
        printReverseOrderLL(head);
    }
}
