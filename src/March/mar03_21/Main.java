/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Mar-21
 *   Time: 12:35 AM
 *   File: Main.java
 */

package March.mar03_21;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList ll = new CircularLinkedList();
        ll.insertAtEnd(new Node(5));
        ll.insertAtEnd(new Node(6));
        ll.insertAtEnd(new Node(66));
        ll.insertAtBegin(new Node(3));
        ll.insertAtBegin(new Node(9));
        ll.print();
        ll.deleteAtEnd();
        ll.print();

    }
}

