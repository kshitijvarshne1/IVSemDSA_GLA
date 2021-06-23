/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 23-Jun-21
 *   Time: 9:12 AM
 *   File: BSTree.java
 */

package June.jun23_21.two;

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
}

