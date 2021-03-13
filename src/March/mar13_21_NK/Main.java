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
        l2.insertAtEnd(new Node(4));
        l2.insertAtEnd(new Node(8));
        l2.insertAtEnd(new Node(9));
        l1.print();
        l2.print();
        System.out.println(findMergePoint(l1.head, l2.head));


    }

    private static int length(Node a) {
        if (a == null) {
            return 0;
        }
        return 1 + length(a.next);
    }

    //Method is incomplete
    private static int findMergePoint(Node a, Node b) {
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
        System.out.println(k);
        while (k > 1) {
            y = y.next;
            k = k - 1;
        }
        while (x != null && y != null) {
            System.out.println(x.data + "  " + y.data);
            if (x.data == y.data) {
                return x.data;
            }
        }
        return -1;
    }
}

