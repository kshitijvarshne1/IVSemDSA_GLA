/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Mar-21
 *   Time: 12:19 AM
 *   File: BinarySearchTree.java
 */

package March.mar23_21_NK;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        this.root = root;
    }

    public void insert(Node newNode) {
        insert(this.root, newNode);
    }

    private void insert(Node node, Node newNode) {
        if (node == null) {
            node = newNode;
        }
        if (newNode.data <= node.data) {
            insert(node.left, newNode);
        }
        insert(node.right, newNode);
    }

    public void preorder() {
        preorder(this.root);
    }

    private void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
}

