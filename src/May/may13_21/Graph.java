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
                System.out.print(" { " + j.v + " " + j.weight + " } ,");
            }
            System.out.println();
        }
    }

    public void prism() {
        int[] key = new int[adj.size()];
        int[] parent = new int[adj.size()];
        boolean[] mst = new boolean[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            key[i] = Integer.MAX_VALUE;
            parent[i] = -1;
            mst[i] = false;
        }
        key[0] = 0;
        for (int i = 0; i < adj.size() - 1; i++) {
            int mini = Integer.MAX_VALUE;
            int u = 0;
            for (int v = 0; v < adj.size(); v++) {
                if (mst[v] == false && key[v] < mini) {
                    mini = key[v];
                    u = v;
                }
            }
            mst[u] = true;

            for (Pair it : adj.get(u)) {
                if (mst[it.v] == false && it.weight < key[it.v]) {
                    parent[it.v] = u;
                    key[it.v] = it.weight;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < key.length; i++) {
            System.out.print(key[i] + " ");
            sum += key[i];
        }
        System.out.println();
        System.out.println(sum);

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

