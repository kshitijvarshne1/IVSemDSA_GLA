/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Apr-21
 *   Time: 12:54 PM
 *   File: AVL.java
 */

package April.api17_21_NK;

//A -> Adelson
//V -> Velsky
//L -> Landis

public class AVL {
    public Node root;

    public AVL() {
        this.root = null;
    }

    public int height(Node node) {
        return node == null ? -1 : node.height;
    }
}

