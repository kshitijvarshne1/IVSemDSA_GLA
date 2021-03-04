/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Mar-21
 *   Time: 8:33 PM
 *   File: Main.java
 */

package March.mar04_21;

public class Main {
    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray(5);
        System.out.println(st.isEmpty());
        st.push(1);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.peek();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(8);
        System.out.println(st.isEmpty());
        System.out.println(st.isFull());
        st.pop();
        System.out.println(st.isFull());
    }
}

