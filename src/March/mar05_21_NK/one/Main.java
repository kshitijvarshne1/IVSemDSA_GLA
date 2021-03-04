/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 05-Mar-21
 *   Time: 12:44 AM
 *   File: Main.java
 */

package March.mar05_21_NK.one;

public class Main {
    public static void main(String[] args) {
        CircularQueueUsingArray cc = new CircularQueueUsingArray(5);
        cc.enqueue(2);
        cc.enqueue(3);
        cc.enqueue(4);
        cc.enqueue(5);
        cc.enqueue(6);
        System.out.println(cc.isFull());
        cc.dequeue();
        System.out.println(cc.isFull());
        cc.enqueue(1);
        System.out.println(cc.isFull());
        cc.print();
    }
}

