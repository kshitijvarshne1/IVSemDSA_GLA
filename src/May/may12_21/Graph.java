/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 12-May-21
 *   Time: 5:14 PM
 *   File: Graph.java
 */

package May.may12_21;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Pair>> adj;

    public Graph(int vertices) {
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
    }
}

class Pair {
    public int a;
    public int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

