/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Feb-21
 *   Time: 11:10 AM
 *   File: Main.java
 */

package February.feb01_21_NK.four;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final int LIMIT = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[LIMIT];
        for (int i = 0; i < LIMIT; i++) {
            int stuRollNo = sc.nextInt();
            sc.nextLine();
            String stuName = sc.nextLine();
            int[] stuSubjects = new int[3];
            for (int i1 = 0; i1 < 3; i1++) {
                stuSubjects[i1] = sc.nextInt();
            }
            students[i] = new Student(stuRollNo, stuName, stuSubjects);
        }
        int[] result = calResult(students);
        System.out.println(Arrays.toString(result));
    }

    public static int[] calResult(Student[] student) {
        int[] temp = new int[LIMIT];
        for (int i = 0; i < LIMIT; i++) {
            int result = 0;
            int[] stuarr = student[i].getSubjects();
            for (int i1 = 0; i1 < 3; i1++) {
                if (stuarr[i1] < 40) {
                    result += 1;
                }
            }
            temp[i] = result;
        }
        return temp;
    }
}

