/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 12-Apr-21
 *   Time: 9:50 PM
 *   File: AVL.java
 */

package April.api_12_21_NK;

public class AVL {
    public Node root;

    public AVL() {
        this.root = null;
    }

    public int max(int lhs, int rhs) {
        return lhs > rhs ? lhs : rhs;
    }

    public int height(Node node) {
        return node == null ? -1 : node.height;
    }
}

