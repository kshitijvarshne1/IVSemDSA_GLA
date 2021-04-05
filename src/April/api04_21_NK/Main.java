/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Apr-21
 *   Time: 11:50 AM
 *   File: Main.java
 */

package April.api04_21_NK;

public class Main {
    public static void main(String[] args) {
        BST<Integer> btree = new BST<>();
        btree.insert(new Node<>(100));
        btree.insert(new Node<>(95));
        btree.insert(new Node<>(93));
        btree.insert(new Node<>(99));
        btree.insert(new Node<>(105));
        btree.insert(new Node<>(102));
        btree.insert(new Node<>(107));
        btree.inorder();
        btree.printPreInPostUsingIterative();
        btree.levelOrderTraverse();
    }
}

