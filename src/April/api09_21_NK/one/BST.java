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

    static Node pre = null;

    private void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void inorder() {
        inorder(this.root);
        System.out.println();
    }

    public int precedessor(Node key) {
        return precedessor(this.root, key);
    }

    private int precedessor(Node root, Node key) {
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
                pre = temp;
                return pre.data;
            }
        }
        if (key.data < root.data) {
            precedessor(root.left, key);
        } else {
            pre = root;
            precedessor(root.right, key);
        }
        return pre.data;
    }
}

