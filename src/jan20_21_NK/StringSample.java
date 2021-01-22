/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-Jan-21
 *   Time: 9:46 PM
 *   File: StringSample.java
 */

package jan20_21_NK;

import java.util.Scanner;

public class StringSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1;
        String[] s2;
        s1 = new String[10];
        s2 = new String[10];
        for (int i = 0; i < 10; i++) {
            s1[i] = sc.nextLine();
            s2[i] = sc.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            if (s1[i].equals(s2[i])) {
                System.out.println(s1[i]);
            } else {
                System.out.println(s1[i] + " " + s2[i]);
            }
        }
        /*for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; i++) {
                if (s1[i].equals(s2[i])) {
                    System.out.println(s1[i]);
                } else {
                    System.out.println(s1[i] + " " + s2[i]);
                }
            }
        }*/
    }
}

