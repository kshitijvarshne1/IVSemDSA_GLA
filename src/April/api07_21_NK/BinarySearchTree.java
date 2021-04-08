/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 07-Apr-21
 *   Time: 10:38 PM
 *   File: BinarySearchTree.java
 */

package April.api07_21_NK;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
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
        inordePrint(this.root);
        System.out.println();
    }

    private void inordePrint(Node root) {
        if (root == null) {
            return;
        }
        inordePrint(root.left);
        System.out.print(root.data + " ");
        inordePrint(root.right);
    }

    public void delete(Node newNode) {
        deleteANode(this.root, newNode);
    }

    private Node deleteANode(Node root, Node newNode) {
        if (root == null) {
            return null;
        } else if (newNode.data < root.data) {
            root.left = deleteANode(root.left, newNode);
        } else if (newNode.data > root.data) {
            root.right = deleteANode(root.right, newNode);
        } else {
            // case 1:- two child
            if (root.left != null && root.right != null) {
                int lmax = findMaxData(root.left);
                root.data = lmax;
                root.left = deleteANode(root.left, new Node(lmax));
                return root;
            }
            //case 2: one child
            // case i-> has only left child
            else if (root.left != null) {
                return root.left;
            }
            // case ii-> has only right child
            else if (root.right != null) {
                return root.right;
            }
            //case 3:- no child
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

