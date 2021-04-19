/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 19-Apr-21
 *   Time: 2:29 PM
 *   File: Main.java
 */

package April.api19_21_NK;

public class Main {
    public static void main(String[] args) {
        BST bstree = new BST();
        bstree.insert(new Node(100));
        bstree.bfs();
        bstree.insert(new Node(90));
        bstree.bfs();
        bstree.insert(new Node(110));
        bstree.bfs();
    }
}

