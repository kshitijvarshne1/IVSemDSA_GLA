/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 26-May-21
 *   Time: 8:10 PM
 *   File: Main.java
 */

package May.may26_21;

public class Main {
    public static void main(String[] args) {
        DLinkedList dl = new DLinkedList();
        dl.insertAtEnd(new Node(11));
        dl.print();
        dl.insertAtEnd(new Node(221));
        dl.print();
        dl.insertAtBegin(new Node(33));
        dl.print();
        dl.deleteAtEnd();
        dl.print();
    }
}

