/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-Apr-21
 *   Time: 2:09 PM
 *   File: Main.java
 */

package April.api17_21_NK;


public class Main {
    public static void main(String[] args) {
        AVL tree = new AVL();
        tree.insert(new Node(100));
        tree.bfs();
        tree.insert(new Node(95));
        tree.bfs();
        tree.insert(new Node(91));
        tree.bfs();
    }

}

