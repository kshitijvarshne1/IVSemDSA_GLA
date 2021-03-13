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
    }

    private static int length(Node a) {
        if (a != null) {
            return 1 + length(a.next);
        }
        return 0;
    }

    private static Node findMergePoint(Node a, Node b) {
        Node x, y;
        int k;

        if (length(a) < length(b)) {
            x = a;
            y = b;
        } else {
            x = b;
            y = a;
        }
        k = length(y) - length(a);
        while (k > 0) {
            y = y.next;
            k = k - 1;
        }
        while (a != null && b != null) {
            if (a == b) {
                return a;
            }
        }
        return null;
    }
}

