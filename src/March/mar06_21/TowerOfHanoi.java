/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 06-Mar-21
 *   Time: 1:22 AM
 *   File: TowerOfHanoi.java
 */

package March.mar06_21;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfDisc = sc.nextInt();
        towerOfHanoi(numberOfDisc, 'A', 'H', 'D');
    }

    public static void towerOfHanoi(int n, char s, char h, char d) {
        if (n >= 1) {
            towerOfHanoi(n - 1, s, d, h);
            System.out.println(n + " " + s + " -> " + d);
            towerOfHanoi(n - 1, h, s, d);
        }

    }
}

