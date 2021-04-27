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

    public void delete(Node deleteElement) {
        this.root = delete(this.root, deleteElement);
    }

    private Node delete(Node root, Node deleteElement) {
        if (root == null) {
            System.out.println("Not found");
            return root;
        }
        if (deleteElement.data < root.data) {
            root.left = delete(root.left, deleteElement);
        } else if (deleteElement.data > root.data) {
            root.right = delete(root.right, deleteElement);
        } else {
            if (root.left != null && root.right != null) {
                int successorElement = successor(root.right);
                delete(root.right, deleteElement);
                root.data = successorElement;
                return root;
            } else if (root.left == null || root.right == null) {
                if (root.left == null) {
                    return root.right;
                } else {
                    return root.left;
                }
            }
        }
        return root;

    }

    private int successor(Node right) {
        if (root.left != null) {
            Node temp = root;
            while (temp.left != null) {
                temp = temp.left;
            }
            return temp.data;
        } else {
            return root.data;
        }
    }
}

