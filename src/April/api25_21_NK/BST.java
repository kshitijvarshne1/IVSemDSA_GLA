/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Apr-21
 *   Time: 11:41 AM
 *   File: BST.java
 */

package April.api25_21_NK;

public class BST<T extends Comparable<T>> {
    public Node<T> root;

    public BST() {
        this.root = null;
    }

    public void insert(Node<T> newNode) {
        this.root = insert(this.root, newNode);
    }

    private Node<T> insert(Node<T> root, Node<T> newNode) {
        if (root == null) {
            root = newNode;
            return root;
        }
        if (newNode.getData().compareTo(root.getData()) <= 0) {
            root.setLeft(newNode);
        } else {
            root.setRight(newNode);
        }
        return root;
    }

}

