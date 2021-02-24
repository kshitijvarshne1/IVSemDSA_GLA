/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 24-Feb-21
 *   Time: 8:12 PM
 *   File: Execution.java
 */

package February.feb24_21_NK;

public class Execution {
    public static void main(String[] args) {
        DoublyEndedQueue list = new DoublyEndedQueue();
        for (int i = 0; i < 5; i++) {
            list.enqueueAtEnd(new Node(i));
        }
        list.print();
        list.enqueueAtFront(new Node(22));
        list.print();
        list.dequeueAtEnd();
        list.print();
        list.dequeueAtFirst();
        list.print();
        System.out.println(list.peek());
        System.out.println(list.peekEnd());

    }
}

