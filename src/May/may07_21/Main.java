/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 07-May-21
 *   Time: 7:12 PM
 *   File: Main.java
 */

package May.may07_21;

public class Main {
    public static void main(String[] args) {
        Graph gf = new Graph(6);
        gf.addEdge(0, 1);
        gf.addEdge(1, 2);
        gf.addEdge(1, 3);
        gf.addEdge(2, 3);
        gf.addEdge(2, 4);
        gf.addEdge(4, 5);
        gf.printGraph();
        System.out.println(gf.DetectCycleInUndirectedGraph());

    }
}

