/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Apr-21
 *   Time: 11:18 AM
 *   File: BinarySearchTree.java
 */

package April.api01_21_NK;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(Node newNode) {
        if (root == null) {
            root = newNode;
        } else {
            Node temp = this.root;
            Node parent;
            while (true) {
                parent = temp;
                if (newNode.data <= temp.data) {
                    temp = temp.left;
                    if (temp == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    temp = temp.right;
                    if (temp == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inorder() {
        inorderPrinting(this.root);
        System.out.println();
    }

    private void inorderPrinting(Node root) {
        if (root == null) {
            return;
        }
        inorderPrinting(root.left);
        System.out.print(root.data + " ");
        inorderPrinting(root.right);
    }
    //find minimum and maximum data in binary search tree

    public int minData() {
        return findMinData(this.root);
    }

    private int findMinData(Node root) {
        if (root == null) {
            return -1;
        }
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    //Using Recursion

    public int minDataUsingRecursion() {
        return findMinDataUsingRecursion(this.root);
    }

    private int findMinDataUsingRecursion(Node root) {
        if (root == null) {
            return -1;
        } else if (root.left == null) {
            return root.data;
        } else {
            return findMinDataUsingRecursion(root.left);
        }
    }

    public int height() {
        return findHeight(this.root);
    }

    //Here we counting no of edges in the tree that why on leaf node or empty tree the height is -1 ::-- showing correct definition of tree
    // But when we counting number of nodes then we return on leaf node and empty node is zero
    // O(n) n -> no of nodes
    private int findHeight(Node root) {
        if (root == null) {
            return -1;
        }
        return 1 + Integer.max(findHeight(root.left), findHeight(root.right));
    }

    //O(n) n-> number of nodes
    public void bfs() {
        if (root != null) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                Node visitedNode = q.peek();
                System.out.print(visitedNode.data + " ");
                q.remove();
                if (visitedNode.left != null) {
                    q.add(visitedNode.left);
                }
                if (visitedNode.right != null) {
                    q.add(visitedNode.right);
                }
            }
        }
        System.out.println();
    }

    public void bfsPrintLevelByLevel() {
        if (root != null) {
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node visitedNode = q.peek();
                q.remove();
                if (visitedNode != null) {
                    System.out.print(visitedNode.data + " ");
                    if (visitedNode.left != null) {
                        q.add(visitedNode.left);
                    }
                    if (visitedNode.right != null) {
                        q.add(visitedNode.right);
                    }
                } else if (!q.isEmpty()) {
                    System.out.println();
                    q.add(null);
                }
            }
        }
        System.out.println();
    }

    public boolean isBST() {
        return checkIsBST(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean checkIsBST(Node root, int minValue, int maxValue) {
        if (root == null) {
            return true;
        }
        return root.data >= minValue && root.data <= maxValue && checkIsBST(root.left, minValue, root.data) && checkIsBST(root.right, root.data, maxValue);
    }

    /*
     * Case 1:- No child
     * Case 2:- 1 child
     * case 3:- 2 child
     * */
    public void deleteANode(Node node) {
        deleteANodeFromBST(this.root, node);
    }

    private Node deleteANodeFromBST(Node root, Node node) {
        if (root == null) {
            return null;
        } else if (node.data < root.data) {
            root.left = deleteANodeFromBST(root.left, node);
        } else if (node.data > root.data) {
            root.right = deleteANodeFromBST(root.right, node);
        } else {
            // case 3: 2 child
            if (root.left != null && root.right != null) {
                int lmax = findMaxData(root.left);
                root.data = lmax;
                root.left = deleteANodeFromBST(root.left, new Node(lmax));
                return node;

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
            //case 1:- no child
            else {
                return null;
            }
        }
        return root;
    }

    public int findMaxData(Node root) {
        if (root.right != null) {
            return findMinData(root.right);
        } else {
            return root.data;
        }
    }
}
