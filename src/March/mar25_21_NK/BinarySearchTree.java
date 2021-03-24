/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Mar-21
 *   Time: 12:35 AM
 *   File: BinarySearchTree.java
 */

package March.mar25_21_NK;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        this.root = root;
    }

    public void insert(Node newNode) {
        this.root = insert(this.root, newNode);
    }

    private Node insert(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
            return root;
        }
        if (newNode.data <= root.data) {
            root.left = insert(root.left, newNode);
        } else {
            root.right = insert(root.right, newNode);
        }
        return root;
    }


}

