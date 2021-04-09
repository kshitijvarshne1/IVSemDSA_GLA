/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Apr-21
 *   Time: 10:06 PM
 *   File: BST.java
 */

package April.api09_21_NK.one;

public class BST {
    public Node root;

    public BST() {
        this.root = null;
    }

    public void insert(Node newNode) {
        if (root == null) {
            root = newNode;
        } else {
            Node parent;
            Node current = this.root;
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
    }

    private void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static Node suce = null;

    public int successor(Node key) {
        return successor(this.root, key);
    }

    private int successor(Node root, Node key) {
        if (root == null) {
            return -1;
        }
        if (root.data == key.data) {
            // go for left subtree to find max
            if (root.left != null) {
                Node temp = root.left;
                while (temp.right != null) {
                    temp = temp.right;
                }
                suce = temp;
                return suce.data;
            }
        }
        if (key.data < root.data) {
            suce = root;
            successor(root.left, key);
        } else {
            successor(root.right, key);
        }
        return suce.data;
    }
}

