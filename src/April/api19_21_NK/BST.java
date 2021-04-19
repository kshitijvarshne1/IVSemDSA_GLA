/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Apr-21
 *   Time: 2:20 PM
 *   File: BST.java
 */

package April.api19_21_NK;

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
            Node current = this.root;
            Node parent = null;
            while (current != null) {
                parent = current;
                if (newNode.data < current.data) {
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

    public void delete(int deleteElement) {
        if (root != null) {
            Node current = this.root;
            Node parent = null;
            while (current != null) {
                if (current.data == deleteElement) {
                    break;
                }
                parent = current;
                if (deleteElement < current.data) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }
            if (current != null) {
                //Leaf node
                if (current.left == null && current.right == null) {
                    // delete element is root
                    if (parent == null) {
                        root = null;
                    } else {
                        if (deleteElement < parent.data) {
                            parent.left = null;
                        } else {
                            parent.right = null;
                        }
                    }
                }
                // only left child
                else if (current.left != null && current.right == null) {
                    if (parent == null) {
                        root = root.left;
                    } else {
                        if (deleteElement < parent.data) {
                            parent.left = current.left;
                        } else {
                            parent.right = current.left;
                        }
                    }
                } else if (current.left == null && current.right != null) {
                    if (parent == null) {
                        root = root.right;
                    } else {
                        if (deleteElement < parent.data) {
                            parent.left = current.right;
                        } else {
                            parent.right = current.right;
                        }
                    }
                }
                // Node having two child
                else {
                    Node successorElement = successor(current);
                    delete(successorElement.data);
                    successorElement.left = current.left;
                    successorElement.right = current.right;
                    // root case
                    if (parent == null) {
                        root = successorElement;
                    } else {
                        if (deleteElement < parent.data) {
                            parent.left = successorElement;
                        } else {
                            parent.right = successorElement;
                        }
                    }
                }
            } else {
                System.out.println("Element not found");
            }
        }
    }

    private Node successor(Node current) {
        Node temp = current.right;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }
}

