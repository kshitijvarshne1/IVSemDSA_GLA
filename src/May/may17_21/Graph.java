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
// help to detect the negative cycle
public class Graph {
    ArrayList<Node> adj;

    public Graph() {
        adj = new ArrayList<>();
    }

    public void addEdge(int u, int v, int weight) {
        adj.add(new Node(u, v, weight));
    }

    public void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println(adj.get(i).getU() + " " + adj.get(i).getV() + " " + adj.get(i).getWeight());
        }
    }

    public void BellmanAndDetectNegativeWeight(int src) {
        int dist[] = new int[adj.size()];
        for (int i = 0; i < adj.size(); i++) dist[i] = 10000000;

        dist[src] = 0;

        for (int i = 1; i <= adj.size() - 1; i++) {
            for (Node node : adj) {
                if (dist[node.getU()] + node.getWeight() < dist[node.getV()]) {
                    dist[node.getV()] = dist[node.getU()] + node.getWeight();
                }
            }
        }

        int fl = 0;
        for (Node node : adj) {
            if (dist[node.getU()] + node.getWeight() < dist[node.getV()]) {
                fl = 1;
                System.out.println("Negative Cycle");
                break;
            }
        }

        if (fl == 0) {
            for (int i = 0; i < adj.size(); i++) {
                System.out.println(i + " " + dist[i]);
            }
        }
    }
}

class Node {
    private int u;
    private int v;
    private int weight;

    public Node(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }

    public int getU() {
        return u;
    }

    public void setU(int u) {
        this.u = u;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}

