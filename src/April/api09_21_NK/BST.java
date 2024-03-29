/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Apr-21
 *   Time: 8:22 PM
 *   File: BST.java
 */

package April.api09_21_NK;

import java.util.Stack;

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
            root.left = delete(root.left, node);
        } else if (node.data > root.data) {
            root.right = delete(root.right, node);
        } else {
            // element is in BST
            // case 1:-
            if (root.left != null && root.right != null) {
                int lmax = findMaxData(root.left);
                root.data = lmax;
                root.left = delete(root.left, new Node(lmax));
                return root;
            }
            // case 2:- i ->left of tree is not null
            else if (root.left != null) {
                return root.left;
            }
            // case 2:- ii -> right of tree is not null
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

    public void inorderIterative() {
        Stack<Node> stack = new Stack<>();

        Node current = this.root;
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push((current));
                current = current.left;
            } else {
                current = stack.pop();
                System.out.print(current.data + " ");
                current = current.right;
            }
        }
        System.out.println();
    }

    public void prorderIterative() {
        if (root != null) {
            Stack<Node> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                Node current = stack.pop();
                System.out.print(current.data + " ");
                if (current.right != null) {
                    stack.push(current.right);
                }
                if (current.left != null) {
                    stack.push(current.left);
                }
            }
            System.out.println();
        }

    }
}

