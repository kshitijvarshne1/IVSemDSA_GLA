/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Jun-21
 *   Time: 11:55 AM
 *   File: Main.java
 */

package June.jun25_21;

public class Main {
    public static void main(String[] args) {
        QueueUsingArray qa = new QueueUsingArray(10);
        qa.pushback(5);
        qa.pushFront(4);
        qa.pushback(2);
        qa.pushFront(12);
        qa.popFront();
        qa.popBack();
    }
}

