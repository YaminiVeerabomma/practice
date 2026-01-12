package LinkedList;
//Node class
class Node {
String data;

Node next;

Node(String data) {
   this.data = data;
   this.next = null;
}


}

public class PrintLinkedList {

public static void printLinkedList(Node head) {
//	System.out.println("------while loop------");
//  Node temp = head;
//   while (temp != null) {
//       System.out.print(temp.data + " -> ");
//       temp = temp.next;
//   }
//   System.out.print("null");
   System.out.println("------temp variable ------");
   Node temp = head;
   System.out.print(temp.data + "->");
   temp = temp.next;
   System.out.print(temp.data + "->");
   temp = temp.next;
   System.out.print(temp.data + "->");
   System.out.print("null");
   System.out.println();
   
   
   
}

public static void main(String[] args) {
   Node node1 = new Node("A");
   Node node2 = new Node("B");
   Node node3 = new Node("C");

   node1.next = node2;
   node2.next = node3;

   Node head = node1;



   System.out.println("------Direct access------");
   System.out.print(head.data +"->");
   System.out.print(head.next.data +"->");
   System.out.print(head.next.next.data +"->");
   System.out.print("null");
   System.out.println();
   printLinkedList(head);
}
}

