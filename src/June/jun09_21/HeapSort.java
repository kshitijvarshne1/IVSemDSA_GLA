/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Jun-21
 *   Time: 3:26 PM
 *   File: HeapSort.java
 */

package June.jun09_21;

import java.util.Arrays;

public class HeapSort {
    public int[] arr;
    public int currSize;
    public int capacity;

    public HeapSort(int[] arr, int capacity) {
        this.arr = new int[capacity];
        this.currSize = 0;
        this.capacity = capacity;
    }

    public void insert(int value) {
        if (currSize == capacity) return;

        currSize++;
        arr[currSize - 1] = value;

        for (int i = currSize - 1; i != 0 && arr[parent(i)] > arr[i]; ) {

            int k = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = k;
            i = parent(i);
        }
    }

    public int left(int i) {
        return (2 * i + 1);
    }

    public int right(int i) {
        return (2 * i + 2);
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}

