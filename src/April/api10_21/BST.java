/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Apr-21
 *   Time: 12:22 PM
 *   File: BST.java
 */

package April.api10_21;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    public Node root;

    public BST() {
        this.root = null;
    }

    public void insert(Node newNode) {
        this.root = insert(this.root, newNode);
    }

    private Node insert(Node root, Node newNode) {
        if (root == null) {
            root = newNode;
            return root;
        } else if (newNode.data <= root.data) {
            if (root.left == null) {
                root.left = newNode;
            } else {
                insert(root.left, newNode);
            }
        } else {
            if (root.right == null) {
                root.right = newNode;
            } else {
                insert(root.right, newNode);
            }
        }
        return root;
    }

    public void inorder() {
        inorder(this.root);
        System.out.println();
    }

    private void inorder(Node root) {
        if (root == null) {
            return;
        } else {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
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
                    q.add(null);
                    System.out.println();
                }


            }
        }
    }
}

