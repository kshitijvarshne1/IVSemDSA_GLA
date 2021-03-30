/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 29-Mar-21
 *   Time: 12:35 AM
 *   File: BinarySearchTree.java
 */

package March.mar29_21_NK;

import java.util.LinkedList;
import java.util.Queue;

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

    public int countNodes() {
        return countAllNodes(this.root);
    }

    private int countAllNodes(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + countAllNodes(root.left) + countAllNodes(root.right);
        }
    }

    public int sumOfNodes() {
        return sumOfAllNodes(this.root);
    }

    private int sumOfAllNodes(Node root) {
        if (root == null) {
            return 0;
        } else {
            return root.data + sumOfAllNodes(root.left) + sumOfAllNodes(root.right);
        }
    }

    public void sumReplace() {
        sumReplaceTechnique(this.root);
    }

    private void sumReplaceTechnique(Node root) {
        if (root == null) {
            return;
        }
        sumReplaceTechnique(root.left);
        sumReplaceTechnique(root.right);
        if (root.left != null) {
            root.data += root.left.data;
        }
        if (root.right != null) {
            root.data += root.right.data;
        }
    }

    public void rightView() {
        printRightView(this.root);
    }

    private void printRightView(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printRightView(root.right);
    }

    public void leftView() {
        printLeftView(this.root);
    }

    private void printLeftView(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printLeftView(root.left);
    }

    public int height() {
        return calculateHeight(this.root);
    }

    private int calculateHeight(Node root) {
        if (root == null) {
            return 0;
        }
        int lHeight = calculateHeight(root.left);
        int rHeight = calculateHeight(root.right);
        return 1 + Integer.max(lHeight, rHeight);
    }

    public int diameter() {
        return calculateDiameter(this.root);
    }

    //0(n^2)
    private int calculateDiameter(Node root) {
        if (root == null) {
            return 0;
        }
        int lHeight = calculateHeight(root.left);
        int rHeight = calculateHeight(root.right);
        int currDiameter = lHeight + rHeight + 1;
        int lDiameter = calculateDiameter(root.left);
        int rDiameter = calculateDiameter(root.right);
        return Integer.max(currDiameter, Integer.max(lDiameter, rDiameter));
    }

    public void levelOrderTraverse() {
        printLevelOrderTraversal(this.root);
    }

    private void printLevelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.remove();
            if (temp != null) {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            } else if (!q.isEmpty()) {
                q.add(null);
                System.out.println();
            }
        }
    }

}

