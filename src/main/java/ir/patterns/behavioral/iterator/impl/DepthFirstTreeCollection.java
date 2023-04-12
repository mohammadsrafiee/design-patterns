package ir.patterns.behavioral.iterator.impl;

/**
 * {@link DepthFirstTreeCollection} and {@link BreadthFirstTreeCollection} are
 * concrete implementations of the {@link ITreeCollection} interface.
 * {@link DepthFirstTreeCollection} creates the {@link DepthFirstIterator} while
 * {@link BreadthFirstTreeCollection} creates the {@link BreadthFirstIterator}.
 * Also, both of these collections stores the {@link Graph} object to save the
 * tree data structure itself.
 */
public class DepthFirstTreeCollection implements ITreeCollection {

	private Graph graph;

	public DepthFirstTreeCollection(Graph graph) {
		this.graph = graph;
	}

	@Override
	public ITreeIterator createIterator() {
		return new DepthFirstIterator(this);
	}

	@Override
	public String getTitle() {
		return "Depth-firs";
	}

	public Graph getGraph() {
		return graph;
	}
}
