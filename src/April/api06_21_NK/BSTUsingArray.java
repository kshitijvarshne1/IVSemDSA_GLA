/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 06-Apr-21
 *   Time: 11:29 PM
 *   File: BSTUsingArray.java
 */

package April.api06_21_NK;

public class BSTUsingArray {
    public Integer[] arr;

    public BSTUsingArray(int size) {
        arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
    }

    public void insert(int data) {
        if (arr[0] == null) {
            arr[0] = data;
        } else {
            insert(0, data);
        }
    }

    private void insert(int root, int data) {
        if (arr[root] == null) {
            return;
        }
        if (data <= arr[root]) {
            if (arr[root * 2 + 1] == null) {
                arr[root * 2 + 1] = data;
                return;
            } else {
                insert(root * 2 + 1, data);
            }
        } else {
            if (arr[root * 2 + 2] == null) {
                arr[root * 2 + 2] = data;
            } else {
                insert(root * 2 + 2, data);
            }
        }
    }

    public void inorder() {
        inorder(0);
    }

    private void inorder(int root) {
        if (arr[root] == null) {
            return;
        }
        insert(root * 2 + 1);
        System.out.print(arr[root] + " ");
        insert(root * 2 + 2);
    }
}

