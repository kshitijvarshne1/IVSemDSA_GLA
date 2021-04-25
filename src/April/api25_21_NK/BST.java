/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Apr-21
 *   Time: 11:41 AM
 *   File: BST.java
 */

package April.api25_21_NK;

import java.util.LinkedList;
import java.util.Queue;

public class BST<T extends Comparable<T>> {
    public Node<T> root;

    public BST() {
        this.root = null;
    }

    public void insert(Node<T> newNode) {
        this.root = insert(this.root, newNode);
    }

    private Node<T> insert(Node<T> root, Node<T> newNode) {
        if (root == null) {
            root = newNode;
            return root;
        }
        if (newNode.getData().compareTo(root.getData()) <= 0) {
            root.setLeft(newNode);
        } else {
            root.setRight(newNode);
        }
        return root;
    }

    public void bsf() {
        if (root != null) {
            Queue<Node<T>> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node<T> temp = q.remove();
                if (temp != null) {
                    System.out.print(temp.getData() + " ");
                    if (temp.getLeft() != null) {
                        q.add(temp.getLeft());
                    }
                    if (temp.getRight() != null) {
                        q.add(temp.getRight());
                    }
                } else if (!q.isEmpty()) {
                    q.add(null);
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    public boolean search(Node<T> newNode) {
        return search(this.root, newNode);
    }

    private boolean search(Node<T> root, Node<T> newNode) {
        if (root != null) {
            if (root.getData().compareTo(newNode.getData()) == 0) {
                return true;
            }
            if (newNode.getData().compareTo(root.getData()) < 0) {
                return search(root.getLeft(), newNode);
            } else {
                return search(root.getRight(), newNode);
            }
        } else {
            return false;
        }
    }

    public void delete(Node<T> newNode) {
        this.root = delete(this.root, newNode);
    }

    private Node<T> delete(Node<T> root, Node<T> deleteNode) {
        if (root == null) {
            System.out.println("Not found");
            return root;
        } else if (deleteNode.getData().compareTo(root.getData()) < 0) {
            root.setLeft(delete(root.getLeft(), deleteNode));
        } else if (deleteNode.getData().compareTo(root.getData()) > 0) {
            root.setRight(delete(root.getRight(), deleteNode));
        } else {
            // check two child
            if (root.getLeft() != null && root.getRight() != null) {
                Node<T> successor = successorFind(root.getRight());
                root.setData(successor.getData());
                root.setRight(delete(root.getRight(), successor));
                return root;
            } else if (root.getLeft() == null || root.getRight() == null) {
                if (root.getLeft() == null) {
                    return root.getRight();
                } else {
                    return root.getLeft();
                }
            }
        }
        return root;
    }

    private Node<T> successorFind(Node<T> right) {
        if (root.getLeft() != null) {
            Node<T> temp = root.getLeft();
            while (temp != null) {
                temp = temp.getLeft();
            }
            return temp;
        }
        return root;
    }

}

