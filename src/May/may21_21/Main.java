/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-May-21
 *   Time: 8:20 PM
 *   File: Main.java
 */

package May.may21_21;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtEnd(3);

        list.print();
        list.insertAtNPosition(new Node(9999), 2);
        list.print();
    }
}

