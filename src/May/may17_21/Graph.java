/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 17-May-21
 *   Time: 2:42 PM
 *   File: Graph.java
 */

package May.may17_21;

import java.util.ArrayList;

// Bellman ford Shortest Path algorithm
// Work in negative wight
public class Graph {
    ArrayList<ArrayList<Pair>> adj;

    public Graph(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v, int weight) {
        adj.get(u).add(new Pair(v, weight));
    }
}

class Pair {
    int v;
    int weight;

    public Pair(int v, int weight) {
        this.v = v;
        this.weight = weight;
    }
}

