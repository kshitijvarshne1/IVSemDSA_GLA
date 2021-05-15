/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-May-21
 *   Time: 1:05 PM
 *   File: Graph.java
 */

package May.may15_21;
//Kosaraju's algorithm
// Strongly Connected Components
/*
 *   3 steps
 *   1 -> Sort all the node inorder to finishing time -> Topo sort ->O(N)
 *   2 -> Transpose the graph                                      -> O(N+E)
 *   3 -> dfs according to finishing time means topo sort          -> O(N+E)
 *   T.C-> O(N+E)
 * */


import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    public void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (Integer j : adj.get(i)) {
                System.out.print(j + " , ");
            }
            System.out.println();
        }
    }
}

