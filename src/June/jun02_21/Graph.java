/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 02-Jun-21
 *   Time: 2:25 PM
 *   File: Graph.java
 */

package June.jun02_21;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Pair>> adj;

    public Graph(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v, int weight) {
        adj.get(u).add(new May.may14_21.Pair(v, weight));
    }


}

class Pair implements Comparable<Pair> {
    int v;
    int weight;

    public Pair(int v, int weight) {
        this.v = v;
        this.weight = weight;
    }

    @Override
    public int compareTo(Pair o) {
        return Integer.compare(o.weight, this.weight);
    }
}

