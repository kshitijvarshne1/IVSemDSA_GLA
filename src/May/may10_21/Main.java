/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-May-21
 *   Time: 12:25 AM
 *   File: Main.java
 */

package May.may10_21;

public class Main {
    public static void main(String[] args) {
        Graph gf = new Graph(6);
        gf.addEdge(0, 1);
        gf.addEdge(2, 1);
        gf.addEdge(2, 3);
        gf.addEdge(3, 4);
        gf.addEdge(4, 5);
        gf.addEdge(5, 3);
        gf.printGraph();
        gf.dfs();
    }
}

