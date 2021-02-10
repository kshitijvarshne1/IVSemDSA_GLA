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
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void insertAtEnd(Node newNode) {
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return;
    }

    public boolean serachNode(int element) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == element) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int length() {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            length += 1;
            temp = temp.next;
        }
        return length;

    }

    public void insertAtPosition(Node newNode, int position) {
        int length = length();
        Node temp = head;
        if (head == null) {
            head = newNode;
        } else if (position > length) {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        } else if (position == 0) {
            temp = head;
            head = newNode;
            newNode.next = temp;
        } else {
            int i = 0;
            while (i < position - 1) {
                temp = temp.next;
                i++;
            }
            Node add = temp.next;
            temp.next = newNode;
            newNode.next = add;
        }
        return;
    }

    //Using Runner pointer approach
    public void insertAtMiddle(Node newNode) {
        if (head == null && head.next == null) {
            return;
        }
        Node slow = head;
        Node fast;
        int length = length();
        if (length % 2 == 0) {
            fast = head.next;
        } else {
            fast = head;
        }
        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node add = slow.next;
        slow.next = newNode;
        newNode.next = add;
    }

    public void reverseLinkedList() {
        Node temp = head;
        if (head == null) {
            return;
        }
        Node prev = null;
        Node n;
        while (temp != null) {
            n = temp;
            temp = temp.next;
            n.next = prev;
            prev = n;
            head = n;
        }
        return;
    }

    public void swap() {
        Node temp = head;
        if (temp == null) {
            return;
        }
        int n;
        while (temp != null && temp.next != null) {
            n = temp.data;
            temp.data = temp.next.data;
            temp.next.data = n;
            temp = temp.next;
        }
    }
}

