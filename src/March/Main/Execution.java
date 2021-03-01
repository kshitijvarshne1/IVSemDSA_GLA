/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Mar-21
 *   Time: 10:35 AM
 *   File: Execution.java
 */

package March.Main;

import March.Base.Employee;
import March.Base.Node;
import March.Base.StorageDetail;

import java.util.ArrayList;

public class Execution {
    public static void main(String[] args) {
        ArrayList<Employee> arr = new ArrayList<>();
        arr.add(new Employee("ksh", "Manger", 50000, 1));
        arr.add(new Employee("Aman", "HR", 20000, 2));
        arr.add(new Employee("Shah", "Peon", 10000, 3));
        arr.add(new Employee("Tam", "Founder", 150000, 4));
        arr.add(new Employee("Cam", "C0Founder", 120000, 5));

        StorageDetail details = new StorageDetail();
        for (Employee employee : arr) {
            details.enqueue(new Node(employee));
        }

        details.print();
    }
}

