/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Jan-21
 *   Time: 10:26 AM
 *   File: Student.java
 */

package jan18_21_NK.one;

public class Student {
    private String universityName;
    private String nameOfStream;
    private int id;
    private int marks;
    private String studentName;

    public Student(String universityName, String nameOfStream, int id, int marks, String studentName) {
        this.universityName = universityName;
        this.nameOfStream = nameOfStream;
        this.id = id;
        this.marks = marks;
        this.studentName = studentName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getNameOfStream() {
        return nameOfStream;
    }

    public void setNameOfStream(String nameOfStream) {
        this.nameOfStream = nameOfStream;
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
}

