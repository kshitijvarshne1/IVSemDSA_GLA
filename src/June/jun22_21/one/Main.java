/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 22-Jun-21
 *   Time: 8:28 AM
 *   File: Main.java
 */

package June.jun22_21.one;

public class Main {
    public static void main(String[] args) {
        StackUsingArray sa = new StackUsingArray(5);
        sa.push(3);
        sa.push(1);
        sa.push(6);
        System.out.println(sa.peek());
        System.out.println(sa.pop());
        System.out.println(sa.peek());
        System.out.println(sa.pop());
        System.out.println(sa.peek());
        System.out.println(sa.pop());
        System.out.println(sa.peek());
    }

}

