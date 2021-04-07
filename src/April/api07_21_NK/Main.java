/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 07-Apr-21
 *   Time: 10:48 PM
 *   File: Main.java
 */

package April.api07_21_NK;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree btree = new BinarySearchTree();
        btree.insert(new Node(100));
        btree.insert(new Node(92));
        btree.insert(new Node(109));
        btree.insert(new Node(88));
        btree.insert(new Node(96));
        btree.insert(new Node(105));
        btree.insert(new Node(111));
        btree.inorder();
    }
}

