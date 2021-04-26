/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 26-Apr-21
 *   Time: 7:34 PM
 *   File: BST.java
 */

package April.api26_21_NK;

public class BST {
    public Node root;

    public BST() {
        this.root = null;
    }

    public void insert(Node newNode) {
        this.root = insert(root, newNode);
    }

    private Node insert(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
            return root;
        } else if (newNode.data <= root.data) {
            root.left = insert(root.left, newNode);
        } else {
            root.right = insert(root.right, newNode);
        }
        return root;
    }

    public void inorder() {
        inorder(this.root);
        System.out.println();
    }

    private void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public void preorder() {
        preorder(this.root);
        System.out.println();
    }

    private void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public boolean search(Node searchElement) {
        return search(root, searchElement);
    }

    private boolean search(Node root, Node searchElement) {
        if (root != null) {
            if (root.data == searchElement.data) {
                return true;
            }
            if (searchElement.data <= root.data) {
                return search(root.left, searchElement);
            } else {
                return search(root.right, searchElement);
            }
        }
        return false;
    }
}

