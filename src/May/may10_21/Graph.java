/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 10-May-21
 *   Time: 12:15 AM
 *   File: Graph.java
 */

package May.may10_21;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // directed graph
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
    }

    public void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (Integer j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void dfs() {
        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);
        for (int i = 0; i < adj.size(); i++) {
            if (visited[i] == false) {
                dfsRec(adj, i, visited);
            }
        }
    }

    private void dfsRec(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited) {
        visited[i] = true;
        System.out.print(i + " ");
        for (Integer j : adj.get(i)) {
            if (visited[j] == false) {
                dfsRec(adj, j, visited);
            }
        }
    }

    // Cycle detection in directed graph using dfs ->> striver
    public boolean dfsForCycle() {
        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);
        boolean[] dfsVisited = new boolean[adj.size()];
        Arrays.fill(dfsVisited, false);
        for (int i = 0; i < adj.size(); i++) {
            if (visited[i] == false) {
                if (cycleCheck(adj, i, visited, dfsVisited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean cycleCheck(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited, boolean[] dfsVisited) {
        visited[i] = true;
        dfsVisited[i] = true;
        for (Integer j : adj.get(i)) {
            if (visited[j] == false) {
                if (cycleCheck(adj, j, visited, dfsVisited) == true) {
                    return true;
                }
            } else if (dfsVisited[j] == true) {
                return true;
            }
        }
        dfsVisited[i] = false;
        return false;
    }
}

