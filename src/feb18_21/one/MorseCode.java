/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 18-Feb-21
 *   Time: 4:34 PM
 *   File: MorseCode.java
 */

package feb18_21.one;

import java.util.HashMap;

public class MorseCode {
    public static void main(String[] args) {
        System.out.println(converter("ADITYA"));
        System.out.println(morseCodeToCode(".- -.. .. - -.-- .-"));
    }

    private static StringBuilder converter(String s) {
        String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int k = c - 'A';
            result.append(morseCode[k] + " ");
        }
        return result;
    }

    private static StringBuilder morseCodeToCode(String s) {
        StringBuilder result = new StringBuilder();
        HashMap<String, Character> morseCode = new HashMap<>();
        String[] morseCodeTable = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        for (int i = 0; i < 26; i++) {
            char c = (char) (i + 'A');
            morseCode.put(morseCodeTable[i], c);
        }
        String[] a = s.split(" ");
        for (int i = 0; i < a.length; i++) {
            result.append(morseCode.get(a[i]));
        }
        return result;
    }

}

