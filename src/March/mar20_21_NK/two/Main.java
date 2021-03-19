/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-Mar-21
 *   Time: 2:14 AM
 *   File: Main.java
 */

package March.mar20_21_NK.two;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person einstein = new Person(1, "Einsten", (byte) 5);
        Person hawking = new Person(2, "Hawking", (byte) 7);
        /*System.out.println(einstein.compareTo(hawking));*/
        Person[] people = new Person[10];
        for (int i = 0; i < 10; i++) {
            people[i] = new Person(
                    (int) (Math.random() * 100),
                    "Name" + i,
                    (byte) (i + 10)
            );
        }
        /*System.out.println(Arrays.toString(people));
        System.out.println();
         Arrays.sort(people);
        System.out.println(Arrays.toString(people));*/
        // Arrays.sort(people);
        System.out.println(Arrays.toString(people));
    }
}

