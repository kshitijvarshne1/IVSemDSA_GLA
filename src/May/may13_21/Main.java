/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 13-May-21
 *   Time: 8:58 PM
 *   File: Main.java
 */

package May.may13_21;

public class Main {
    public static void main(String[] args) {
        Graph gf = new Graph(5);
        gf.addEdge(0, 1, 2);
        gf.addEdge(1, 0, 2);

        gf.addEdge(1, 2, 3);
        gf.addEdge(2, 1, 3);

        gf.addEdge(0, 3, 6);
        gf.addEdge(3, 0, 6);

        gf.addEdge(1, 3, 8);
        gf.addEdge(3, 1, 8);

        gf.addEdge(1, 4, 5);
        gf.addEdge(4, 1, 5);

        gf.addEdge(2, 4, 7);
        gf.addEdge(4, 2, 7);

        gf.printGraph();

        gf.prism();

    }
}

