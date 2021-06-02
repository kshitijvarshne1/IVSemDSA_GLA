/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 02-Jun-21
 *   Time: 2:25 PM
 *   File: Graph.java
 */

package June.jun02_21;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

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
            for (Pair p : adj.get(i)) {
                System.out.print("{ " + p.v + " , " + p.weight + " } ");
            }
            System.out.println();
        }
    }

    public void dijkstra(int source) {
        int[] dist = new int[adj.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(source, 0));
        while (!pq.isEmpty()) {
            Pair node = pq.remove();
            for (Pair it : adj.get(node.v)) {
                if (dist[it.v] > it.weight + dist[node.v]) {
                    dist[it.v] = it.weight + dist[node.v];
                    pq.add(new Pair(it.v, dist[it.v]));
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
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

