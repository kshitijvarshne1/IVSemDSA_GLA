/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-Jun-21
 *   Time: 8:56 AM
 *   File: StudentArray.java
 */

package June.jun21_21.one;

public class StudentArray {
    Student[] arr = null;

    public StudentArray(int size) {
        arr = new Student[size];
    }

    public void insert(int index, Student s) {
        try {
            if (index < arr.length) {
                arr[index] = s;
            }
        } catch (Exception e) {
            System.out.println("index out of bound");
        }
    }
}

