/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 14-Feb-21
 *   Time: 1:34 PM
 *   File: StockSpanProblem.java
 */

package feb13_21_NK_P.two;

import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int n = prices.length;
        int[] span = new int[n];
        for (int i = 0; i < n; i++) {
            span[i] = 0;
        }
        stockSpan(prices, n, span);
        for (int i = 0; i < n; i++) {
            System.out.print(span[i] + " ");
        }
    }

    private static void stockSpan(int[] prices, int n, int[] span) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            int currentPrice = prices[i];
            // topmost element that is higher then the current prices
            while (!stack.empty() && prices[stack.peek()] <= currentPrice) {
                stack.pop();
            }
            if (!stack.empty()) {
                int prevHighest = stack.peek();
                span[i] = i - prevHighest;
            } else {
                span[i] = i + 1;
            }
            stack.push(i);
        }
    }
}

