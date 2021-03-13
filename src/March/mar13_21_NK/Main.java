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

}

