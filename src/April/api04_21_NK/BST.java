/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-Apr-21
 *   Time: 11:34 AM
 *   File: BST.java
 */

package April.api04_21_NK;

import java.util.Stack;
public class BST<T extends Comparable<T>> {
    public Node<T> root;

    public BST() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(Node<T> newNode) {
        if (root == null) {
            root = newNode;
        } else {
            Node<T> current = root;
            Node<T> parent;
            while (true) {
                parent = current;
                if (current.data.compareTo(newNode.data) > 0) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }


    public void inorder() {
        inorderPrinting(this.root);
        System.out.println();
    }

    private void inorderPrinting(Node<T> root) {
        if (root == null) {
            return;
        } else {
            inorderPrinting(root.left);
            System.out.print(root.data + " ");
            inorderPrinting(root.right);
        }
    }
    //preorder, inorder and postorder using iterative
    // state ==1 -> pre , state++ ,left
    // state ==2 -> in, state++, right
    // state ==3 -> post , pop

    public void printPreInPostUsingIterative() {
        if (root != null) {
            Stack<Pair> st = new Stack<>();
            st.push(new Pair(root, 1));
            String pre = "";
            String in = "";
            String post = "";
            while (st.size() > 0) {
                Pair top = st.peek();
                if (top.state == 1) {
                    pre += top.node.data + " ";
                    top.state += 1;
                    if (top.node.left != null) {
                        st.push(new Pair(top.node.left, 1));
                    }
                } else if (top.state == 2) {
                    in += top.node.data + " ";
                    top.state += 1;
                    if (top.node.right != null) {
                        st.push(new Pair(top.node.right, 1));
                    }
                } else {
                    post += top.node.data + " ";
                    st.pop();
                }
            }
            System.out.println(pre);
            System.out.println(in);
            System.out.println(post);
        }
    }

}

