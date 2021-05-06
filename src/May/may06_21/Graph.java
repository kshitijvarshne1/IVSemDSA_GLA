/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 06-May-21
 *   Time: 9:25 PM
 *   File: Graph.java
 */

package May.may06_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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
    public void ShortestPathInUnWeightGraph(int source) {
        int[] dist = new int[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] = true;
        dist[source] = 0;
        while (!q.isEmpty()) {
            int temp = q.remove();
            for (int x : adj.get(temp)) {
                if (visited[x] == false) {
                    dist[x] = dist[temp] + 1;
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
        System.out.println(Arrays.toString(dist));
    }
}

