/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-Jun-21
 *   Time: 8:55 AM
 *   File: Main.java
 */

package June.jun21_21.one;

public class Main {
    public static void main(String[] args) {
        SingleDimensionArray a1 = new SingleDimensionArray(5);
        a1.insert(2, 102);
        a1.traverse();
        a1.insert(1, 99);
        a1.insert(0, 3);
        a1.insert(4, 43);
        a1.delete(1);
        a1.traverse();

        StudentArray s1 = new StudentArray(5);
        s1.insert(2, new Student(4, "Sam"));
        s1.traverse();
        s1.insert(1, new Student(1, "lam"));
        s1.insert(4, new Student(3, "dude"));
        s1.deleteStudent(2);
        s1.traverse();

    }
}

