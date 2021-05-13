/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 13-May-21
 *   Time: 2:51 PM
 *   File: Graph.java
 */

package May.may13_21;

import java.util.ArrayList;

// Minimum spanning tree
// Prism algorithm  -> greedy algorithm
// Minimize the wire length and make sure that all computers are connected to each other may be through intermediate computers
// Minimum spanning tree define for only undirected graph
// result -> no cycle
// Condition for MST
// N vertices with N-1 edges
// every vertices should be reachable by every another vertices
public class Graph {
    ArrayList<ArrayList<Pair>> adj;

    public Graph(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }
}

class Pair {
    int v;
    int weight;
}

