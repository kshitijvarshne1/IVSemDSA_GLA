/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 04-May-21
 *   Time: 2:24 PM
 *   File: Main.java
 */

package May.may04_21;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        System.out.println("Enter the no of vertices");
        int vertices = sc.nextInt();
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }
        System.out.println("Enter the no of edges");
        int e = sc.nextInt();
        System.out.println("Enter the edges (u,v) ");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.print(adj.get(i) + " -> ");
            for (int x : adj.get(i)) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

