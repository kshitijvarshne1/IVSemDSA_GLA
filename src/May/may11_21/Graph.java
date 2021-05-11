/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 11-May-21
 *   Time: 11:48 AM
 *   File: Graph.java
 */

package May.may11_21;

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

    // TopoSort for only Acylic graph
    // Khan algorithm


    public void toposort() {
        int[] indegree = new int[adj.size()];
        Arrays.fill(indegree, 0);
        // counting for indegree
        for (int i = 0; i < adj.size(); i++) {
            for (Integer j : adj.get(i)) {
                indegree[j]++;
            }
        }
        // insert those vertices whose indegree is zero initially
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int temp = q.remove();
            System.out.print(temp + " ");
            for (Integer i : adj.get(temp)) {
                indegree[i]--;
                if (indegree[i] == 0) {
                    q.add(i);
                }
            }
        }
        System.out.println();
    }
}
