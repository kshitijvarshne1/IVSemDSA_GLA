/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 01-Apr-21
 *   Time: 11:36 AM
 *   File: Main.java
 */

package April.api01_21_NK;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree btree = new BinarySearchTree();
        btree.insert(new Node(100));
        btree.insert(new Node(96));
        btree.insert(new Node(95));
        btree.insert(new Node(97));
        btree.insert(new Node(105));
        btree.insert(new Node(103));
        btree.insert(new Node(106));
        btree.insert(new Node(1));
        btree.bfsPrintLevelByLevel();
        btree.deleteANode(new Node(106));
        btree.bfsPrintLevelByLevel();
    }
}

