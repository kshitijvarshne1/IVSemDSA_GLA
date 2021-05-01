/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 28-Apr-21
 *   Time: 3:59 PM
 *   File: Main.java
 */

package April.api28_21_NK;

public class Main {
    public static void main(String[] args) {
        BST bsttree = new BST();
        bsttree.insert(new Node(100));
        bsttree.insert(new Node(95));
        bsttree.insert(new Node(105));
        bsttree.insert(new Node(92));
        bsttree.insert(new Node(97));
        bsttree.insert(new Node(110));
        bsttree.insert(new Node(103));
        bsttree.insert(new Node(108));
        bsttree.bfs();
        bsttree.delete(new Node(100));
        bsttree.bfs();
        System.out.println(bsttree.search(new Node(104)));
    }

}

