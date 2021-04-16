/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 12-Apr-21
 *   Time: 9:50 PM
 *   File: AVL.java
 */

package April.api_12_21_NK;

public class AVL {
    public Node root;

    public AVL() {
        this.root = null;
    }

    public int max(int lhs, int rhs) {
        return lhs > rhs ? lhs : rhs;
    }

    public int height(Node node) {
        return node == null ? -1 : node.height;
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
                    // left skewed tree
                    // Problem :- LL
                    root = rightRightRotation(root);
                } else {
                    //LR problem
                    root = doubleRotationWithleftChild(root);
                }
            }
        } else if (newNode.data > root.data) {
            root.right = insert(root.right, newNode);
            if (height(root.left) - height(root.right) == -2) {
                if (newNode.data > root.right.data) {
                    // right skewed tree
                    //Problem :- RR
                    root = leftLeftRotation(root);
                } else {
                    //RL Problem
                    root = doubleRotationWithRightChild(root);
                }
            }
        }
        root.height = max(height(root.left), height(root.right)) + 1;
        return root;
    }

    private Node doubleRotationWithRightChild(Node root) {
        root.right = rightRightRotation(root.right);
        return leftLeftRotation(root);
    }

    private Node doubleRotationWithleftChild(Node root) {
        root.left = leftLeftRotation(root.left);
        return rightRightRotation(root);
    }

    private Node rightRightRotation(Node root) {
        Node newNode = root.left;
        if (root.left.right != null) {
            root.left = root.left.right;
        }
        newNode.right = root;
        return newNode;
    }

    private Node leftLeftRotation(Node root) {
        Node newNode = root.right;
        if (root.right.left != null) {
            root.right = root.right.left;
        }
        newNode.left = root;
        return newNode;
    }
}

