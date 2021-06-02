/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 02-Jun-21
 *   Time: 2:47 PM
 *   File: Main.java
 */

package June.jun02_21;

public class Main {
    public static void main(String[] args) {
        Graph gf = new Graph(5);

        gf.addEdge(0, 1, 2);
        gf.addEdge(1, 0, 2);

        gf.addEdge(1, 2, 4);
        gf.addEdge(2, 1, 4);

        gf.addEdge(0, 3, 1);
        gf.addEdge(3, 0, 1);

        gf.addEdge(3, 2, 3);
        gf.addEdge(2, 3, 3);

        gf.addEdge(1, 4, 5);
        gf.addEdge(4, 1, 5);

        gf.addEdge(2, 4, 1);
        gf.addEdge(4, 2, 1);
        gf.printGraph();
        gf.dijkstra(0);
    }
}

