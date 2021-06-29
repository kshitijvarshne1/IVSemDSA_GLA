/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 29-Jun-21
 *   Time: 10:08 AM
 *   File: CalculatorImplememtation.java
 */

package June.jun29_21.one;

public class CalculatorImplementation implements Calculator {
    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a * b;
    }

    @Override
    public int division(int a, int b) {
        if (a >= b) {
            return a / b;
        } else {
            return 0;
        }
    }
}

