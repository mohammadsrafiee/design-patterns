package ir.patterns.bihavioral.visitor.impl;

public interface IFile {
	
	int getSize();

	String accept(IVisitor visitor);
}
