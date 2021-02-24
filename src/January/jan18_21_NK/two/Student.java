/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Jan-21
 *   Time: 11:26 AM
 *   File: Student.java
 */

package January.jan18_21_NK.two;

import java.util.Objects;

public class Student {
    private static String universityName;
    private static String nameOfStream;

    static {
        universityName = "GLA";
        nameOfStream = "B.Tech";
    }

    private int id;
    private int marks;
    private String studentName;

    public Student(int id, int marks, String studentName) {
        this.id = id;
        this.marks = marks;
        this.studentName = studentName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getNameOfStream() {
        return nameOfStream;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getId() == student.getId() && getMarks() == student.getMarks() && Objects.equals(getStudentName(), student.getStudentName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMarks(), getStudentName());
    }

    @Override
    public String toString() {
        return "Student {  " +
                "id=" + id +
                ", marks=" + marks +
                ", studentName='" + studentName +
                " }";
    }
}

