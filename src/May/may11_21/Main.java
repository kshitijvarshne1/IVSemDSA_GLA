/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 11-May-21
 *   Time: 12:14 PM
 *   File: Main.java
 */

package May.may11_21;

public class Main {
    public static void main(String[] args) {
        Graph gf = new Graph(5);
        gf.addEdge(0, 2);
        gf.addEdge(2, 3);
        gf.addEdge(0, 3);
        gf.addEdge(1, 3);
        gf.addEdge(1, 4);
        gf.printGraph();
        gf.toposort();
    }
}

