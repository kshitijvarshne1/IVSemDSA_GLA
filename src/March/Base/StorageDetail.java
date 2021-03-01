/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Mar-21
 *   Time: 10:26 AM
 *   File: StorageDetail.java
 */

package March.Base;

public class StorageDetail {
    public Node head;

    public StorageDetail() {
        this.head = null;
    }

    public void enqueue(Node newNode) {
        if (isEmpty() || newNode.data.getSalary() > head.data.getSalary()) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data.getSalary() >= newNode.data.getSalary()) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data.getName() + " " + temp.data.getDesignation() + " " + temp.data.getSalary() + " " + temp.data.getId());
                temp = temp.next;
            }
            System.out.println();
            return;
        }
        System.out.println("Empty");
    }

}

