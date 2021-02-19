/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Feb-21
 *   Time: 8:19 PM
 *   File: Execution.java
 */

package feb19_21_NK.one;

public class Execution {
    public static void main(String[] args) {
        CircularQueueUsingArray list = new CircularQueueUsingArray(5);
        System.out.println(list.isEmpty());
        System.out.println(list.isFull());
        list.dequeue();
        list.enqueue(1);
        System.out.println(list.isEmpty());
        System.out.println(list.isFull());
        list.enqueue(2);
        System.out.println(list.isEmpty());
        System.out.println(list.isFull());
        list.enqueue(3);
        System.out.println(list.isEmpty());
        System.out.println(list.isFull());
        list.enqueue(4);
        System.out.println(list.isEmpty());
        System.out.println(list.isFull());
        list.enqueue(5);
        System.out.println("Hello");
        System.out.println(list.isEmpty());
        System.out.println(list.isFull());
        list.dequeue();
        list.dequeue();
        list.dequeue();
        System.out.println(list.isEmpty());
    }
}

