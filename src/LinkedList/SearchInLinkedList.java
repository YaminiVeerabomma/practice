package LinkedList;



public class SearchInLinkedList {

 
    int search(Node head, String key) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data.equals(key)) {
                return index;  
            }
            temp = temp.next;
            index++;
        }
        return -1;  
    }

    public static void main(String[] args) {

        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");

        node1.next = node2;
        node2.next = node3;

        Node head = node1;

        SearchInLinkedList list = new SearchInLinkedList();

        String key = "D";
        int result = list.search(head, key);

        if (result != -1) {
            System.out.println(key + " found at index: " + result);
        } else {
            System.out.println(key + " not found in linked list");
        }
    }
}
