/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-Apr-21
 *   Time: 10:31 PM
 *   File: Main.java
 */

package April.api15_21.main;

import April.api15_21.implementation.MyBinarySearchTree;

public class Main {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> bstree = new MyBinarySearchTree<>();
        bstree.insert(100);
        bstree.insert(90);
        bstree.insert(110);
        bstree.insert(85);
        bstree.insert(95);
        bstree.insert(105);
        bstree.insert(115);
        bstree.inOrder(bstree.root);
        System.out.println();
        bstree.preOrder(bstree.root);
        System.out.println();
        bstree.postOrder(bstree.root);
        System.out.println();
        System.out.println(bstree.height(bstree.root));
        System.out.println(bstree.search(85));
    }
}

