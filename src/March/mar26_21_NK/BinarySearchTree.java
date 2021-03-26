/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 26-Mar-21
 *   Time: 7:28 PM
 *   File: BinarySearchTree.java
 */

package March.mar26_21_NK;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(Node newNode) {
        insertANode(this.root, newNode);
    }

    private void insertANode(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
        } else if (newNode.data <= root.data) {
            insertANode(root.left, newNode);
        } else {
            insertANode(root.right, newNode);
        }
    }

    public void preorder() {
        preorderPrinting(this.root);
    }

    private void preorderPrinting(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderPrinting(root.left);
        preorderPrinting(root.right);
    }
}

