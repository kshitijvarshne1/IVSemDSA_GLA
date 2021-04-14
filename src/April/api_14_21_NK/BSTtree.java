/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 14-Apr-21
 *   Time: 7:59 PM
 *   File: BSTtree.java
 */

package April.api_14_21_NK;

public class BSTtree<E extends Comparable<E>> {
    public Node<E> root;

    public BSTtree() {
        this.root = null;
    }

    public void insert(Node<E> newNode) {
        if (root == null) {
            root = newNode;
        } else {
            Node<E> current = this.root;
            Node<E> parent;
            while (current != null) {
                parent = current;
                if (newNode.getData().compareTo(current.getData()) <= 0) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                    }
                }
            }
        }
    }

    public void inorder() {
        inorder(this.root);
        System.out.println();
    }

    private void inorder(Node<E> root) {
        if (root == null) {
            return;
        }
        inorder(root.getLeft());
        System.out.print(root.getData() + " ");
        inorder(root.getRight());
    }
}

