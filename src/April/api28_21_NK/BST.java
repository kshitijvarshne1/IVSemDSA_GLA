/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 28-Apr-21
 *   Time: 3:52 PM
 *   File: BST.java
 */

package April.api28_21_NK;

import java.util.LinkedList;
import java.util.Queue;

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
            while (current != null) {
                parent = current;
                if (newNode.data <= current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                    }
                }
            }
        }
    }

    public void bfs() {
        if (root != null) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node temp = q.remove();
                if (temp != null) {
                    System.out.print(temp.data + " ");
                    if (temp.left != null) {
                        q.add(temp.left);
                    }
                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                } else if (!q.isEmpty()) {
                    System.out.println();
                    q.add(null);
                }
            }
            System.out.println();
        }
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

    public void delete(Node deleteElement) {
        if (this.root != null) {
            Node current = this.root;
            Node parent = null;
            while (current != null) {
                if (current.data == deleteElement.data) {
                    break;
                } else {
                    parent = current;
                    if (deleteElement.data < current.data) {
                        current = current.left;
                    } else {
                        current = current.right;
                    }
                }
            }
            if (current != null) {
                //1. leaf Case
                if (current.left == null && current.right == null) {
                    // root case
                    if (current == root) {
                        root = null;
                    } else if (deleteElement.data < parent.data) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
                // single child -> left child or right child
                else if (current.left != null && current.right == null) {
                    // left child
                    if (current.left != null) {
                        if (parent == null) {
                            parent = current;
                        } else if (deleteElement.data < parent.data) {
                            parent.left = current.left;
                        } else {
                            parent.right = current.left;
                        }
                    }
                } else if (current.left == null && current.right != null) {
                    if (parent == null) {
                        parent = current;
                    } else if (deleteElement.data < parent.data) {
                        parent.right = current.right;
                    } else {
                        parent.left = current.right;
                    }
                }
                // having two child
                else {
                    Node successor = getSuccessor(current);
                    delete(successor);
                    successor.left = current.left;
                    successor.right = current.right;
                    if (parent == null) {
                        root = successor;
                    } else {
                        if (deleteElement.data < parent.data) {
                            parent.left = successor;
                        } else {
                            parent.right = successor;
                        }
                    }
                }
            } else {
                System.out.println("Not found");
            }
        } else {
            System.out.println("tree is empty");
        }
    }

    private Node getSuccessor(Node current) {
        Node temp = current.right;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }
}

