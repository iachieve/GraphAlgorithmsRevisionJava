package graph.topological;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {

	public static void main(String[] args) {

		Vertex vertex0 = new Vertex(0);
		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);

		vertex2.addNeighborVertex(vertex3);
		vertex3.addNeighborVertex(vertex1);

		vertex4.addNeighborVertex(vertex0);
		vertex4.addNeighborVertex(vertex1);

		vertex5.addNeighborVertex(vertex0);
		vertex5.addNeighborVertex(vertex1);

		List<Vertex> list = new ArrayList<>();

		list.add(vertex0);
		list.add(vertex1);
		list.add(vertex2);
		list.add(vertex3);
		list.add(vertex4);
		list.add(vertex5);

		TopologicalSort topologicalSort = new TopologicalSort();
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).isVisited()) {
				topologicalSort.dfs(list.get(i));
			}
		}

		Stack<Vertex> stack = topologicalSort.getStack();

		for (int i = 0; i < list.size(); i++) {
			Vertex vertex = stack.pop();
			System.out.print(vertex + " -> ");
		}

	}

}
