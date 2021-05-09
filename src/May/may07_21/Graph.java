/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 07-May-21
 *   Time: 7:00 PM
 *   File: Graph.java
 */

package May.may07_21;

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

    public boolean DetectCycleInUndirectedGraph() {
        boolean[] visited = new boolean[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            if (visited[i] == false) {
                if (dfsRec(adj, i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfsRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {
        visited[s] = true;
        for (int u : adj.get(s)) {
            if (visited[u] == false) {
                if (dfsRec(adj, u, visited, s)) {
                    return true;
                }
            } else if (u != parent) {
                return true;
            }
        }
        return false;
    }


    // Cycle detection Undirected ->> Striver


    public boolean checkCycle() {
        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);
        for (int i = 0; i < adj.size(); i++) {
            if (bfsCheck(adj, i, visited) == false) {
                return true;
            }
        }
        return false;

    }

    private boolean bfsCheck(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, -1));
        visited[i] = true;
        while (!q.isEmpty()) {
            Pair p = q.remove();
            int x = p.a;
            int prev = p.previous;
            for (Integer it : adj.get(x)) {
                if (visited[it] == false) {
                    q.add(new Pair(it, x));
                    visited[it] = true;
                } else if (prev != it) {
                    return true;
                }
            }
        }
        return false;
    }


    class Pair {
        int a;
        int previous;

        public Pair(int a, int previous) {
            this.a = a;
            this.previous = previous;
        }
    }
}

