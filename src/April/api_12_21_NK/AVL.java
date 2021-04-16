/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 12-Apr-21
 *   Time: 9:50 PM
 *   File: AVL.java
 */

package April.api_12_21_NK;

import java.util.LinkedList;
import java.util.Queue;

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
                    root = doubleRotationWithLeftChild(root);
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

    private Node doubleRotationWithLeftChild(Node root) {
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

    public void bsf() {
        if (root != null) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node temp = q.remove();
                if (temp != null) {
                    System.out.print(temp.data + " ");
                    if (temp.left != null) {
                        q.add(temp.left);
                    }
                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                } else if (!q.isEmpty()) {
                    System.out.println();
                    q.add(null);
                }

            }
        }
    }
}

