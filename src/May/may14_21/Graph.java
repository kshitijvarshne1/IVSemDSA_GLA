/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 14-May-21
 *   Time: 1:55 PM
 *   File: Graph.java
 */

package May.may14_21;

import java.util.ArrayList;

// Dijkstra algorithm
// find shortest path from source to all vertices
// 1- it does not work in negative weight
// 2- if we add some edge then the output is changed for all vertices
public class Graph {
    public ArrayList<ArrayList<Pair>> adj;

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

    public Pair(int v, int weight) {
        this.v = v;
        this.weight = weight;
    }
}

