package ir.patterns.behavioral.iterator.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

	private Map<Integer, List<Integer>> adjacencyList;

	public Graph() {
		this.adjacencyList = new HashMap<>();
	}

	public void addEdge(Integer source, Integer target) {
		List<Integer> list = null;
		if (this.adjacencyList.keySet().contains(source)) {
			list = this.adjacencyList.get(source);
			if (list == null) {
				list = new ArrayList<>();
			}
			list.add(target);
			this.adjacencyList.put(source, list);
		} else {
			this.adjacencyList.put(source, new ArrayList<>(Arrays.asList(target)));
		}

	}

	public List<Integer> getAdjaceny(Integer source) {
		List<Integer> list = this.adjacencyList.get(source);
		return list != null ? list : new ArrayList<>();
	}

}
