/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-May-21
 *   Time: 8:20 PM
 *   File: Main.java
 */

package May.may21_21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.print();
        list.insertAtMiddle(33);
        list.print();
        list.insertAtMiddle(44);
        list.print();
        list.insertAtMiddle(55);
        list.print();
        System.out.println(list.search(44));
        System.out.println(list.search(11111));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element");
        int element = sc.nextInt();
        System.out.println(list.search(element));

    }
}

