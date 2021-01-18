/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Jan-21
 *   Time: 11:28 AM
 *   File: StudentMain.java
 */

package jan18_21_NK.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for all the object :- ");
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
        System.out.println("Enter any valur for start the program rather than -1 :-");
        int var = sc.nextInt();
        System.out.println("enter the value for start the program" +
                "\n"
                + "enter 1 for find the average of all marks" + '\n'
                + "enter 2 for show all the objects" + '\n'
                + "enter -1 for terminate the program");
        while (var != -1) {
            var = sc.nextInt();
            switch (var) {
                case 1:
                    int sum = 0;
                    for (int i = 0; i < limit; i++) {
                        sum += studentArray[i].getMarks();

                    }
                    float average = sum / limit;
                    System.out.println("Average :- " + average);
                    break;
                case 2:
                    for (int i = 0; i < limit; i++) {
                        System.out.println(studentArray[i]);
                    }
                    break;
            }
        }
    }
}

