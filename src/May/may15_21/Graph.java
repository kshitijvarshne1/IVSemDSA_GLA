/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-May-21
 *   Time: 1:05 PM
 *   File: Graph.java
 */

package May.may15_21;
//Kosaraju's algorithm
// Strongly Connected Components
/*
 *   3 steps
 *   1 -> Sort all the node inorder to finishing time -> Topo sort ->O(N)
 *   2 -> Transpose the graph                                      -> O(N+E)
 *   3 -> dfs according to finishing time means topo sort          -> O(N+E)
 *   T.C-> O(N+E)
 * */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

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
                System.out.print(j + " , ");
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
                dfs(i, visited, s);
            }
        }
        // Step 2 -> transpose the adj
        ArrayList<ArrayList<Integer>> tranpose = new ArrayList<>();
        for (int i = 0; i < adj.size(); i++) {
            tranpose.add(new ArrayList<>());
        }

        for (int i = 0; i < adj.size(); i++) {
            visited[i] = false;
            for (Integer j : adj.get(i)) {
                tranpose.get(j).add(i);
            }
        }
        // Step 3 -> dfs according to finishing time means topo sort
        while (!s.isEmpty()) {
            int node = s.pop();
            if (visited[node] == false) {
                System.out.print("SCC:- ");
                revDfs(node, tranpose, visited);
                System.out.println();
            }
        }
    }

    private void revDfs(int node, ArrayList<ArrayList<Integer>> tranpose, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");
        for (Integer j : tranpose.get(node)) {
            if (visited[j] == false) {
                revDfs(j, tranpose, visited);
            }
        }
    }

    private void dfs(int i, boolean[] visited, Stack<Integer> s) {
        visited[i] = true;
        for (Integer j : adj.get(i)) {
            if (visited[j] == false) {
                dfs(j, visited, s);
            }
        }
        s.push(i);
    }
}

