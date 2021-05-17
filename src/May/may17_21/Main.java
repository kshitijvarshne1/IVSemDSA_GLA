/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-May-21
 *   Time: 7:01 PM
 *   File: Main.java
 */

package May.may17_21;

public class Main {
    public static void main(String[] args) {
        Graph gf = new Graph();
        gf.addEdge(3, 2, 6);
        gf.addEdge(5, 3, 1);
        gf.addEdge(0, 1, 5);
        gf.addEdge(1, 5, -3);
        gf.addEdge(1, 2, -2);
        gf.addEdge(3, 4, -2);
        gf.addEdge(2, 4, 3);
        gf.printGraph();
        gf.BellmanAndDetectNegativeWeight(0);

    }
}

