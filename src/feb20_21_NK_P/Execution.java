/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-Feb-21
 *   Time: 4:38 PM
 *   File: Execution.java
 */

package feb20_21_NK_P;

public class Execution {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        for (int i = 0; i < 5; i++) {
            list.insertAtEnd(new Node(i));
        }
        list.print();
        list.deleteAtBegin();
        list.print();
        list.deleteAtEnd();
        list.print();
        list.printReverse();
    }
}

