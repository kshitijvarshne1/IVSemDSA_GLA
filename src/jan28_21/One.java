/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 28-Jan-21
 *   Time: 12:14 PM
 *   File: One.java
 */

package jan28_21;

import java.util.HashMap;
import java.util.Map;

public class One {
    public static final int MAX_UNICODE = 65_535;

    public static void main(String[] args) {
        System.out.println(checkWhetherStringIsUnique("competitive programming"));
    }

    public static boolean checkWhetherStringIsUnique(String string) {
        boolean response = true;
        Map<Character, Boolean> characters = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.codePointAt(i) < MAX_UNICODE && Character.isWhitespace(string.charAt(i)) == false) {
                char temp = string.charAt(i);
                if (characters.get(temp) == null) {
                    characters.put(temp, true);
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}

