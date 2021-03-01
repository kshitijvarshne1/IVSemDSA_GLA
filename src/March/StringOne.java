/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Mar-21
 *   Time: 10:53 AM
 *   File: StringOne.java
 */

package March;

import java.util.Arrays;
import java.util.Scanner;

public class StringOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            arr[i] = (int) temp;
        }
        Arrays.sort(arr);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {

            result.append((char) arr[i]);
        }
        System.out.println(result);

    }
}

