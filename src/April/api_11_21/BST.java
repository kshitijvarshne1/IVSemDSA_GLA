/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 11-Apr-21
 *   Time: 12:00 PM
 *   File: BST.java
 */

package April.api_11_21;

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
}

