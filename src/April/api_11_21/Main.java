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
        bstree.insert(new Node(95));
        bstree.insert(new Node(110));
        bstree.insert(new Node(90));
        bstree.insert(new Node(97));
        bstree.insert(new Node(101));
        bstree.insert(new Node(111));
        bstree.insert(new Node(85));
        bstree.insert(new Node(92));
        bstree.insert(new Node(96));
        bstree.insert(new Node(98));
        bstree.inorder();
        bstree.bfs();
    }

}

