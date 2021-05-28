/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 28-May-21
 *   Time: 5:15 PM
 *   File: Employee.java
 */

package May.may28_21;

public class Employee {
    private final short id;
    private final String name;
    private double salary;
    private byte noOfLeaves;

    public Employee(short id, String name, double salary, byte noOfLeaves) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.noOfLeaves = noOfLeaves;
    }

    public short getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public byte getNoOfLeaves() {
        return noOfLeaves;
    }

    public void setNoOfLeaves(byte noOfLeaves) {
        this.noOfLeaves = noOfLeaves;
    }
}

