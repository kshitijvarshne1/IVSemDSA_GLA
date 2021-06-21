/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-Jun-21
 *   Time: 9:42 AM
 *   File: Main.java
 */

package June.jun21_21.two;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.insertAtEnd(new Node(2));
        sl.insertAtEnd(new Node(3));
        sl.traverse();
        sl.insertAtBeginning(new Node(1));
        sl.traverse();
    }
}

