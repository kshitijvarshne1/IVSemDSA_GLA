/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Mar-21
 *   Time: 10:56 PM
 *   File: Main.java
 */

package March.mar08_21_NK;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertAtBegin(new Node(new Student("adi", 2)));
        ll.insertAtEnd(new Node(new Student("di", 1)));
        ll.print();
        ll.sorting();
        ll.print();
    }
}

