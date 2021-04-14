/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 14-Apr-21
 *   Time: 7:56 PM
 *   File: Node.java
 */

package April.api_14_21_NK;

public class Node<E> {
    private E data;
    private Node<E> left;
    private Node<E> right;

    public Node(E data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

