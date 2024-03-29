/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Feb-21
 *   Time: 7:44 PM
 *   File: Execution.java
 */

package February.feb17_21_NK;

public class Execution {
    public static void main(String[] args) {
        QueueUsingArray list = new QueueUsingArray(5);
        for (int i = 1; i <= 5; i++) {
            list.enqueue(i);
        }
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.dequeue();
        System.out.println(list.isFull());
        System.out.println(list.isEmpty());
    }
}

