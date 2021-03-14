/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 14-Mar-21
 *   Time: 3:07 PM
 *   File: Main.java
 */

package March.mar14_21_NK;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertAtEnd(new Node(1));
        ll.insertAtEnd(new Node(2));
        Node n1 = new Node(3);
        ll.insertAtEnd(n1);
        ll.insertAtEnd(new Node(4));
        ll.insertAtEnd(new Node(5));
        ll.insertAtEnd(new Node(6));
        Node n2 = new Node(4);
        n2.setNext(n1);
        ll.insertAtEnd(n2);
        System.out.println(findLoopPoint(ll.head).getData());

    }

    private static Node findLoopPoint(Node a) {
        if (a != null) {
            Node slow = a;
            Node fast = a;
            while (fast.getNext() != null && fast.getNext() != null) {
                slow = slow.getNext();
                fast = fast.getNext().getNext();
                if (slow == fast) {
                    System.out.println(slow.getData() + " " + fast.getData());
                    return slow;
                }
            }
        }
        return null;
    }

}

