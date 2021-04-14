/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 14-Apr-21
 *   Time: 7:59 PM
 *   File: BSTtree.java
 */

package April.api_14_21_NK;

import java.util.LinkedList;
import java.util.Queue;

public class BSTtree<E extends Comparable<E>> {
    public Node<E> root;

    public BSTtree() {
        this.root = null;
    }

    public void insert(Node<E> newNode) {
        if (root == null) {
            root = newNode;
        } else {
            Node<E> current = this.root;
            Node<E> parent;
            while (current != null) {
                parent = current;
                if (newNode.getData().compareTo(current.getData()) <= 0) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(newNode);
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(newNode);
                    }
                }
            }
        }
    }

    public void inorder() {
        inorder(this.root);
        System.out.println();
    }

    private void inorder(Node<E> root) {
        if (root == null) {
            return;
        }
        inorder(root.getLeft());
        System.out.print(root.getData() + " ");
        inorder(root.getRight());
    }

    public void inorderReverse() {
        inorderReverse(this.root);
        System.out.println();
    }

    private void inorderReverse(Node<E> root) {
        if (root == null) {
            return;
        }
        inorderReverse(root.getRight());
        System.out.print(root.getData() + " ");
        inorderReverse(root.getLeft());
    }

    public void delete(Node<E> newNode) {
        this.root = delete(this.root, newNode);
    }

    private Node<E> delete(Node<E> root, Node<E> newNode) {
        if (root == null) {
            return root;
        } else if (newNode.getData().compareTo(root.getData()) < 0) {
            root.setLeft(delete(root.getLeft(), newNode));
        } else if (newNode.getData().compareTo(root.getData()) > 0) {
            root.setRight(delete(root.getRight(), newNode));
        } else {
            // two child
            if (root.getLeft() != null && root.getRight() != null) {
                E successor = minRight(root.getRight());
                root.setData(successor);
                root.setRight(delete(root.getRight(), new Node<>(successor)));
                return root;
            } else if (root.getRight() == null || root.getLeft() == null) {
                if (root.getLeft() == null) {
                    return root.getRight();
                } else {
                    return root.getLeft();
                }
            } else {
                return null;
            }
        }
        return root;
    }

    private E minRight(Node<E> right) {
        if (root.getLeft() != null) {
            return minRight(root.getLeft());
        } else {
            return root.getData();
        }
    }

    public void bfs() {
        if (root != null) {
            Queue<Node<E>> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node<E> temp = q.remove();
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

        }
    }
}

