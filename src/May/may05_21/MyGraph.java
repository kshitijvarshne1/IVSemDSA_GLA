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
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Boolean> visited = new ArrayList<>();
        for (int i = 0; i < adj.size(); i++) {
            visited.add(i, true);
        }
        q.add(source);
        visited.add(source, false);
        while (!q.isEmpty()) {
            int temp = q.remove();
            System.out.print(temp + " ");
            for (ArrayList<Integer> x : adj) {
                for (Integer i : x) {
                    if (visited.get(i) == false) {
                        visited.add(i, true);
                        q.add(i);
                    }
                }
            }
        }
        System.out.println();
    }
}

