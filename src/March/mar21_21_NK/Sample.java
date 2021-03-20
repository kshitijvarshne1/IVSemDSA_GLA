/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 20-Mar-21
 *   Time: 3:12 AM
 *   File: Sample.java
 */

package March.mar21_21_NK;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\d{4}[ ]\\d{4}[ ]\\d{4}$");
        Matcher matcher = pattern.matcher("1234 5678 9876");
        System.out.println(matcher.matches());
    }
}

