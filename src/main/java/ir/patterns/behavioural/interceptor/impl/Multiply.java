package ir.patterns.behavioural.interceptor.impl;

/**
 * {@link Multiply} a nonterminal expression of the multiplication operation
 */
public class Multiply implements IExpression {

	private IExpression left;
	private IExpression right;

	public Multiply(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(ExpressionContext context) {
		int left = this.left.interpret(context);
		int right = this.right.interpret(context);
		int result = left * right;
		context.addSolutionStep("*", left, right, result);
		return result;
	}

}
