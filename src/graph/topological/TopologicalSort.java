package graph.topological;

import java.util.Stack;

public class TopologicalSort {

	private Stack<Vertex> stack;

	public TopologicalSort() {
		this.stack = new Stack<>();
	}

	public void dfs(Vertex vertex) {
		vertex.setVisited(true);
		for (Vertex v : vertex.getNeighborLis()) {
			if (!v.isVisited()) {
				dfs(v);
			}
		}
		getStack().push(vertex);
	}

	public Stack<Vertex> getStack() {
		return this.stack;
	}

}
