package ir.patterns.behavioural.interceptor.impl;

/**
 * {@link Number} a terminal expression for numbers
 */
public class Number implements IExpression {
	private int number;

	public Number(int number) {
		this.number = number;
	}

	@Override
	public int interpret(ExpressionContext context) {
		return number;
	}
}
