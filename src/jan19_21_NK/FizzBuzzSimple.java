/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 26-Jan-21
 *   Time: 7:39 PM
 *   File: FizzBuzzSimple.java
 */

package jan19_21_NK;

import java.util.Scanner;

public class FizzBuzzSimple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lastLimit = sc.nextInt();
        sc.close();
        int three = 0;
        int five = 0;
        for (int i = 1; i < lastLimit; i++) {
            three++;
            five++;
            if (three != 3 && five != 5) {
                System.out.print(i + " ");
            }
            if (three == 3) {
                System.out.print("Fizz ");
                three = 0;
            }
            if (five == 5) {
                System.out.print("Buzz ");
                five = 0;
            }


        }

    }
}

