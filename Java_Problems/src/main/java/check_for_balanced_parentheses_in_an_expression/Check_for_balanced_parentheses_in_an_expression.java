package check_for_balanced_parentheses_in_an_expression;

import java.util.Stack;

public class Check_for_balanced_parentheses_in_an_expression {

	public static void main(String[] args) {
		String expression = "((a + b) * (c - d))"; // You can modify this expression
        if (isBalanced(expression)) {
            System.out.println("The expression has balanced parentheses.");
        } else {
            System.out.println("The expression has unbalanced parentheses.");
        }
    }

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();

	}

}
