package ir.patterns.behavioral.iterator;

import ir.patterns.behavioral.iterator.impl.BreadthFirstTreeCollection;
import ir.patterns.behavioral.iterator.impl.DepthFirstTreeCollection;
import ir.patterns.behavioral.iterator.impl.Graph;
import ir.patterns.behavioral.iterator.impl.ITreeIterator;

public class IteratorExample {

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addEdge(1, 2);
		graph.addEdge(2, 7);
		graph.addEdge(2, 8);
		
		graph.addEdge(1, 3);
		graph.addEdge(3, 9);
		graph.addEdge(3, 10);
		graph.addEdge(10, 16);
		graph.addEdge(10, 17);
		graph.addEdge(3, 11);
		
		graph.addEdge(1, 4);
		graph.addEdge(4, 12);
		graph.addEdge(4, 13);
		
		graph.addEdge(1, 5);
		graph.addEdge(1, 6);
		graph.addEdge(6, 14);
		graph.addEdge(6, 15);
		

		{
			System.out.println("---------------BreadthFirst----------------");
			BreadthFirstTreeCollection breadthFirstTreeCollection = new BreadthFirstTreeCollection(graph);
			ITreeIterator iterator = breadthFirstTreeCollection.createIterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + " ,");
			}
		}
		
		System.out.println("");
		{
			System.out.println("---------------DepthFirst----------------");
			DepthFirstTreeCollection depthFirstTreeCollection = new DepthFirstTreeCollection(graph);
			ITreeIterator iterator = depthFirstTreeCollection.createIterator();
			while (iterator.hasNext()) {
				System.out.print(iterator.next() + " ,");
			}
		}
	}
}
