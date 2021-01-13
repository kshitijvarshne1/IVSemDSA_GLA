/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 13-Jan-21
 *   Time: 1:18 PM
 *   File: ListDemo.java
 */

package jan13_21;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        //Traverse type
        //1.Using a loop(indexed for loop)
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        //2. using enhanced for loop
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }
        System.out.println();
        //3.using collection framework
        System.out.println(list1);
        //4.using lambda programming
        list1.stream().forEach(element -> System.out.println(element + " "));
        //OR
        /*
        list1.stream().forEach(
                System.out::println
        );
        */

        //linkedlist
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(4);
        list2.add(3);
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();
    }
}
