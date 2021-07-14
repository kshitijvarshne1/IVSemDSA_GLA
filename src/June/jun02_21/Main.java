/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 02-Jun-21
 *   Time: 2:47 PM
 *   File: Main.java
 */

package June.jun02_21;

public class Main {
    public static void main(String[] args) {
        Graph gf = new Graph(8);

        gf.addEdge(0, 1, 1);
        gf.addEdge(0, 2, 3);

        gf.addEdge(0, 5, 10);
        gf.addEdge(1, 3, 7);

        gf.addEdge(1, 4, 5);
        gf.addEdge(1, 2, 1);

        gf.addEdge(2, 4, 3);
        gf.addEdge(2, 3, 9);

        gf.addEdge(6, 3, 12);
        gf.addEdge(3, 4, 2);

        gf.addEdge(1, 6, 2);
        gf.addEdge(3, 5, 1);
        gf.addEdge(4, 5, 2);
        gf.printGraph();
        gf.dijkstra(0);
    }
}

