/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Jan-21
 *   Time: 10:29 AM
 *   File: StudentMain.java
 */

package jan18_21_NK.one;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int id = 0;
        int marks = 0;
        String studentName = null;
        Student[] studentArray = new Student[limit];
        for (int i = 0; i < limit; i++) {
            try {
                id = sc.nextInt();
                marks = sc.nextInt();
                sc.nextLine();
                studentName = sc.nextLine();
            } catch (InputMismatchException a) {
                System.out.println("Stop the program and again provide the value for object");
                a.printStackTrace();
            }
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
// for line no 28
/*
 catch(NumberFormatException a){
    sout("Any message");
    a.printStackTrace();
}
*/
