/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-Jun-21
 *   Time: 10:20 AM
 *   File: DMain.java
 */

package June.jun21_21.two;

public class DMain {
    public static void main(String[] args) {
        DoublyLinkedList dl = new DoublyLinkedList();
        dl.insertAtEnd(new DNode(33));
        dl.traverse();
        dl.insertAtEnd(new DNode(44));
        dl.traverse();
        dl.insertAtEnd(new DNode(55));
        dl.traverse();
        dl.insertAtHead(new DNode(22));
        dl.traverse();
        dl.deleteAtBegin();
        dl.traverse();
        dl.deleteAtEnd();
        dl.traverse();
    }
}

