/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Apr-21
 *   Time: 12:51 PM
 *   File: Node.java
 */

package April.api17_21_NK;

public class Node {
    // instance variable   :---: Fields
    public int data;
    public Node left;
    public Node right;
    public int height;

    //Constructor
    public Node(int data, int height) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = height;
    }
}

