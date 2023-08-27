package ir.patterns.behavioural.iterator.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * {@link DepthFirstIterator} and {@link BreadthFirstIterator} are concrete
 * implementations of the {@link ITreeIterator} interface.
 * {@link DepthFirstIterator} implements the depth-first algorithm to traverse
 * the tree collection. Correspondingly, {@link BreadthFirstIterator} implements
 * the breadth-first algorithm. The main difference between these two algorithms
 * is the order in which all of the nodes are visited. Hence, the depth-first
 * algorithm is implemented using the stack data structure while the
 * breadth-first algorithm uses the queue data structure to store nodes
 * (vertices) which should be visited next.
 */
public class DepthFirstIterator implements ITreeIterator {

	private Graph graph;
	private List<Integer> visitedNodes;
	private Stack<Integer> stack;
	private Integer currentNode;

	public DepthFirstIterator(ITreeCollection collection) {
		this.visitedNodes = new ArrayList<Integer>();
		this.stack = new Stack<>();
		this.graph = collection.getGraph();
		// initialize stack by 1 (1 is first of node in graph)
		// you can get first node in graph from Graph Object by changing implementation
		this.currentNode = 1;
		this.stack.push(this.currentNode);
	}

	@Override
	public boolean hasNext() {
		return !this.stack.isEmpty();
	}

	@Override
	public Integer next() {
		if (!hasNext()) {
			return null;
		}
		this.currentNode = this.stack.pop();
		this.visitedNodes.add(this.currentNode);
		List<Integer> adjaceny = this.graph.getAdjaceny(currentNode);
		if (adjaceny != null) {
			for (Integer target : adjaceny) {
				boolean isVisited = false;
				for (Integer visited : visitedNodes) {
					if (visited == target) {
						isVisited = true;
						break;
					}
				}
				if (!isVisited) {
					this.stack.push(target);
				}
			}
		}
		return currentNode;
	}

	@Override
	public void reset() {
		this.visitedNodes = new ArrayList<>();
		this.currentNode = null;
		this.stack.clear();
	}
}
