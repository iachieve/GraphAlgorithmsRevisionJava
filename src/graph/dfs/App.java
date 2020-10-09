package graph.dfs;

import java.util.ArrayList;
import java.util.List;

public class App {

	private static List<Vertex> vertexsList() {
		Vertex vertex1 = new Vertex("1");
		Vertex vertex2 = new Vertex("2");
		Vertex vertex3 = new Vertex("3");
		Vertex vertex4 = new Vertex("4");
		Vertex vertex5 = new Vertex("5");

		vertex1.addNeighbor(vertex2);
		vertex1.addNeighbor(vertex3);
		vertex3.addNeighbor(vertex4);
		vertex4.addNeighbor(vertex5);

		List<Vertex> list = new ArrayList<>();

		list.add(vertex1);
		list.add(vertex2);
		list.add(vertex3);
		list.add(vertex4);
		list.add(vertex5);

		return list;
	}

	public static void main(String[] args) {

		DFS dfs = new DFS();
		dfs.dfsIterative(vertexsList());

		System.out.println("\n------------");
		dfs.dfsRecursive(vertexsList());
	}

}
