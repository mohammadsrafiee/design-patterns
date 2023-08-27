package com.patterns.behavioural.iterator.impl;

/**
 * provide a way to access the elements of an aggregate object sequentially
 * without exposing its underlying representation.
 * 
 * {@link ITreeIterator} defines a common interface for all specific iterators
 * of the tree collection
 */
public interface ITreeIterator {

	//

	/**
	 * Returns true if the iterator did not reach the end of the collection yet,
	 * otherwise false;
	 * 
	 * @return boolean
	 */
	boolean hasNext();

	/**
	 * returns the next value of the collection
	 * 
	 * @return {@link Integer}
	 */
	Integer next();

	/**
	 * resets the iterator and sets the current position of it to the beginning
	 */
	void reset();
}
