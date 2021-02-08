/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Feb-21
 *   Time: 10:57 AM
 *   File: SinglyLinkedList.java
 */

package feb08_21_NK.LinkedList;

public class SinglyLinkedList {
    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void insertAtBegin(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

    public void printSinglyLinkedList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("No data member");
        } else {
            while (temp.next != null) {
                System.out.println(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }

}

