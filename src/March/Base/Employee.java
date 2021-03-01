/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Mar-21
 *   Time: 10:21 AM
 *   File: Employee.java
 */

package March.Base;

public class Employee {
    private String name;
    private String designation;
    private int salary;
    private int id;

    public Employee(String name, String designation, int salary, int id) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}

