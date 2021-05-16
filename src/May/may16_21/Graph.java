/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 16-May-21
 *   Time: 2:03 PM
 *   File: Graph.java
 */

package May.may16_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

//Kosaraju algorithm
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

    public void kosaraju() {
        //Step 1 -> sort all the node inorder to finishing time
        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < adj.size(); i++) {
            if (visited[i] == false) {
                dfsRec(i, visited, s);
            }
        }
        // Step 2 -> transpose the adj
        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();
        for (int i = 0; i < adj.size(); i++) {
            transpose.add(new ArrayList<>());
        }
        for (int i = 0; i < adj.size(); i++) {
            visited[i] = false;
            for (Integer j : adj.get(i)) {
                transpose.get(j).add(i);
            }
        }
        // Step 3 -> dfs according to finishing time means topo sort
        while (!s.isEmpty()) {
            int node = s.pop();
            if (visited[node] == false) {
                revdfs(node, transpose, visited);
                System.out.println();
            }
        }
    }

    private void revdfs(int node, ArrayList<ArrayList<Integer>> transpose, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for (Integer j : transpose.get(node)) {
            if (visited[j] == false) {
                revdfs(j, transpose, visited);
            }
        }
    }

    private void dfsRec(int i, boolean[] visited, Stack<Integer> s) {
        visited[i] = true;
        for (Integer j : adj.get(i)) {
            if (visited[j] == false) {
                dfsRec(j, visited, s);
            }
        }
        s.push(i);
    }
}

