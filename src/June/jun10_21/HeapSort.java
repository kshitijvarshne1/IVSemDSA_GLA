/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Jun-21
 *   Time: 5:24 PM
 *   File: HeapSort.java
 */

package June.jun10_21;

public class HeapSort {
    public int[] arr;
    public int currSize;
    public int capacity;

    public HeapSort(int capacity) {
        this.arr = new int[capacity];
        this.currSize = 0;
        this.capacity = capacity;
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
}

