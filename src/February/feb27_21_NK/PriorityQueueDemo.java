/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 27-Feb-21
 *   Time: 4:54 PM
 *   File: PriorityQueueDemo.java
 */

package February.feb27_21_NK;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(3);
        pq.add(4);
        pq.add(2);
        Iterator iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println(pq.peek());
        System.out.println();
    }
}

