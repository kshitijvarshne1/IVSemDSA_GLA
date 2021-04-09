/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 09-Apr-21
 *   Time: 10:31 PM
 *   File: Main.java
 */

package April.api09_21_NK.one;

public class Main {
    public static void main(String[] args) {
        BST btree = new BST();
        btree.insert(new Node(100));
        btree.insert(new Node(95));
        btree.insert(new Node(110));
        btree.inorder();
    }
}

