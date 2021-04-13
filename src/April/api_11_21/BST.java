/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 11-Apr-21
 *   Time: 12:00 PM
 *   File: BST.java
 */

package April.api_11_21;

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
            Node current = this.root, parent;
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
                    q.add(null);
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    // Naive sol-> o(n) n -> no of nodes
    // floor of key means a node equal to key or closest to node
    // Time O(h) h-> height, space o(1)
    public Node floor(int key) {
        Node result = null;
        if (root != null) {
            Node temp = this.root;
            while (temp != null) {
                if (key == temp.data) {
                    return temp;
                }
                if (temp.data > key) {
                    temp = temp.left;
                } else {
                    result = temp;
                    temp = temp.right;
                }
            }
        }
        return result;
    }
    // ceil of key means a node which is just greater than or equal to key

    public Node ceil(int key) {
        Node result = null;
        if (root != null) {
            Node temp = root;
            while (temp != null) {
                if (temp.data == key) {
                    return temp;
                }
                if (temp.data < key) {
                    temp = temp.right;
                } else {
                    result = temp;
                    temp = temp.left;
                }
            }
        }
        return result;
    }

    // it is iterative approach , it can done by recursion
    // here i already let that both data d1 and d2 should present in Binary search tree
    public int LCA(int d1, int d2) {
        Node temp = root;
        if (temp != null) {
            while (true) {
                if (temp.data == d1 || temp.data == d2) {
                    return temp.data;
                }
                if (d1 < temp.data && d2 < temp.data) {
                    if (temp.left != null) {
                        temp = temp.left;
                    }
                } else if (d1 > temp.data && d2 > temp.data) {
                    if (temp.right != null) {
                        temp = temp.right;
                    }
                } else {
                    return temp.data;
                }
            }
        } else {
            return -1;
        }
    }
}