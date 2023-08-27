package ir.patterns.behavioural.interceptor.impl;

/**
 * Given a language, define a representation for its grammar along with an
 * interpreter that uses representation to interpret sentences in the language.
 * 
 * {@link IExpression} defines a common interface for both terminal and
 * nonterminal expressions which implement the interpret() method.
 */
public interface IExpression {

	int interpret(ExpressionContext context);
}
