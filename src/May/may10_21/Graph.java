/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-May-21
 *   Time: 12:15 AM
 *   File: Graph.java
 */

package May.may10_21;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // directed graph
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
    }
}

