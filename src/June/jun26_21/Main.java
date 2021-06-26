/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 26-Jun-21
 *   Time: 1:17 PM
 *   File: Main.java
 */

package June.jun26_21;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.insertAtEnd(new Node(100));
        sl.insertAtEnd(new Node(22));
        sl.insertAtEnd(new Node(119));
        sl.insertAtEnd(new Node(33));
        sl.insertAtBeginning(new Node(21));
        sl.traverse();
        sl.getMinAndMax();
    }
}

