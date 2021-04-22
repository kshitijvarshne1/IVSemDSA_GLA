/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 12-Apr-21
 *   Time: 9:48 PM
 *   File: Node.java
 */

package April.api12_21_NK;

public class Node {
    public int data;
    public Node left;
    public Node right;
    public int height;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = 0;
    }
}

