/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-Apr-21
 *   Time: 9:59 PM
 *   File: MyBinarySearchTree.java
 */

package April.api15_21.implementation;

import April.api15_21.myinterface.BinarySearchTreeADT;
import April.api15_21.myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT {
    public Node<E> root;

    public MyBinarySearchTree() {
        this.root = null;
    }

    @Override
    public void insert(Comparable data) {

    }

    @Override
    public boolean search(Comparable searchElement) {
        return false;
    }

    @Override
    public void inOrder(Node node) {

    }

    @Override
    public void preOrder(Node node) {

    }

    @Override
    public void postOrder(Node node) {

    }

    @Override
    public void reverseInOrder(Node node) {

    }

    @Override
    public void delete(Comparable data) {

    }

    @Override
    public int height(Node node) {
        return 0;
    }
}

