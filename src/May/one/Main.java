/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 03-May-21
 *   Time: 6:36 PM
 *   File: Main.java
 */

package May.one;

public class Main {
    public static void main(String[] args) {
        Graph gp = new Graph(4);
        gp.addEdge(0, 1);
        gp.addEdge(0, 2);
        gp.addEdge(1, 2);
        gp.addEdge(1, 3);
        gp.printGraph();
    }
}

