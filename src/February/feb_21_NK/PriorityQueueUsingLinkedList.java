/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Feb-21
 *   Time: 3:16 PM
 *   File: PriorityQueueUsingLinkedList.java
 */

package February.feb_21_NK;

public class PriorityQueueUsingLinkedList {
    public Node head;

    public PriorityQueueUsingLinkedList(Node head) {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void dequeue(Node newNode) {
        if (!isEmpty() && newNode.priority < head.priority) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.priority <= newNode.priority) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "{ " + temp.priority + " }" + " -> ");
            }
            System.out.println();
            return;
        }
        System.out.println("Queue is empty");
    }

}

