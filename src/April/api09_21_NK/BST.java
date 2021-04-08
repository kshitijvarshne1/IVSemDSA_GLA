/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Apr-21
 *   Time: 8:22 PM
 *   File: BST.java
 */

package April.api09_21_NK;

public class BST {
    public Node root;

    public BST() {
        this.root = null;
    }

    public void insert(Node newNode) {
        if (root == null) {
            root = newNode;
        } else {
            Node current = this.root;
            Node parent;
            while (true) {
                parent = current;
                if (newNode.data <= current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inorder() {
        inorder(this.root);
        System.out.println();
    }

    private void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void delete(Node node) {
        delete(this.root, node);
    }

    private Node delete(Node root, Node node) {
        if (root == null) {
            return null;
        } else if (node.data < root.data) {
            delete(root.left, node);
        } else if (node.data > root.data) {
            delete(root.right, node);
        } else {
            // element is in BST
            // case 1:-
            if (root.left != null && root.right != null) {
                int predecessor = findMaxData(root.left);
                root.data = predecessor;
                delete(root.left, new Node(predecessor));
                return root;
            }
            // case 2:- i ->left of tree is not null
            else if (root.left != null) {
                return root.left;
            }
            // case 2:- ii ->
            else if (root.right != null) {
                return root.right;
            }
            // case 3 : - leaf node
            else {
                return null;
            }
        }
        return root;
    }

    public int findMaxData(Node root) {
        if (root.right != null) {
            return findMaxData(root.right);
        } else {
            return root.data;
        }
    }
}

