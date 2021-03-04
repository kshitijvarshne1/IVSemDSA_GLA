/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Mar-21
 *   Time: 11:12 PM
 *   File: Main.java
 */

package March.mar04_21_NK.four;

public class Main {
    public static void main(String[] args) {
        QueueUsingLinkedList ll = new QueueUsingLinkedList();
        ll.enqueue(new Node(1));
        ll.enqueue(new Node(2));
        ll.dequeue();
        ll.dequeue();
        ll.dequeue();
    }
}

