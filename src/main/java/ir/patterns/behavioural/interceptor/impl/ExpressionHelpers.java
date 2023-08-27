package ir.patterns.behavioural.interceptor.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * A helper class which is used by the Client to build the expression tree from
 * the provided postfix expression input.
 */
public class ExpressionHelpers {

	private static final List<String> OPERATORS = new ArrayList<>(Arrays.asList("*", "+", "-"));

	public static IExpression buildExpressionTree(String postfixExpression) {
		Stack<IExpression> stack = new Stack<>();
		String[] expressions = postfixExpression.split(" ");
		for (String expression : expressions) {
			if (OPERATORS.contains(expression)) {
				IExpression right = stack.pop();
				IExpression left = stack.pop();
				IExpression number = getNonterminalExpression(expression, left, right);
				stack.push(number);
			} else {
				Number number = new Number(Integer.parseInt(expression));
				stack.push(number);
			}
		}
		return stack.pop();
	}

	private static IExpression getNonterminalExpression(String operator, IExpression left, IExpression right) {
		IExpression result = null;
		switch (operator) {
			case "+":
				result = new Add(left, right);
				break;
			case "-":
				result = new Subtract(left, right);
				break;
			case "*":
				result = new Multiply(left, right);
				break;
			default:
				throw new RuntimeException("Expression is not defined.");
		}
		return result;
	}
}
