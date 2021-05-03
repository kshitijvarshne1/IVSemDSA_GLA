/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 03-May-21
 *   Time: 6:27 PM
 *   File: Graph.java
 */

package May.one;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int noOfVertics) {
        adj = new ArrayList<>();
        for (int i = 0; i < noOfVertics; i++) {
            adj.add(new ArrayList<>());
        }
    }

    //undirected graph
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
}

