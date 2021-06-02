/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 02-Jun-21
 *   Time: 2:25 PM
 *   File: Graph.java
 */

package June.jun02_21;

public class Graph {
}

class Pair implements Comparable<Pair> {
    int v;
    int weight;

    public Pair(int v, int weight) {
        this.v = v;
        this.weight = weight;
    }

    @Override
    public int compareTo(Pair o) {
        return Integer.compare(o.weight, this.weight);
    }
}

