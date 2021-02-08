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
        Node n1 = new Node(1);
        list.insertAtBegin(n1);
        Node n2 = new Node(2);
        list.insertAtBegin(n2);
        list.printSinglyLinkedList();
    }

}

