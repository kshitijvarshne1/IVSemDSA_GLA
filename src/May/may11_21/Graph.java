/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 11-May-21
 *   Time: 11:48 AM
 *   File: Graph.java
 */

package May.may11_21;

import java.util.*;

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
    // Khan algorithm  ->>>>>BFS


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


    // TopoSort for only Acylic graph
    // Khan algorithm  ->>>>>DFS
    public void dfsTopo() {
        boolean[] visited = new boolean[adj.size()];
        Arrays.fill(visited, false);
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < adj.size(); i++) {
            if (visited[i] == false) {
                dfsResTopo(adj, i, visited, s);
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        System.out.println();
    }

    private void dfsResTopo(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited, Stack<Integer> s) {
        visited[i] = true;
        for (Integer j : adj.get(i)) {
            if (visited[j] == false) {
                dfsResTopo(adj, j, visited, s);
            }
        }
        s.push(i);
    }

}
