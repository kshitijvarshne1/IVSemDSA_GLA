/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 28-May-21
 *   Time: 5:21 PM
 *   File: EmployeeLeaveCalculator.java
 */

package May.may28_21;

import java.util.ArrayList;
import java.util.List;

public class EmployeeLeaveCalculator {
    public List<Short> getDefaultEmployeeIDList(List<Employee> employeeList) {
        List<Short> result = new ArrayList<>();
        for (Employee e : employeeList) {
            if (e.getNoOfLeaves() > 25) {
                result.add(e.getId());
                e.setSalary(e.getSalary() * .01 + e.getSalary());
            }
        }
        return result;
    }

    public ArrayList<String> getNumberOfLeaves(List<Employee> employeeList) {
        ArrayList<String> result = new ArrayList<>();
        for (Employee e : employeeList) {
            result.add(e.getName() + "-" + e.getNoOfLeaves());
        }
        return result;
    }
}

