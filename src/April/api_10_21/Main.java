/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-Apr-21
 *   Time: 12:29 PM
 *   File: Main.java
 */

package April.api_10_21;

public class Main {
    public static void main(String[] args) {
        BST bstree = new BST();
        bstree.insert(new Node(100));
        bstree.inorder();
        bstree.insert(new Node(95));
        bstree.inorder();
        bstree.insert(new Node(110));
        bstree.inorder();
        bstree.insert(new Node(92));
        bstree.inorder();
        bstree.insert(new Node(97));
        bstree.inorder();
        bstree.insert(new Node(107));
        bstree.inorder();
        bstree.bfs();
    }
}

