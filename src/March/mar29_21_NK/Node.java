/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 29-Mar-21
 *   Time: 12:31 AM
 *   File: Node.java
 */

package March.mar29_21_NK;

public class Node<T> {
    public T data;
    public Node<T> left;
    public Node<T> right;

    public Node(T data, Node<T> left, Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

}

