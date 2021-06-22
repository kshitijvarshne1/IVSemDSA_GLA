/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 22-Jun-21
 *   Time: 9:25 AM
 *   File: Main.java
 */

package June.jun22_21.two;

public class Main {
    public static void main(String[] args) {
        QueueUsingArray qa = new QueueUsingArray(5);
        qa.enqueue(5);
        qa.peek();
        qa.enqueue(33);
        qa.enqueue(3);
        qa.dequeue();
        qa.dequeue();

        QueueUsingLinkedList ql = new QueueUsingLinkedList();
        ql.enqueue(new Node(new Employee(1, "sam", 1000)));
        ql.enqueue(new Node(new Employee(2, "john", 2000)));
        ql.peek();
        ql.dequeue();
        ql.peek();

    }
}

