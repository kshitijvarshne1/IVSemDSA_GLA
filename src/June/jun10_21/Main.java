/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Jun-21
 *   Time: 5:27 PM
 *   File: Main.java
 */

package June.jun10_21;

public class Main {
    public static void main(String[] args) {
        HeapSort hs = new HeapSort(9);
        hs.insert(10);
        hs.insert(20);
        hs.insert(15);
        hs.insert(40);
        hs.insert(50);
        hs.insert(100);
        hs.insert(25);
        hs.insert(45);
        System.out.println(hs);
        hs.insert(12);
        System.out.println(hs);

    }
}

