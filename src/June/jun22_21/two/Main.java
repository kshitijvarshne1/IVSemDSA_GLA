/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 22-Jun-21
 *   Time: 9:25 AM
 *   File: Main.java
 */

package June.jun22_21.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueUsingArray qa = new QueueUsingArray(5);
        qa.enqueue(5);
        qa.peek();
        qa.enqueue(33);
        qa.enqueue(3);
        qa.dequeue();
        qa.dequeue();
        QueueUsingLinkedList ql = new QueueUsingLinkedList();
        Scanner sc = new Scanner(System.in);
        show();
        int k = sc.nextInt();
        while (true) {
            switch (k) {
                case 1:
                    System.out.println("Enter the id");
                    int id = sc.nextInt();
                    System.out.println("Enter the name");
                    String name = sc.next();
                    System.out.println("Enter the salary:- ");
                    int salary = sc.nextInt();
                    ql.enqueue(new Node(new Employee(id, name, salary)));
                    break;
                case 2:
                    ql.dequeue();
                    break;
                case 3:
                    ql.peek();
                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    System.out.println("please input 1- 4 ");
                    break;
            }
            show();
            k = sc.nextInt();
        }

    }

    public static void show() {
        System.out.println("1. add a node");
        System.out.println("2. delete a node");
        System.out.println("3. show topmost node");
        System.out.println("4. exit");
    }
}

