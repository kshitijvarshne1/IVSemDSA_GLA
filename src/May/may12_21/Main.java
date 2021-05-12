/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 12-May-21
 *   Time: 6:26 PM
 *   File: Main.java
 */

package May.may12_21;

public class Main {
    public static void main(String[] args) {
        Graph gf = new Graph(6);
        gf.addEdge(0, 1, 2);
        gf.addEdge(0, 4, 1);
        gf.addEdge(1, 2, 3);
        gf.addEdge(2, 3, 6);
        gf.addEdge(4, 2, 2);
        gf.addEdge(4, 5, 4);
        gf.addEdge(5, 3, 1);
        gf.printGraph();
        gf.shortestPath(0);
    }
}

