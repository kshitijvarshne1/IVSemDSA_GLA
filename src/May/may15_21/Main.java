/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-May-21
 *   Time: 2:48 PM
 *   File: Main.java
 */

package May.may15_21;

public class Main {
    public static void main(String[] args) {
        Graph gf = new Graph(5);
        gf.addEdge(0, 1);
        gf.addEdge(1, 2);
        gf.addEdge(2, 0);
        gf.addEdge(1, 3);
        gf.addEdge(3, 4);
        gf.printGraph();
        gf.kosaraju();

    }
}

