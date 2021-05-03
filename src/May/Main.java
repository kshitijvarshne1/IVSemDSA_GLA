/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 03-May-21
 *   Time: 6:25 PM
 *   File: Main.java
 */

package May;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        System.out.println("Enter no of vertices");
        int noOfVertices = sc.nextInt();
        for (int i = 0; i < noOfVertices; i++) {
            adj.add(new ArrayList<>());
        }
        System.out.println("Enter no of edges");
        int noOFEdges = sc.nextInt();
        for (int i = 0; i < noOFEdges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}