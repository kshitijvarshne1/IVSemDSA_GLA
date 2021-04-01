/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Apr-21
 *   Time: 11:18 AM
 *   File: BinarySearchTree.java
 */

package April.api01_21_NK;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(Node newNode) {
        if (root == null) {
            root = newNode;
        } else {
            Node temp = this.root;
            Node parent;
            while (true) {
                parent = temp;
                if (newNode.data <= temp.data) {
                    temp = temp.left;
                    if (temp == null) {
                        parent.left = newNode;
                    }
                } else {
                    temp = temp.right;
                    if (temp == null) {
                        parent.right = newNode;
                    }
                }
            }
        }
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

