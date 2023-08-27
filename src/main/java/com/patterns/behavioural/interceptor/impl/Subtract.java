package com.patterns.behavioural.interceptor.impl;

/**
 * {@link Subtract} a nonterminal expression of the subtraction operation
 */
public class Subtract implements IExpression {

	private IExpression left;
	private IExpression right;

	public Subtract(IExpression left, IExpression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int interpret(ExpressionContext context) {
		int left = this.left.interpret(context);
		int right = this.right.interpret(context);
		int result = left - right;
		context.addSolutionStep("-", left, right, result);
		return result;
	}

}
