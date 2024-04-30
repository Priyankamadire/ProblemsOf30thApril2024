/*Given an expression in string format print the value of the expression after evaluating 

Rules for Evaluation :
The expression is Evaluated from Left to Right and operators allowed are only +,-,/,*
Ignore Operator Precedence and evaluate the expression from left to right
Assume the expression only consists of numbers(0-9)(both postive and negative) and 
operators(+,-,*,/)

Test Case-1
input = 2+3*6
output = 30

Explanation :- The sum of 2+3 is 5 and 5*6 = 30 


Test Case-2
input = 5+7-9+0*0+1
output = 1

Explanation - The sum of 5+7 is 12 
12-9 is 3 and 3+0 is 3, 3*0 is 0 and 0+1 is 1 


Test Case-3
input = -1+-1*2
output = -4

Explanation -
-1 + -1 is -2 
and -2 * 2 is -4
*/
import java.util.*;
public class Calculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
    }

    public static int solve(String s) {
        int result = 0;
        char operator = '+';
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else {
                if (operator == '+') {
                    result += num;
                } else if (operator == '-') {
                    result -= num;
                } else if (operator == '*') {
                    result *= num;
                } else if (operator == '/') {
                    result /= num;
                }
                operator = ch;
                num = 0;
            }
        }

        if (operator == '+') {
            result += num;
        } else if (operator == '-') {
            result -= num;
        } else if (operator == '*') {
            result *= num;
        } else if (operator == '/') {
            result /= num;
        }

        return result;
    }
}
