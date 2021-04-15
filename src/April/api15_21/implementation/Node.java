/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-Apr-21
 *   Time: 9:53 PM
 *   File: Node.java
 */

package April.api15_21.implementation;

public class Node<E extends Comparable<E>> implements April.api15_21.myinterface.Node {
    private int data;
    private Node<E> left;
    private Node<E> right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

