/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 21-Mar-21
 *   Time: 10:32 PM
 *   File: MobilePhone.java
 */

package March.mar21_21_NK.one;

public class MobilePhone {
    public int balance;

    public MobilePhone(int balance) {
        this.balance = balance;
    }

    public void sendTextMessage(long recipientContactNumber, String message) throws LowBalanceException {
        if (this.balance <= 1.5) {
            throw new LowBalanceException("Balance is low");
        } else {
            getLoan();
        }
    }

    public void getLoan() {
        this.balance += 10;
    }

}

