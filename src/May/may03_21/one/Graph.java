/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 03-May-21
 *   Time: 6:27 PM
 *   File: Graph.java
 */

package May.may03_21.one;

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

    public void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

