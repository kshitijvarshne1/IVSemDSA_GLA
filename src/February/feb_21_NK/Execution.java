/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Feb-21
 *   Time: 3:28 PM
 *   File: Execution.java
 */

package February.feb_21_NK;

public class Execution {
    public static void main(String[] args) {
        PriorityQueueUsingLinkedList list = new PriorityQueueUsingLinkedList();
        list.enqueue(new Node(5, 2));
        list.print();
        list.enqueue(new Node(4, 1));
        list.print();
        list.enqueue(new Node(5, 3));
        list.print();
        list.enqueue(new Node(55, 2));
        list.print();
        System.out.println(list.peek());
        list.dequeue();
        System.out.println(list.peek());
        list.print();
    }
}

