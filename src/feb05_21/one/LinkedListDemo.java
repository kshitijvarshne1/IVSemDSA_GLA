/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 05-Feb-21
 *   Time: 1:53 PM
 *   File: LinkedListDemo.java
 */

package feb05_21.one;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        // 5 operations:---
        //1. Insert
        for (int i = 0; i < 10; i++) {
            list.add(
                    new Random().nextInt(100) % 101
            );
        }
        System.out.println(list);
        var list1 = List.of(1, 2, 3);
        list.addAll(list1);
        System.out.println(list);
        //2. Delete
        list.remove();
        System.out.println(list);
        list.removeIf(n -> (n % 2 == 0));
        System.out.println(list);
        //3. Search
        System.out.println(list.contains(5));
        //4. Sort
        list.sort((o1, o2) -> -Integer.compare(o1, o2));
        System.out.println(list);
        /*
        list.sort((o1, o2) -> -Integer.compare(o1,o2));
        for descending order
        */
        //5. Traverse


    }
}

