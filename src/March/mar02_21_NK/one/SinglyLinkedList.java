/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 02-Mar-21
 *   Time: 7:40 PM
 *   File: SinglyLinkedList.java
 */

package March.mar02_21_NK.one;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insertAtEnd(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertAtBegin(Node newNode) {
        if (isEmpty()) {
            head = newNode;
        } else {
            Node temp = head;
            head = newNode;
            newNode.next = temp;
        }

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void deleteAtEnd() {
        if (!isEmpty() && head.next == null) {
            head = null;
        } else if (!isEmpty()) {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        } else {
            System.out.println("empty");
        }
    }

    public void deleteAtBegin() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("empty");
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Empty");
        }
    }

    public void sorting() {
        if (!isEmpty()) {
            Node current = head;
            Node index = null;

            while (current != null) {
                index = current.next;
                while (index != null) {
                    if (current.data > index.data) {
                        int temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        } else {
            System.out.println("Empty");
        }
    }

    public Node getMiddle() {
        if (head == null) {
            return head;
        }
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public Node sortedMerge(Node a, Node b) {
        Node result = null;
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }
}

