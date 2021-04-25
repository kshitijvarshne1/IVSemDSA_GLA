/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Apr-21
 *   Time: 12:03 PM
 *   File: Main.java
 */

package April.api25_21_NK;

public class Main {
    public static void main(String[] args) {
        BST<Integer> bsttree = new BST<>();
        bsttree.insert(new Node<>(100));
        bsttree.bsf();
        bsttree.insert(new Node<>(95));
        bsttree.insert(new Node<>(105));
        bsttree.bsf();
        System.out.println(bsttree.search(new Node<>(105)));
    }
}

