/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Mar-21
 *   Time: 9:30 PM
 *   File: Sample.java
 */

package March.mar20_21.one;
import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(1);
        ar.add(2);
        ar.add(1, 4);
        ar.add(4);
        System.out.println(ar.toString());

        int a1 = 4;
        int a2 = 0;
        try {
            System.out.println(a1 / a2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
