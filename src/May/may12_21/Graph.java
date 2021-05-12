/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 12-May-21
 *   Time: 5:14 PM
 *   File: Graph.java
 */

package May.may12_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Graph {
    ArrayList<ArrayList<Pair>> adj;

    public Graph(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<Pair>());
        }
    }

    //Directed Acylic graph->->-> DAG
    public void addEdge(int u, int v, int weight) {
        adj.get(u).add(new Pair(v, weight));
    }

    public void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (Pair k : adj.get(i)) {
                System.out.print("{ " + k.a + " , " + k.b + " }");
            }
            System.out.println();
        }
    }

    public void shortestPath(int source) {
        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < adj.size(); i++) {
            if (visited[i] == false) {
                dfsResTopo(adj, i, visited, s);
            }
        }
        int[] dist = new int[adj.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        while (!s.isEmpty()) {
            int k = s.pop();
            if (dist[k] != Integer.MAX_VALUE) {
                for (Pair p : adj.get(k)) {
                    if (dist[k] + p.b < dist[p.a]) {
                        dist[p.a] = dist[k] + p.b;
                    }
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();

    }

    private void dfsResTopo(ArrayList<ArrayList<Pair>> adj, int i, boolean[] visited, Stack<Integer> s) {
        visited[i] = true;
        for (Pair j : adj.get(i)) {
            if (visited[j.a] == false) {
                dfsResTopo(adj, j.a, visited, s);
            }
        }
        s.push(i);
    }


}

class Pair {
    public int a;
    public int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

