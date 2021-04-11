/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 11-Apr-21
 *   Time: 12:10 PM
 *   File: Main.java
 */

package April.api_11_21;

public class Main {
    public static void main(String[] args) {
        BST bstree = new BST();
        bstree.insert(new Node(100));
        bstree.inorder();
        bstree.insert(new Node(95));
        bstree.inorder();
        bstree.insert(new Node(110));
        bstree.inorder();
        bstree.bfs();
    }

}

