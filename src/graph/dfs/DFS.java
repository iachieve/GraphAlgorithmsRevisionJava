package graph.dfs;

import java.util.List;
import java.util.Stack;

public class DFS {

	private Stack<Vertex> stack;

	public DFS() {
		stack = new Stack<>();
	}

	// recursive
	public void dfsRecursive(List<Vertex> vertexList) {
		for (Vertex v : vertexList) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsWithRecursion(v);
			}
		}
	}

	private void dfsWithRecursion(Vertex v) {
		System.out.println(v + " ");
		for (Vertex vertex : v.getNeighborList()) {
			if (!vertex.isVisited()) {
				vertex.setVisited(true);
				dfsWithRecursion(vertex);
			}
		}
	}

	// iterative
	public void dfsIterative(List<Vertex> vertexList) {
		for (Vertex v : vertexList) {
			if (!v.isVisited()) {
				v.setVisited(true);
				dfsWithStack(v);
			}
		}
	}

	private void dfsWithStack(Vertex rootVertex) {

		this.stack.add(rootVertex);
		rootVertex.setVisited(true);

		while (!stack.isEmpty()) {
			Vertex actualVertex = this.stack.pop();
			System.out.print(actualVertex + " ");

			for (Vertex v : actualVertex.getNeighborList()) {
				v.setVisited(true);
				this.stack.push(v);
			}
		}
	}
}
