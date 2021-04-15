package April.api15_21.myinterface;

public interface BinarySearchTreeADT<E extends Comparable<E>> {
    void insert(E data);

    boolean search(E searchElement);

    void inOrder(April.api15_21.implementation.Node<E> node);

    void preOrder(April.api15_21.implementation.Node<E> node);

    void postOrder(April.api15_21.implementation.Node<E> node);

    void reverseInOrder(April.api15_21.implementation.Node<E> node);

    void delete(E data);

    int height(April.api15_21.implementation.Node<E> node);
}
