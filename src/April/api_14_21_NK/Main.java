/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 14-Apr-21
 *   Time: 8:07 PM
 *   File: Main.java
 */

package April.api_14_21_NK;

public class Main {
    public static void main(String[] args) {
        BSTtree<Integer> bstree = new BSTtree<>();
        bstree.insert(new Node<>(100));
        bstree.inorder();
        bstree.insert(new Node<>(90));
        bstree.inorder();
        bstree.insert(new Node<>(110));
        bstree.inorder();
        bstree.insert(new Node<>(85));
        bstree.inorder();
        bstree.insert(new Node<>(95));
        bstree.inorder();
        bstree.insert(new Node<>(105));
        bstree.inorder();
        bstree.insert(new Node<>(115));
        bstree.insert(new Node<>(5));
        bstree.inorder();
        bstree.inorderReverse();
        bstree.bfs();
        bstree.delete(new Node<>(5));
        bstree.bfs();
    }

}

