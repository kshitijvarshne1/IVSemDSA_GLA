/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Feb-21
 *   Time: 4:34 PM
 *   File: MorseCode.java
 */

package feb18_21.one;

public class MorseCode {
    public static void main(String[] args) {
        System.out.println(converter("CANTEEN"));
    }

    private static StringBuilder converter(String s) {
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int k = c - 'A';
            result.append(morseCode[k]);
        }
        return result;
    }

}

