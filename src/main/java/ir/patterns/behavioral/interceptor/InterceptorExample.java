package ir.patterns.behavioral.interceptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ir.patterns.behavioral.interceptor.impl.ExpressionContext;
import ir.patterns.behavioral.interceptor.impl.ExpressionHelpers;
import ir.patterns.behavioral.interceptor.impl.IExpression;

public class InterceptorExample {

	public static void main(String[] args) {
		List<String> inputs = new ArrayList<>(//
				Arrays.asList(//
						"20 3 5 * - 2 3 * +", //
						"1 1 1 1 1 + + + * 2 -", //
						"123 12 1 - - 12 9 * -", //
						"9 8 7 6 5 4 3 2 1 + - + - + - + -"//
				));

		ExpressionContext context = new ExpressionContext();
		System.out.println("-------------------------------------------");
		for (String input : inputs) {
			System.out.println(input);
			IExpression expression = ExpressionHelpers.buildExpressionTree(input);
			expression.interpret(context);
			List<String> steps = context.getSolutionSteps();
			for (String step : steps) {
				System.out.println(step);
			}
			System.out.println("-------------------------------------------");
		}
	}
}
