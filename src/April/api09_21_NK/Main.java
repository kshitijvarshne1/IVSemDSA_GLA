/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-Apr-21
 *   Time: 8:29 PM
 *   File: Main.java
 */

package April.api09_21_NK;

public class Main {
    public static void main(String[] args) {
        BST btree = new BST();
        btree.insert(new Node(100));
        btree.insert(new Node(91));
        btree.insert(new Node(110));
        btree.insert(new Node(90));
        btree.insert(new Node(95));
        btree.insert(new Node(105));
        btree.insert(new Node(115));
        btree.inorder();
        //btree.delete(new Node(100));
        btree.inorderIterative();
    }
}

