/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Mar-21
 *   Time: 4:09 PM
 *   File: SmartPhone.java
 */

package March.mar19_21_NK;

import java.util.Objects;

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

    public long getIMEINumber() {
        return IMEINumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(byte screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhone that = (SmartPhone) o;
        return getIMEINumber() == that.getIMEINumber() && Double.compare(that.getPrice(), getPrice()) == 0 && getScreenSize() == that.getScreenSize() && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIMEINumber(), getName(), getPrice(), getScreenSize());
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "IMEINumber=" + IMEINumber +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                '}';
    }

}

