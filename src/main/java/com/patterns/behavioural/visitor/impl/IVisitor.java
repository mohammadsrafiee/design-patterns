package com.patterns.behavioural.visitor.impl;

/**
 * Represent an operation to be performed on the element of an object structure
 * Visitor lets you define a new operation without changing the classes of the
 * elements on which it operates.
 */
public interface IVisitor {

	/**
	 * this method show textFile
	 * 
	 * @param file {@link TextFile}
	 * @return String for TextFile representation
	 */
	String visitTextFile(TextFile file);

	/**
	 * this method show ImageFile
	 * 
	 * @param file {@link ImageFile}
	 * @return String for ImageFile representation
	 */
	String visitImageFile(ImageFile file);

	/**
	 * 
	 * 
	 * @param file {@link Directory}
	 * @return String for directory representation
	 */
	String visitDirectory(Directory file);
}
