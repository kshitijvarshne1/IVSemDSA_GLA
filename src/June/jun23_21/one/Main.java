/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 23-Jun-21
 *   Time: 8:50 AM
 *   File: Main.java
 */

package June.jun23_21.one;

public class Main {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.enqueue(new Node(1, 3));
        pq.enqueue(new Node(2, 2));
        pq.traverse();
        pq.enqueue(new Node(44, 5));
        pq.traverse();
        pq.dequeue();
        pq.traverse();
    }
}

