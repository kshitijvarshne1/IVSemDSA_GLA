/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Feb-21
 *   Time: 11:00 AM
 *   File: Execution.java
 */

package feb08_21_NK.LinkedList;


public class Execution {
    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        SinglyLinkedList list2 = new SinglyLinkedList();
        for (int i = 20; i >= 0; i -= 4) {
            list1.insertAtBegin(new Node(i));
        }
        for (int i = 19; i >= 0; i -= 3) {
            list2.insertAtBegin(new Node(i));
        }
        //SinglyLinkedList list3 = new SinglyLinkedList();
        //list3.head = merge(list1.head, list2.head);
        //list3.printSinglyLinkedList();
        list1.printSinglyLinkedList();
        list1.reverseLinkedList();
        list1.printSinglyLinkedList();
        list1.swap();
        list1.printSinglyLinkedList();
    }

    public static Node merge(Node a, Node b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        Node c;
        if (a.data < b.data) {
            c = a;
            c.next = merge(a.next, b);
        } else {
            c = b;
            c.next = merge(a, b.next);
        }
        return c;
    }
}

