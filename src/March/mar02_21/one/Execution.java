/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 02-Mar-21
 *   Time: 7:51 PM
 *   File: Execution.java
 */

package March.mar02_21.one;

public class Execution {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        //ll.insertAtBegin(new Node(5));
        //ll.insertAtBegin(new Node(4));
        ll.insertAtEnd(new Node(6));
        ll.insertAtBegin(new Node(2));
        ll.print();
        ll.deleteAtBegin();
        ll.print();
    }
}

