/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Jun-21
 *   Time: 3:35 PM
 *   File: Main.java
 */

package June.jun09_21;

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

