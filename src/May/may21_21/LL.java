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
                System.out.print(tmp.data + " ->");
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
        }
    }
}

