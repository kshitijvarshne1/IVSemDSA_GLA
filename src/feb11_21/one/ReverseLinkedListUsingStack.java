/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 11-Feb-21
 *   Time: 3:54 PM
 *   File: ReverseLinkedListUsingStack.java
 */

package feb11_21.one;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ReverseLinkedListUsingStack {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        Deque<Integer> stack = new ArrayDeque<>();
        pushElementIntoStack(list, stack);
        for (var i : list) {
            System.out.println(i);
        }
    }

    public static void pushElementIntoStack(LinkedList list, Deque stack) {
        for (int i = 0; i < list.size(); i++) {
            stack.push(list.get(i));
        }
        list.clear();
        while (!stack.isEmpty()) {
            list.add(stack.poll());
        }

        return;
    }
}
