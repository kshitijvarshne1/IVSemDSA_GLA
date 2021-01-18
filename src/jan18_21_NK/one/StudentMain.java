/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Jan-21
 *   Time: 10:29 AM
 *   File: StudentMain.java
 */

package jan18_21_NK.one;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        Student[] studentArray = new Student[5];
        for (int i = 0; i < limit; i++) {
            int id = sc.nextInt();
            int marks = sc.nextInt();
            sc.nextLine();
            String studentName = sc.nextLine();
            Student obj = new Student(id, marks, studentName);
            studentArray[i] = obj;
        }
        sc.close();
        int sum = 0;
        for (int i = 0; i < limit; i++) {
            sum += studentArray[i].getMarks();

        }
        float average = sum / limit;
        System.out.println("Average :- " + average);
    }
}

