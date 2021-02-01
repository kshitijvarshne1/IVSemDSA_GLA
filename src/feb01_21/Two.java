/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Feb-21
 *   Time: 10:47 AM
 *   File: Two.java
 */

package feb01_21;

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        int index = 5;
        int value = 55;
        int[] a = {1, 2, 3, 4, 5};
        int[] temp = insert(a, index, value);
        System.out.println(Arrays.toString(temp));
    }

    public static int[] insert(int[] a, int index, int value) {
        int temp[] = new int[a.length + 1];
        if (a.length <= index) {
            for (int i = 0; i < a.length; i++) {
                temp[i] = a[i];
            }
            temp[a.length] = value;
            return temp;
        } else {
            int i = 0;
            int k = 0;
            while (i <= a.length) {
                if (i == index) {
                    temp[i] = value;
                    k -= 1;
                } else {
                    temp[i] = a[k];
                }
                i += 1;
                k += 1;
            }
        }
        return temp;
    }
}

