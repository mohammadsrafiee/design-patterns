package com.patterns.behavioural.interceptor.impl;

/**
 * {@link Add} a nonterminal expression of the addition operation
 */
public class Add implements IExpression {
    private final IExpression left;
    private final IExpression right;


    /**
     * @param left
     * @param right
     */
    public Add(IExpression left, IExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(ExpressionContext context) {
        int left = this.left.interpret(context);
        int right = this.right.interpret(context);
        int result = left + right;
        context.addSolutionStep("+", left, right, result);
        return result;
    }
}
