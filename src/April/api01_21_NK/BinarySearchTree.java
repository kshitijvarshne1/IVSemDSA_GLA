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
            Node parent = null;
            while (true) {
                parent = temp;
                if (newNode.data <= temp.data) {
                    temp = temp.left;
                    if (temp == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    temp = temp.right;
                    if (temp == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inorder() {
        inorderPrinting(this.root);
        System.out.println();
    }

    private void inorderPrinting(Node root) {
        if (root == null) {
            return;
        }
        inorderPrinting(root.left);
        System.out.print(root.data + " ");
        inorderPrinting(root.right);
    }
    //find minimum and maximum data in binary search tree

    public int minData() {
        return findMinData(this.root);
    }

    private int findMinData(Node root) {
        if (root == null) {
            return -1;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    //Using Recursion

    public int minDataUsingRecursion() {
        return findMinDataUsingRecursion(this.root);
    }

    private int findMinDataUsingRecursion(Node root) {
        if (root == null) {
            return -1;
        } else if (root.left == null) {
            return root.data;
        } else {
            return findMinDataUsingRecursion(root.left);
        }
    }

    public int height() {
        return findHeight(this.root);
    }

    private int findHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Integer.max(findHeight(root.left), findHeight(root.right));
    }
}

