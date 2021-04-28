/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 28-Apr-21
 *   Time: 3:59 PM
 *   File: Main.java
 */

package April.api28_21_NK;

public class Main {
    public static void main(String[] args) {
        BST bsttree = new BST();
        bsttree.insert(new Node(100));
        bsttree.bfs();
        bsttree.insert(new Node(95));
        bsttree.bfs();
        bsttree.insert(new Node(105));
        bsttree.bfs();
        bsttree.inorder();
    }
}

