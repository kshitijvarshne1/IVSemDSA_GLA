/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 05-Mar-21
 *   Time: 11:38 AM
 *   File: Main.java
 */

package March.mar05_21_NK.three;

public class Main {
    public static void main(String[] args) {
        PriorityQueueUsingLinkedList ll = new PriorityQueueUsingLinkedList();
        ll.enqueue(new Node(2, 2));
        ll.print();
        ll.enqueue(new Node(2, 3));
        ll.print();
        ll.enqueue(new Node(2, 1));
        ll.print();
        ll.dequeue();
        ll.print();
        System.out.println(ll.peek());
    }
}

