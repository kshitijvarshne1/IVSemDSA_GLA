/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Apr-21
 *   Time: 11:34 AM
 *   File: BST.java
 */

package April.api04_21_NK;

public class BST<T> {
    public Node<T> root;

    public BST() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }
}

