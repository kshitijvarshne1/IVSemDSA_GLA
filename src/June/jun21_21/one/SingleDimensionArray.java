/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-Jun-21
 *   Time: 8:48 AM
 *   File: SingleDimensionArray.java
 */

package June.jun21_21.one;

public class SingleDimensionArray {
    int[] arr = null;

    public SingleDimensionArray(int size) {
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int element) {
        try {
            if (index < arr.length) {
                arr[index] = element;
            }
        } catch (Exception e) {
            System.out.println("Index out of bound");
        }
    }

    public int getElement(int index) {
        try {
            if (index < arr.length) {
                return arr[index];
            }
        } catch (Exception e) {
            System.out.println("Index out of bound");
        }
        return Integer.MIN_VALUE;
    }

    public void delete(int index) {
        try {
            if (index < arr.length) {
                arr[index] = Integer.MIN_VALUE;
            }
        } catch (Exception e) {
            System.out.println("Index out of bound");
        }
    }

    public void deleteArray() {
        arr = null;
    }

    public void traverse() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

