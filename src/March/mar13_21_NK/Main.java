/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 13-Mar-21
 *   Time: 1:50 PM
 *   File: Main.java
 */

package March.mar13_21_NK;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList l1 = new SinglyLinkedList();
        SinglyLinkedList l2 = new SinglyLinkedList();
        l1.insertAtEnd(new Node(1));
        l1.insertAtEnd(new Node(2));
        l1.insertAtEnd(new Node(3));
        l1.insertAtEnd(new Node(4));
        l1.insertAtEnd(new Node(5));
        l1.insertAtEnd(new Node(6));
        l1.insertAtEnd(new Node(33));
        l2.insertAtEnd(new Node(6));
        l2.insertAtEnd(new Node(7));
        Node m = new Node(111);
        l1.insertAtEnd(m);
        l2.insertAtEnd(m);
        l2.insertAtEnd(new Node(4));
        l2.insertAtEnd(new Node(8));
        l2.insertAtEnd(new Node(9));
        l1.print();
        l2.print();
        Node mergePoint = findMergePoint(l1.head, l2.head);
        System.out.println("Merge point :- " + mergePoint);
        System.out.println(mergePoint.data);
    }

    private static int length(Node a) {
        int c = 0;
        if (a != null) {
            Node temp = a;
            while (temp != null) {
                temp = temp.next;
                c = c + 1;
            }
        }
        return c;
    }

    private static Node findMergePoint(Node a, Node b) {
        if (a == null || b == null) {
            return null;
        }
        Node x, y;
        int k;
        if (length(a) < length(b)) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }

        k = length(y) - length(x);
        while (k > 0) {
            y = y.next;
            k = k - 1;
        }
        while (x != null && y != null) {
            if (x == y) {
                return x;
            }
            x = x.next;
            y = y.next;
        }
        return null;
    }
}

