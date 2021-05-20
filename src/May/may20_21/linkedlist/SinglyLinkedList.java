/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-May-21
 *   Time: 6:29 PM
 *   File: SinglyLinkedList.java
 */

package May.may20_21.linkedlist;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insertAtEnd(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            //copy
            Node temp = head;
            // loop and check
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void print() {
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void insertATBegin(Node newNode) {
        newNode.next = head;
        head = newNode;
    }

}

