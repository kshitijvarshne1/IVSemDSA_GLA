/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 29-Mar-21
 *   Time: 11:22 AM
 *   File: Main.java
 */

package March.mar29_21_NK;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bTree = new BinarySearchTree();
        bTree.insert(new Node(100));
        bTree.insert(new Node(98));
        bTree.insert(new Node(97));
        bTree.insert(new Node(105));
        bTree.insert(new Node(99));
        bTree.insert(new Node(101));
        bTree.insert(new Node(107));
        bTree.inorder();
        System.out.println();
        /*System.out.println();
        System.out.println(bTree.countNodes());
        System.out.println(bTree.sumOfNodes());
        bTree.sumReplace();
        bTree.inorder();
        System.out.println();
        *//*System.out.println(bTree.height());
        System.out.println(bTree.diameter());*/
        bTree.levelOrderTraverse();
        System.out.println();

    }
}

