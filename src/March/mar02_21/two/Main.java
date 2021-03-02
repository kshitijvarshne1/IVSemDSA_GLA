/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 02-Mar-21
 *   Time: 8:14 PM
 *   File: Main.java
 */

package March.mar02_21.two;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList ll = new DoublyLinkedList();
        ll.insertAtEnd(new Node(2));
        ll.insertAtEnd(new Node(4));
        ll.insertAtBegin(new Node(9));
        ll.deleteAtBegin();
        ll.insertAtBegin(new Node(10));
        ll.print();
    }
}

