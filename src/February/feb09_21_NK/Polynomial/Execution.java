/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Feb-21
 *   Time: 8:56 PM
 *   File: Execution.java
 */

package February.feb09_21_NK.Polynomial;

public class Execution {
    public static void main(String[] args) {
        PLL p1 = new PLL();
        PLL p2 = new PLL();
        int c = 3;
        for (int i = 1; i < 4; i++) {
            p1.insert(new Node(i, c));
            p2.insert(new Node(i + 1, c));
            c -= 1;
        }
        p1.print();
        p2.print();
        PLL p3 = new PLL();
        addTwoPolynomial(p1.head, p2.head, p3);
        p3.print();
    }

    public static void addTwoPolynomial(Node p1, Node p2, PLL result) {
        Node a = p1;
        Node b = p2;
        int c = 0;
        while (p1 != null && p2 != null) {
            if (p1.exponent > p2.exponent) {
                result.insert(new Node(p1.coefficient, p1.exponent));
                p1 = p1.next;
                c += 1;
            } else if (p1.exponent < p2.exponent) {
                result.insert(new Node(p2.coefficient, p2.exponent));
                p2 = p2.next;
                c += 1;
            } else {
                result.insert(new Node(p1.coefficient + p2.coefficient, p1.exponent));
                p1 = p1.next;
                p2 = p2.next;
                c += 1;
            }
        }
        while (p1 != null) {
            result.insert(new Node(p1.coefficient, p1.exponent));
            p1 = p1.next;
        }
        while (p2 != null) {
            result.insert(new Node(p2.coefficient, p2.exponent));
            p2 = p2.next;
        }
    }
}

