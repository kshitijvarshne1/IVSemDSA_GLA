/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 26-Jun-21
 *   Time: 1:10 PM
 *   File: SinglyLinkedList.java
 */

package June.jun26_21;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insertAtEnd(Node newNode) {
        if (head == null) {
            head = newNode;
        } else {
            Node tmp = this.head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }
            tmp.setNext(newNode);
        }
    }

    public void insertAtBeginning(Node newNode) {
        newNode.setNext(head);
        head = newNode;
    }

    public void traverse() {
        if (head != null) {
            Node tmp = this.head;
            while (tmp != null) {
                System.out.print(tmp.getData() + " -> ");
                tmp = tmp.getNext();
            }
            System.out.println();
        }
    }

    public void getMinAndMax() {
        if (head != null) {
            int maxEle = head.getData();
            int minEle = head.getData();
            Node tmp = head;
            while (tmp != null) {
                maxEle = Integer.max(maxEle, tmp.getData());
                minEle = Integer.min(minEle, tmp.getData());
                tmp = tmp.getNext();
            }
            System.out.println("Minimum element :- " + minEle);
            System.out.println("Maximum Element :- " + maxEle);
        } else {
            System.out.println("linked list is empty");
        }
    }
}

