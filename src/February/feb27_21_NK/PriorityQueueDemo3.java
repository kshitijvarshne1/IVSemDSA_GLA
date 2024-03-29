/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 27-Feb-21
 *   Time: 7:06 PM
 *   File: PriorityQueueDemo3.java
 */

package February.feb27_21_NK;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo3 {
    public static void main(String[] args) {
        //Using Lambda Expression
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        pq.add(1);
        pq.add(5);
        pq.add(2);
        pq.add(4);
        pq.add(3);
        Iterator iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}

