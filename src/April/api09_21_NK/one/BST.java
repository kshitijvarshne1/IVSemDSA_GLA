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

    public void delete(Node key) {
        delete(this.root, key);
    }

    private Node delete(Node root, Node key) {
        if (root == null) {
            return null;
        } else if (key.data < root.data) {
            root.left = delete(root.left, key);
        } else if (key.data > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left != null && root.right != null) {
                // find max data in left sub tree
                int temp = findMaxData(root.left);
                root.data = temp;
                root = delete(root.left, new Node(temp));
                return root;
            } else if (root.left != null) {
                return root.left;
            } else if (root.right != null) {
                return root.right;
            } else {
                return null;
            }
        }
        return root;

    }

    private int findMaxData(Node root) {
        if (root == null) {
            return -1;
        }
        return findMaxData(root.right);
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

    public int predecessor(Node key) {
        return predecessor(this.root, key);
    }

    private int predecessor(Node root, Node key) {
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
            predecessor(root.left, key);
        } else {
            pre = root;
            predecessor(root.right, key);
        }
        return pre.data;
    }
}

