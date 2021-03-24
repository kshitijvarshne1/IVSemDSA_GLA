/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 25-Mar-21
 *   Time: 12:38 AM
 *   File: Main.java
 */

package March.mar25_21_NK;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new Node(5));
        bst.insert(new Node(2));
        bst.insert(new Node(8));
        bst.preorder();
        System.out.println();
        bst.inorder();
        System.out.println();
        bst.postorder();
    }

}

