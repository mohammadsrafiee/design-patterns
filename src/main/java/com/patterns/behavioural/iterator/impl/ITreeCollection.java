package com.patterns.behavioural.iterator.impl;

/**
 * {@link ITreeCollection} ITreeCollection defines a common interface for all
 * the specific tree collections.
 */
public interface ITreeCollection {

	/**
	 * creates an iterator for the specific tree collection
	 * 
	 * @return {@link ITreeCollection}
	 */
	ITreeIterator createIterator();

	/**
	 * returns the title of the tree collection
	 * 
	 * @return String
	 */
	String getTitle();

	/**
	 *
	 * @return
	 */
	Graph getGraph();
}
