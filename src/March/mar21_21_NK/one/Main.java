/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-Mar-21
 *   Time: 10:39 PM
 *   File: Main.java
 */

package March.mar21_21_NK.one;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone(1.0f);
        try {
            mobilePhone.sendTextMessage(991888, "hello");
        } catch (LowBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

