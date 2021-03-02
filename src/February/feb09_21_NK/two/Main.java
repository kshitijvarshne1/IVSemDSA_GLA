/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 03-Mar-21
 *   Time: 1:28 AM
 *   File: Main.java
 */

package February.feb09_21_NK.two;

public class Main {
    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray(5);
        st.push(5);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        st.push(56);
        st.push(4);
        st.push(52);
        st.push(51);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.pop();
        System.out.println(st.isFull());
        System.out.println(st.isEmpty());

    }
}

