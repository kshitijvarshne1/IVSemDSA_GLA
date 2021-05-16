/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 16-May-21
 *   Time: 2:03 PM
 *   File: Graph.java
 */

package May.may16_21;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adj;

    public Graph(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }
}

