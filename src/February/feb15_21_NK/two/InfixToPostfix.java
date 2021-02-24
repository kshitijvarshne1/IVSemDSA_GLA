/*   Created by IntelliJ IDEA.
 *   Author: Kshitij Varshney (kshitijvarshne1)
 *   Date: 15-Feb-21
 *   Time: 11:26 AM
 *   File: InfixToPostfix.java
 */

package February.feb15_21_NK.two;

public class InfixToPostfix {
}
/*
 * infix to postfix(polish notation)
 * infix to prefix(reverse polish notation)
 * infix= a+b
 * postfix-> ab+
 * prefix :- +ab
 *
 *
 * Some rules :---------
 * rules to convert infix to postfix
 * 1.print operator as they arrive
 * 2.if stack is empty or contains a left parenthesis on top push the incoming operator into the stack
 * 3.if the incoming symbol is "(" push it into the stack
 * 4.if the incoming symbol is this "(" pop the stack and print the operator until left parenthesis is found
 * 5.if incoming symbol has higher precedence than top of the stack, push it on the stack
 * 6.if incoming symbol has lower precedence than top of stack , first pop and print the top  then test the incoming operator against new top od the stack
 * 7.if incoming operator has equal precedence with the top of stack use associativity rule
 * 8. at the end of the expressing pop and print all operator of the stack
 *
 * Associativity L to R pop and print the top of stack then push the incoming operator
 * Associativity R to L push the incoming operator
 *
 * Infix:- A+B*C
 * Input     stack   output
 * A         ----    A
 * +         +       A
 * B         +       AB
 * *         +*      AB
 * C         +*      ABC
 *
 * :----postfic output:---  ABC*+
 *
 * infix:-- A-B+C
 *
 * input     stack       output
 *  A        -----       A
 *   -          -        A
 *   B          -        AB
 * +    - -> pop + ->push AB-
 * C         +           AB-C
 *                  output:-         AB-C+
 *
 *
 *   infix :=== A/B-C+D*E-A*C
 *
 * input stack ouput
 * A     ----  A
 * /      /     A
 * B        /    B
 * -        -    AB/
 * C         -   AB/
 * +         -+  AB/C
 * D         +  AB/CD
 * *         +* AB/C-D
 * E         +* AB/C-DE
 * -            -    AB/C-DE*+
 * A         -       AB/C-DE*+A
 * *         -*     AB/C-DE*+A
 * C        -*     AB/C-DE*+AC
 *
 *
 *
 *   ouput:---AB/C-DE*+AC*-
 *
 * */
