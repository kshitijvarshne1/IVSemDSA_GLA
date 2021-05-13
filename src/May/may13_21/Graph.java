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

    public void addEdge(int u, int v, int weight) {
        adj.get(u).add(new Pair(v, weight));
    }

    public void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (Pair j : adj.get(i)) {
                System.out.print("{ " + j.v + " " + j.weight + " }");
            }
            System.out.println();
        }
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

