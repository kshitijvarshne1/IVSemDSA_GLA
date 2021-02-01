/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Feb-21
 *   Time: 11:10 AM
 *   File: Student.java
 */

package feb01_21_NK.four;

public class Student {
    private int stuRollNo;
    private String stuName;
    private int[] subjects;

    public Student(int stuRollNo, String stuName, int[] subjects) {
        this.stuRollNo = stuRollNo;
        this.stuName = stuName;
        this.subjects = subjects;
    }

    public int getStuRollNo() {
        return stuRollNo;
    }

    public void setStuRollNo(int stuRollNo) {
        this.stuRollNo = stuRollNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int[] getSubjects() {
        return subjects;
    }

    public void setSubjects(int[] subjects) {
        this.subjects = subjects;
    }
}

