/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Mar-21
 *   Time: 10:45 PM
 *   File: Main.java
 */

package March.mar04_21_NK.three;

public class Main {
    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(5);
        q.enqueue(1);
        q.enqueue(2);
        q.peek();
        q.dequeue();
        q.peek();
        q.dequeue();
        q.peek();
        q.dequeue();
    }
}

