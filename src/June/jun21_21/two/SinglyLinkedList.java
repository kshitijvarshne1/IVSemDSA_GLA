/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-Jun-21
 *   Time: 9:20 AM
 *   File: SInglyLinkedList.java
 */

package June.jun21_21.two;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void insertAtEnd(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node tmp = this.head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
    }

    public void insertAtBeginning(Node newNode) {
        newNode.setNext(head);
        head = newNode;
    }

    public void traverse() {
        if (head != null) {
            Node tmp = this.head;
            while (tmp != null) {
                System.out.print(tmp.getData() + " -> ");
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }

    public void deleteAtLast() {
        if (head == null || head.getNext() == null) {
            head = null;
        } else {
            Node tmp = this.head;
            while (tmp.getNext().getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(null);
        }

    }

    public void deleteAtBeginning() {
        if (head != null) {
            head = head.getNext();
        }
    }
}

