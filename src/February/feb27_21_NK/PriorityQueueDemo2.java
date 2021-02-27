/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 27-Feb-21
 *   Time: 5:12 PM
 *   File: PriorityQueueDemo2.java
 */

package February.feb27_21_NK;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a < b)
                    return 1;
                if (a > b)
                    return -1;
                return 0;
            }
        });
        pq.add(1);
        pq.add(3);
        pq.add(5);
        pq.add(2);
        Iterator iterator = pq.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println(pq.peek());
    }
}

