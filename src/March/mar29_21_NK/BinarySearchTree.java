/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 29-Mar-21
 *   Time: 12:35 AM
 *   File: BinarySearchTree.java
 */

package March.mar29_21_NK;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(Node newNode) {
        root = insertANode(this.root, newNode);
    }

    private Node insertANode(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
            return root;
        }
        if (newNode.data <= root.data) {
            root.left = insertANode(root.left, newNode);
        } else {
            root.right = insertANode(root.right, newNode);
        }
        return root;
    }

    public void inorder() {
        inorderPrinting(this.root);
    }

    private void inorderPrinting(Node root) {
        if (root == null) {
            return;
        }
        inorderPrinting(root.left);
        System.out.print(root.data + " ");
        inorderPrinting(root.right);
    }

}

