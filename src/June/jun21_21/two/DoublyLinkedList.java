/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-Jun-21
 *   Time: 10:05 AM
 *   File: DoublyLinkedList.java
 */

package June.jun21_21.two;

public class DoublyLinkedList {
    public DNode head;
    public DNode tail;

    public DoublyLinkedList() {
        head = tail = null;
    }

    public void insertAtHead(DNode newNode) {
        if (head == null) {
            head = tail = newNode;
        } else {
            head.setPrev(newNode);
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void insertAtEnd(DNode newNode) {
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void traverse() {
        if (head != null) {
            DNode tmp = this.head;

            while (tmp != null) {
                System.out.print(tmp.getData() + " <- ->");
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            return;
        } else if (head.getNext() == null) {
            head = tail = null;
        } else {
            tail = tail.getPrev();
            tail.getNext().setPrev(null);
            tail.setNext(null);
        }
    }

    public void deleteAtBegin() {
        if (head == null) {
            return;
        } else if (head.getNext() == null) {
            head = tail = null;
        } else {
            /*Node temp = head.next;
            head.next.prev = null;
            head.next = null;
            head = temp;*/
            head = head.getNext();
            head.setPrev(null);
        }
    }

    public void changeFirstLast() {
        if (head != null) {
            DNode tHead = head;
            DNode tTail = tail;

            while (tHead != tTail) {
                int k = tHead.getData();
                tHead.setData(tTail.getData());
                tTail.setData(k);
                tHead = tHead.getNext();
                tTail = tTail.getPrev();
            }
        } else {
            System.out.println("Empty");
        }
    }
}

