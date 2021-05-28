/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 28-May-21
 *   Time: 5:24 PM
 *   File: Main.java
 */

package May.may28_21;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee((short) 1, "John", 600.0, (byte) 33));
        employeeList.add(new Employee((short) 2, "sam", 60.0, (byte) 1));
        employeeList.add(new Employee((short) 3, "tan", 900.0, (byte) 93));
        employeeList.add(new Employee((short) 4, "panm", 660.0, (byte) 9));
        employeeList.add(new Employee((short) 5, "kiki", 1000.0, (byte) 3));

        EmployeeLeaveCalculator e = new EmployeeLeaveCalculator();
        System.out.println(e.getDefaultEmployeeIDList(employeeList).toString());

        System.out.println(e.getNumberOfLeaves(employeeList).toString());


    }
}

