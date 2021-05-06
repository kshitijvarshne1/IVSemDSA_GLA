/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 06-May-21
 *   Time: 10:21 PM
 *   File: Main.java
 */

package May.may06_21;

public class Main {
    public static void main(String[] args) {
        Graph gf = new Graph(4);
        gf.addEdge(0, 1);
        gf.addEdge(1, 2);
        gf.addEdge(2, 3);
        gf.addEdge(0, 2);
        gf.addEdge(1, 3);
        gf.printGraph();
    }
}

