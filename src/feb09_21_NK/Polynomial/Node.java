/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Feb-21
 *   Time: 8:49 PM
 *   File: Node.java
 */

package feb09_21_NK.Polynomial;

public class Node {
    int coefficient;
    int exponent;
    Node next; // self reference structure

    public Node(int coe, int exp) {
        coefficient = coe;
        exponent = exp;
        next = null;
    }

    public Node() {
        coefficient = 0;
        exponent = 0;
        next = null;
    }

}
