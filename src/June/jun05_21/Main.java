/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 05-Jun-21
 *   Time: 3:02 PM
 *   File: Main.java
 */

package June.jun05_21;

public class Main {
    public static void main(String[] args) {
        AStack stack = new AStack(4);
        stack.push(2);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}

