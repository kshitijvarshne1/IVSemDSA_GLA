/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Mar-21
 *   Time: 4:31 PM
 *   File: Main.java
 */

package March.mar19_21_NK;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<SmartPhone> dbcMobileWala = new HashSet<>();
        dbcMobileWala.add(new SmartPhone(12345678, "Neeraj khanna", 15000, (byte) 6));
        dbcMobileWala.add(new SmartPhone(12345678, "dbc", 12000, (byte) 6));
        dbcMobileWala.add(new SmartPhone(12345678, "Sharad", 9000, (byte) 4));
        dbcMobileWala.add(new SmartPhone(12345678, "Vaibhav", 11000, (byte) 7));
        dbcMobileWala.add(new SmartPhone(12345678, "Mandeep", 10002, (byte) 7));
        dbcMobileWala.add(new SmartPhone(12345678, "Vinay", 12000, (byte) 6));
        dbcMobileWala.add(new SmartPhone(12345678, "Pankaj", 11000, (byte) 3));
        dbcMobileWala.add(new SmartPhone(98765432, "Suresh", 1500000, (byte) 8));

        OnlineShop onlineShop = new OnlineShop();
        List<SmartPhone> result = onlineShop.getListOfSmartPhones(dbcMobileWala, (byte) 5);
        for (SmartPhone smartPhone : result) {
            System.out.println(smartPhone);
        }

    }
}

