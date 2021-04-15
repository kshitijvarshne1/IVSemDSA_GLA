/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-Apr-21
 *   Time: 9:59 PM
 *   File: MyBinarySearchTree.java
 */

package April.api15_21.implementation;


import April.api15_21.myinterface.BinarySearchTreeADT;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    public Node<E> root;

    public MyBinarySearchTree() {
        this.root = null;
    }


    @Override
    public void insert(E data) {
        if (root == null) {
            root = new Node<>(data);
        } else {
            Node<E> parent;
            Node<E> current = root;
            while (current != null) {
                parent = current;
                if (data.compareTo(current.getData()) <= 0) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(new Node<>(data));
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(new Node<>(data));
                    }
                }
            }

        }
    }

    @Override
    public boolean search(E searchElement) {
        return false;
    }

    @Override
    public void inOrder(April.api15_21.myinterface.Node<E> node) {

    }

    @Override
    public void preOrder(April.api15_21.myinterface.Node<E> node) {

    }

    @Override
    public void postOrder(April.api15_21.myinterface.Node<E> node) {

    }

    @Override
    public void reverseInOrder(April.api15_21.myinterface.Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(April.api15_21.myinterface.Node<E> node) {
        return 0;
    }
}

