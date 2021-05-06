/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 05-May-21
 *   Time: 10:24 PM
 *   File: MyGraph.java
 */

package May.may05_21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MyGraph {
    public ArrayList<ArrayList<Integer>> adj;

    public MyGraph(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // for undirected graph
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void printGraph() {
        int j = 0;
        for (ArrayList<Integer> x : adj) {
            System.out.print(j + " ->");
            for (Integer i : x) {
                System.out.print(i + " ");
            }
            j += 1;
            System.out.println();
        }
    }

    public void bfs(int source) {
        boolean[] visited = new boolean[adj.size() + 1];
        Queue<Integer> q = new LinkedList<>();
        visited[source] = true;
        q.add(source);
        while (!q.isEmpty()) {
            int temp = q.remove();
            System.out.print(temp + " ");
            for (int v : adj.get(temp)) {
                if (visited[v] == false) {
                    visited[v] = true;
                    q.add(v);
                }
            }
        }
        System.out.println();
    }

    public void dfs(int s) {
        boolean[] visited = new boolean[adj.size()];
        dfsRec(adj, s, visited);
    }

    private void dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited) {
        visited[s] = true;
        System.out.print(s + " ");
        for (int u : adj.get(s)) {
            if (visited[u] == false) {
                dfsRec(adj, u, visited);
            }
        }
    }

    public int countComponentsDFS() {
        boolean[] visited = new boolean[adj.size()];
        int count = 0;
        for (int i = 0; i < adj.size(); i++) {
            if (visited[i] == false) {
                count += 1;
                dfsRecCount(adj, i, visited);
            }
        }
        return count;
    }

    private void dfsRecCount(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited) {
        visited[i] = true;
        for (int x : adj.get(i)) {
            if (visited[x] == false) {
                dfsRec(adj, x, visited);
            }
        }
    }
}

