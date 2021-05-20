/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-May-21
 *   Time: 6:55 PM
 *   File: Main.java
 */

package May.may20_21.linkedlist;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertAtEnd(new Node(4));
        list.print();
        list.insertAtEnd(new Node(5));
        list.print();
        list.insertAtEnd(new Node(6));
        list.print();
    }

}

