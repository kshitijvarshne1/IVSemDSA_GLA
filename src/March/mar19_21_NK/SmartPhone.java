/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Mar-21
 *   Time: 4:09 PM
 *   File: SmartPhone.java
 */

package March.mar19_21_NK;

public class SmartPhone {
    private final long IMEINumber;
    private final String name;
    private double price;
    private byte screenSize;

    public SmartPhone(long IMEINumber, String name, double price, byte screenSize) {
        this.IMEINumber = IMEINumber;
        this.name = name;
        this.price = price;
        this.screenSize = screenSize;
    }
}

