package ir.patterns.behavioural.visitor.impl;

public interface IFile {
	
	int getSize();

	String accept(IVisitor visitor);
}
