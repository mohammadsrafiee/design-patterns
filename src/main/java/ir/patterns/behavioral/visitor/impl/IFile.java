package ir.patterns.behavioral.visitor.impl;

public interface IFile {
	
	int getSize();

	String accept(IVisitor visitor);
}
