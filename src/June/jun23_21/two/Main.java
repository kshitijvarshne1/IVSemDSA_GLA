/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 23-Jun-21
 *   Time: 9:22 AM
 *   File: Main.java
 */

package June.jun23_21.two;

public class Main {
    public static void main(String[] args) {
        BSTree bsTree = new BSTree();
        bsTree.insert(new Node(100));
        bsTree.bfs();
        bsTree.insert(new Node(95));
        bsTree.bfs();
        bsTree.insert(new Node(105));
        bsTree.bfs();
        bsTree.insert(new Node(85));
        bsTree.bfs();
        bsTree.insert(new Node(97));
        bsTree.bfs();
    }
}

