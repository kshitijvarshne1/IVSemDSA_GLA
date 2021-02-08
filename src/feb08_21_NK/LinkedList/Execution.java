/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Feb-21
 *   Time: 11:00 AM
 *   File: Execution.java
 */

package feb08_21_NK.LinkedList;


public class Execution {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 0; i < 5; i++) {
            list.insertAtBegin(new Node(i));
        }
        list.printSinglyLinkedList();
        Node n1 = new Node(1000);
        list.insertAtEnd(n1);
        list.printSinglyLinkedList();
    }

}

