/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Feb-21
 *   Time: 8:36 PM
 *   File: Execution.java
 */

package feb17_21_NK.two;

public class Execution {
    public static void main(String[] args) {
        QueueUsingLinkedList list = new QueueUsingLinkedList();
        for (int i = 1; i <= 5; i++) {
            list.enqueue(new Node(i));
        }
        list.print();
        for (int i = 0; i < 5; i++) {
            list.dequeue();
        }
        list.dequeue();
    }
}

