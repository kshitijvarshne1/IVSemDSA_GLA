/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Apr-21
 *   Time: 11:34 AM
 *   File: BST.java
 */

package April.api04_21_NK;

public class BST<T extends Comparable<T>> {
    public Node<T> root;

    public BST() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(Node<T> newNode) {
        if (root == null) {
            root = newNode;
        } else {
            Node<T> current = root;
            Node<T> parent;
            while (true) {
                parent = current;
                if (current.data.compareTo(newNode.data) > 0) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }


    public void inorder() {
        inorderPrinting(this.root);
        System.out.println();
    }

    private void inorderPrinting(Node<T> root) {
        if (root == null) {
            return;
        } else {
            inorderPrinting(root.left);
            System.out.print(root.data + " ");
            inorderPrinting(root.right);
        }
    }

}

