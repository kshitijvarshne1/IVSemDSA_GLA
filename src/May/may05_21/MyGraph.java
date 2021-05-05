/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 05-May-21
 *   Time: 10:24 PM
 *   File: MyGraph.java
 */

package May.may05_21;

import java.util.ArrayList;

public class MyGraph {
    public ArrayList<ArrayList<Integer>> adj;

    public MyGraph(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // for undirected graph
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

}

