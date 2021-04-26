/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 26-Apr-21
 *   Time: 7:58 PM
 *   File: Main.java
 */

package April.api26_21_NK;

public class Main {
    public static void main(String[] args) {
        BST bsttree = new BST();
        bsttree.insert(new Node(100));
        bsttree.insert(new Node(95));
        bsttree.insert(new Node(105));
        bsttree.insert(new Node(85));
        bsttree.insert(new Node(97));
        bsttree.inorder();
        bsttree.preorder();
    }
}

