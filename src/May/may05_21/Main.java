/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 05-May-21
 *   Time: 10:29 PM
 *   File: Main.java
 */

package May.may05_21;

public class Main {
    public static void main(String[] args) {
        MyGraph graph = new MyGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(2, 3);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(3, 4);
        graph.printGraph();
        graph.dfs(0);
    }
}

