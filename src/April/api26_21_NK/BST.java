/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 26-Apr-21
 *   Time: 7:34 PM
 *   File: BST.java
 */

package April.api26_21_NK;

public class BST {
    public Node root;

    public BST() {
        this.root = null;
    }

    public void insert(Node newNode) {
        this.root = insert(root, newNode);
    }

    private Node insert(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
            return root;
        } else if (newNode.data <= root.data) {
            root.left = insert(root.left, newNode);
        } else {
            root.right = insert(root.right, newNode);
        }
        return root;
    }

    public void inorder() {
        inorder(this.root);
    }

    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        System.out.println();
    }
}

