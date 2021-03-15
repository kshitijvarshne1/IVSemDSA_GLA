/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 02-Mar-21
 *   Time: 7:51 PM
 *   File: Execution.java
 */

package March.mar02_21_NK.one;

public class Execution {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertAtEnd(new Node(5));
        ll.insertAtBegin(new Node(4));
        ll.insertAtEnd(new Node(6));
        ll.insertAtEnd(new Node(2));
        //ll.print();
        //ll.sorting();
        //ll.print();
        //System.out.println(countNumberOfNodes(ll.head));
        //mergeSort(ll.head);
        //ll.print();
        //ll.sorting();
        //ll.reverse();
        //ll.print();
        //System.out.println(ll.search(new Node(5)));
        ll.print();
        ll.addNodeOnKPosition(0, new Node(111));
        ll.print();
        ll.addNodeOnKPosition(1, new Node(1222));
        ll.print();
        ll.addNodeOnKPosition(2, new Node(4343));
        ll.print();
        ll.addNodeOnKPosition(100, new Node(3331));
        ll.print();

    }

    private static int countNumberOfNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNumberOfNodes(node.next);
    }
    //merge sort method is incomplete
    public static Node getMiddle(Node a) {
        if (a == null) {
            return a;
        }
        Node slow = a;
        Node fast = a;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node sortedMerge(Node a, Node b) {
        Node result = null;
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    public static Node mergeSort(Node a) {
        if (a == null || a.next == null) {
            return a;
        }
        Node middle = getMiddle(a);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(a);
        Node right = mergeSort(nextOfMiddle);
        Node sortedList = sortedMerge(left, right);
        return sortedList;
    }
}

