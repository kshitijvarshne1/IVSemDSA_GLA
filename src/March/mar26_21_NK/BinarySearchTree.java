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
        if (this.root == null) {
            root = newNode;
            return;
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

    public void insertRecursive(Node newNode) {
        this.root = insertANode(this.root, newNode);
    }

    private Node insertANode(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
            return root;
        } else if (newNode.data <= root.data) {
            root.left = insertANode(root.left, newNode);
        } else {
            root.right = insertANode(root.right, newNode);
        }
        return root;
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

    public void postorder() {
        postorderPrinting(this.root);
    }

    private void postorderPrinting(Node root) {
        if (root == null) {
            return;
        }
        postorderPrinting(root.left);
        postorderPrinting(root.right);
        System.out.print(root.data + " ");
    }

    public void minNode() {
        System.out.println(findMinNode(this.root).data);
    }

    private Node findMinNode(Node root) {
        if (root.left != null) {
            return findMinNode(root.left);
        }
        return root;
    }

    public void maxNode() {
        System.out.println(findMaxNode(this.root).data);
    }

    private Node findMaxNode(Node root) {
        if (root.right != null) {
            return findMinNode(root.right);
        }
        return root;
    }

    public boolean isBST() {
        return checkIsBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkIsBST(Node root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }
        if (root.data >= minValue && root.data <= maxValue && checkIsBST(root.left, minValue, root.data) && checkIsBST(root.right, root.data, maxValue)) {
            return true;
        }
        return false;
    }

}

