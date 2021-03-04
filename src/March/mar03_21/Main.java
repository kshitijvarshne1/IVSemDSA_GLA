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
        ll.print();
        ll.deleteAtBegin();

        ll.print();

    }
}

