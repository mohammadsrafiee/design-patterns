package ir.patterns.behavioral.interceptor.impl;

import java.util.ArrayList;
import java.util.List;

import ir.patterns.behavioral.interceptor.InterceptorExample;

/**
 * {@link ExpressionContext} class contains the solution steps of the postfix
 * expression and is used by the {@link InterceptorExample} to retrieve those
 * steps and the {@link IExpression} interface implementing classes to add a
 * specific solution step to the context
 */
public class ExpressionContext {

	private List<String> solutionSteps;

	public ExpressionContext() {
		this.solutionSteps = new ArrayList<String>();
	}

	public List<String> getSolutionSteps() {
		return solutionSteps;
	}

	public void addSolutionStep(String operatorSymbol, int left, int right, int result) {
		StringBuffer buffer = new StringBuffer("");
		buffer.append(this.solutionSteps.size() + 1);
		buffer.append(")");
		buffer.append(left);
		buffer.append(" ");
		buffer.append(operatorSymbol);
		buffer.append(" ");
		buffer.append(right);
		buffer.append(" = ");
		buffer.append(result);
		solutionSteps.add(buffer.toString());
	}
}
