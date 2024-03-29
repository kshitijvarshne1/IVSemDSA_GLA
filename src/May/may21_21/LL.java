/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-May-21
 *   Time: 7:48 PM
 *   File: LL.java
 */

package May.may21_21;

public class LL {
    public Node head;

    public LL() {
        this.head = null;
    }

    public void insertAtEnd(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(data);
        }
    }

    public void print() {
        if (head != null) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + " -> ");
                tmp = tmp.next;
            }
            System.out.println();
        }
    }

    public void insertAtMiddle(int data) {
        if (head == null) {
            head = new Node(data);
        } else if (head.next == null) {
            head.next = new Node(data);
        } else {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count += 1;
                temp = temp.next;
            }
            int middle = count / 2;
            int i = 1;
            temp = head;
            while (i < middle) {
                temp = temp.next;
                i += 1;
            }
            Node newNode = new Node(data);
            newNode.next = temp.next;
            temp.next = newNode;
            // tortoise method  or slow and fast pointer
        }
    }

    public boolean search(int data) {
        if (head != null) {
            Node tmp = head;
            while (tmp != null) {
                if (tmp.data == data) {
                    return true;
                }
                tmp = tmp.next;
            }
        }
        return false;
    }

    public void deleteAtBegin() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteAtEnd() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public Node FindMiddle() {
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void deleteAtMiddle() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }
        Node slow = head;
        Node fast = head.next;
        Node temp = null;
        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = slow.next;
    }
    public void insertAtNPosition(Node newNode, int n) {
        if (head == null) {
            head = newNode;
        } else if (n == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            while (n-- > 2 && temp != null) {
                temp = temp.next;
            }
            if (temp != null) {
                newNode.next = temp.next;
                temp.next = newNode;
            } else {
                System.out.println("limit out of range");
            }
        }
    }
}

