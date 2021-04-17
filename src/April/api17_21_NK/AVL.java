/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Apr-21
 *   Time: 12:54 PM
 *   File: AVL.java
 */

package April.api17_21_NK;

//A -> Adelson
//V -> Velsky
//L -> Landis

public class AVL {
    public Node root;

    public AVL() {
        this.root = null;
    }

    public int height(Node node) {
        return node == null ? -1 : node.height;
    }

    public int max(int lhs, int rhs) {
        return lhs > rhs ? lhs : rhs;
    }

    public void insert(Node newNode) {
        this.root = insert(this.root, newNode);
    }

    private Node insert(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
            return root;
        } else if (newNode.data < root.data) {
            root.left = insert(root.left, newNode);
            if (height(root.left) - height(root.right) == 2) {
                if (newNode.data < root.left.data) {
                    // LL problem
                    // left skewed tree
                    root = RRRotation(root);
                } else {
                    // LR problem
                }
            }
        } else if (newNode.data > root.data) {
            root.right = insert(root.right, newNode);
            if (height(root.left) - height(root.right) == -2) {
                if (newNode.data > root.right.data) {
                    // RR problem
                    // right skewed tree
                } else {
                    // RL problem
                }
            }
        }
        root.height = 1 + max(height(root.left), height(root.right));
        return root;
    }

    private Node RRRotation(Node root) {
        Node newNode = root.left;
        if (root.left.right != null) {
            root.left = root.left.right;
        } else {
            root.left = null;
        }
        newNode.right = root;
        root.height = 1 + max(height(root.left), height(root.right));
        newNode.height = 1 + max(height(newNode.left), height(newNode.right));
        return newNode;
    }
}

