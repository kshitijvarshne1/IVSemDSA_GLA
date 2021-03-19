/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Mar-21
 *   Time: 4:16 PM
 *   File: OnlineShop.java
 */

package March.mar19_21_NK;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class OnlineShop {

    public List<SmartPhone> getListOfSmartPhones(Set<SmartPhone> smartPhones, byte requiredScreenSize) {
        List<SmartPhone> smartPhoneList = new ArrayList<>();
        for (SmartPhone smartPhone : smartPhones) {
            if (smartPhone.getScreenSize() >= requiredScreenSize) {
                smartPhoneList.add(smartPhone);
            } else {
                smartPhone.setPrice(smartPhone.getPrice() - smartPhone.getPrice() * 0.1);
            }
        }
        return smartPhoneList;
    }
}

