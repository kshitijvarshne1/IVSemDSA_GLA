/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Feb-21
 *   Time: 10:32 AM
 *   File: One.java
 */

package feb01_21_NK;

public class One {
    public static void main(String[] args) {
        int[] arr = {5, 2, 99, 7, 6, 11, 55, 7, 8};
        int[] temp = minAndMax(arr);
        System.out.println("Max Element " + temp[0] + " Min element " + temp[1]);

    }

    public static int[] minAndMax(int[] arr) {
        int[] temp = new int[2];
        int maxEle = Integer.MIN_VALUE;
        int minEle = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxEle = Math.max(maxEle, arr[i]);
            minEle = Math.min(minEle, arr[i]);
            System.out.println(maxEle + " " + minEle);
        }
        temp[0] = maxEle;
        temp[1] = minEle;
        return temp;
    }
}

