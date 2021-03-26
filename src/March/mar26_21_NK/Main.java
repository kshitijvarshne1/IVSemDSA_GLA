/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 26-Mar-21
 *   Time: 7:40 PM
 *   File: Main.java
 */

package March.mar26_21_NK;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insertRecursive(new Node(10));
        bt.insert(new Node(8));
        bt.insertRecursive(new Node(12));
        bt.insertRecursive(new Node(6));
        bt.insertRecursive(new Node(9));
        bt.preorder();
        System.out.println();
        bt.inorder();
        System.out.println();
        bt.postorder();
    }
}

