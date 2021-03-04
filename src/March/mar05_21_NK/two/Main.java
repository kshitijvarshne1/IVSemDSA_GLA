/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 05-Mar-21
 *   Time: 2:22 AM
 *   File: Main.java
 */

package March.mar05_21_NK.two;

import March.mar03_21_NK.Node;

public class Main {
    public static void main(String[] args) {
        CircularQueueUsingLinkedList cc = new CircularQueueUsingLinkedList();
        cc.enqueue(new Node(3));
        cc.peek();
        cc.enqueue(new Node(4));
        cc.dequeue();
        cc.dequeue();
        cc.dequeue();
    }

}

