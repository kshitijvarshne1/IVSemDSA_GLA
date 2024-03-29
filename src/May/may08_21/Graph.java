/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 08-May-21
 *   Time: 5:05 PM
 *   File: Graph.java
 */

package May.may08_21;

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
        adj.get(v).add(u);
    }

    public void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (Integer integer : adj.get(i)) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}

