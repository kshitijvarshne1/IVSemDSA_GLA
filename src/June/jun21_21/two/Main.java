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
        sl.insertAtEnd(new Node('a'));
        sl.insertAtEnd(new Node('v'));
        sl.insertAtBeginning(new Node('c'));
        sl.insertAtEnd(new Node('d'));
        sl.insertAtEnd(new Node('c'));
        sl.insertAtEnd(new Node('a'));
        sl.insertAtEnd(new Node('d'));
        sl.traverse();
        sl.deleteFirstOccurence(new Node('a'));
        sl.traverse();
        sl.deleteLastOccurence(new Node('c'));
        sl.traverse();

    }
}

