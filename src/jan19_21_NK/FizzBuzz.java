/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Jan-21
 *   Time: 5:18 PM
 *   File: FizzBuzz.java
 */

package jan19_21_NK;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long lastNumber = sc.nextLong();
        StringBuffer result = new StringBuffer();
        long three = 0;
        long five = 0;
        for (long i = 1; i < lastNumber; i++) {
            three += 1;
            five += 1;
            if (three != 3 && five != 5) {
                System.out.print(" " + i + " ");
                result.append(" ");
                result.append(String.valueOf(i));
                result.append(" ");
            }
            if (three == 3) {
                three = 0;
                System.out.print("Fizz ");
                result.append("Fizz ");
            }
            if (five == 5) {
                five = 0;
                System.out.print("Buzz ");
                result.append("Buzz ");
            }
        }
        //System.out.println();
        System.out.println(result);
    }
}

