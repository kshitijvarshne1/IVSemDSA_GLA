/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Jan-21
 *   Time: 10:52 PM
 *   File: Main.java
 */

package jan18_21_NK.HW.one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size :- ");
        int size = sc.nextInt();
        Array array;
        array = new Array(size);
        array.initialise();
        System.out.println("Enter " + size + " elements :- ");
        for (int i = 0; i < size; i++) {
            int k = sc.nextInt();
            array.insert(i, k);
        }
        array.print();
    }
}

class Array {
    int[] arr;

    public Array(int size) {
        arr = new int[size];
    }

    public void initialise() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int value) {
        if (arr[index] == Integer.MIN_VALUE) {
            arr[index] = value;
        }
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}



