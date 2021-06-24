/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 23-Jun-21
 *   Time: 9:12 AM
 *   File: BSTree.java
 */

package June.jun23_21.two;

import java.util.LinkedList;
import java.util.Queue;

public class BSTree {
    public Node root;

    public BSTree() {
        root = null;
    }

    public void insert(Node newNode) {
        root = insert(this.root, newNode);
    }

    private Node insert(Node root, Node newNode) {
        if (root == null) {
            return root = newNode;
        } else if (newNode.getData() <= root.getData()) {
            root.setLeft(insert(root.getLeft(), newNode));
        } else {
            root.setRight(insert(root.getRight(), newNode));
        }
        return root;
    }

    public void bfs() {
        if (root == null) {
            System.out.println("Tree is empty");
        } else {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node tmp = q.remove();
                if (tmp != null) {
                    System.out.print(tmp.getData() + " ");
                    if (tmp.getLeft() != null) {
                        q.add(tmp.getLeft());
                    }
                    if (tmp.getRight() != null) {
                        q.add(tmp.getRight());
                    }
                } else if (!q.isEmpty()) {
                    q.add(null);
                    System.out.println();

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
            inorder(root.getLeft());
            System.out.print(root.getData() + " ");
            inorder(root.getRight());
        }
    }

    public void preorder() {
        preorder(this.root);
        System.out.println();
    }

    private void preorder(Node root) {
        if (root != null) {
            preorder(root.getLeft());
            System.out.print(root.getData() + " ");
            preorder(root.getRight());
        }
    }

    public boolean search(Node newNode) {
        return search(this.root, newNode);
    }

    private boolean search(Node root, Node newNode) {
        if (root == null) {
            return false;
        }
        if (root.getData() == newNode.getData()) {
            return true;
        } else if (newNode.getData() < root.getData()) {
            return search(root.getLeft(), newNode);
        } else if (newNode.getData() > root.getData()) {
            return search(root.getRight(), newNode);
        } else {
            return false;
        }
    }

    public Node getSuccessor(Node root) {
        if (root != null) {
            Node tmp = root.getRight();
            while (tmp.getLeft() != null) {
                tmp = tmp.getLeft();
            }
            return tmp;
        }
        return null;
    }

    public void deleteNode(Node node) {
        root = deleteNode(this.root, node);
    }

    private Node deleteNode(Node root, Node node) {
        if (root == null) {
            return null;
        }
        if (node.getData() < root.getData()) {
            root.setLeft(deleteNode(root.getLeft(), node));
        } else if (node.getData() > root.getData()) {
            root.setRight(deleteNode(root.getRight(), node));
        } else if (root.getData() == node.getData()) {
            // one child is null
            if (root.getLeft() == null || root.getRight() == null) {
                Node tmp;
                if (root.getLeft() == null) {
                    tmp = root.getRight();
                } else {
                    tmp = root.getLeft();
                }
                if (tmp == null) {
                    return null;
                } else {
                    return tmp;
                }
            } else {
                Node successor = getSuccessor(root);
                int k = root.getData();
                root.setData(successor.getData());
                root.setRight(deleteNode(root.getRight(), new Node(k)));
                return root;
            }
        } else {
            return root;
        }
        return root;
    }

}

