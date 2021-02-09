/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Feb-21
 *   Time: 8:53 PM
 *   File: PLL.java
 */

package feb09_21_NK.Polynomial;

public class PLL {
    Node head;

    public PLL() {
        head = null;
    }

    public void insert(Node newNode) {
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
}

